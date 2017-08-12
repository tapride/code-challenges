/**
 *
 * MTH TO LAST ELEMENT
 *
 * CHALLENGE DESCRIPTION:
 *
 * Write a program which determines the Mth to the last element in a list.
 *
 * INPUT SAMPLE:
 *
 * The first argument is a path to a file. The file contains the series of space delimited characters followed
 * by an integer. The integer represents an index in the list (1-based), one per line.
 *
 * For example:
 *
 * a b c d 4
 * e f g h 2
 *
 * OUTPUT SAMPLE:
 *
 * Print to stdout the Mth element from the end of the list, one per line. If the index is larger than the number
 * of elements in the list, ignore that input.
 *
 * For example:
 * a
 * g
 *
 *
 */

package com.pridesoftware.codeeval.moderate.MthToLastElement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args){

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]))) {
            String line;
            while((line = bufferedReader.readLine()) != null){
                String lineOut = processLine(line);
                if (lineOut != null)
                    System.out.println(lineOut);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String processLine(String line) {
        String[] splitLine = line.split("\\s");
        int value = Integer.parseInt(splitLine[splitLine.length - 1]);
        int index = splitLine.length - (value + 1);
        if (index < (splitLine.length - 1) && index >= 0 ) {
            return splitLine[index];
        } else {
            return null;
        }
    }


}


