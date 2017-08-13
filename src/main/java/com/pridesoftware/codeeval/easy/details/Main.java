/**
 *
 * DETAILS
 * CHALLENGE DESCRIPTION:
 *
 * There are two details on a M*N checkered field. The detail X covers several (at least one first cell) cells in each
 * line. The detail Y covers several (at least one last cell) cells. Each cell is either fully covered with a
 * detail or not.
 *
 * For example:
 *
 *  X X . Y Y
 *  X X X . Y
 *  X . . Y Y
 *  X X . . Y
 *
 * Also, the details may have cavities (or other complex structures). Please see example
 * below (the detail Y is one detail):
 *
 *  X X X . Y Y Y Y
 *  X . . . Y . . Y
 *  X X . . Y Y Y Y
 *  X . . . . . Y Y
 *  X X . . . . Y Y
 *
 *
 * The detail Y starts moving left (without any turn) until it bumps into the X detail at least with one cell.
 * Determine by how many cells the detail Y will be moved.
 *
 * INPUT SAMPLE:
 *
 * The first argument is a file with different test cases. Each test case contains a matrix the lines of which are
 * separated by comma. (Empty cells are marked as ".")
 *
 * For example:
 *
 * XX.YY,XXX.Y,X..YY,XX..Y
 * XXX.YYYY,X...Y..Y,XX..YYYY,X.....YY,XX....YY
 * XX...YY,X....YY,XX..YYY,X..YYYY
 * XXYY,X..Y,XX.Y
 *
 * OUTPUT SAMPLE:
 *
 * Print out the number of cells the detail Y will be moved.
 *
 * For example:
 *
 * 1
 * 1
 * 2
 * 0
 *
 * CONSTRAINTS:
 *
 * The matrices can be of different M*N sizes. (2 <= M <= 10, 2 <= N <= 10)
 * Number of test cases is 40.
 *
 */

package com.pridesoftware.codeeval.easy.details;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args){
        String fileName = args[0];

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while((line = bufferedReader.readLine()) != null){
                String recoveredSentence = processField(line);
                System.out.println(recoveredSentence);
            }

        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    protected static String processField(String line) {
        String[] mapRows = line.split(",");
        int moves = -1;

        for (String row: mapRows) {
            int rowMoves = maxMoves(row);
            if (moves == -1 || moves > rowMoves){
                moves = rowMoves;
            }
        }

        return String.valueOf(moves);
    }

    protected static int maxMoves(String mapRow){
        int indexFirstY = mapRow.indexOf("Y");
        int indexLastX = mapRow.lastIndexOf("X");
        int moves = indexFirstY - (indexLastX + 1);
        return moves;
    }

}
