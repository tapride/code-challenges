/**
 *
 * BIT POSITIONS
 *
 * CHALLENGE DESCRIPTION:
 * Given a number n and two integers p1,p2 determine if the bits in position p1 and p2 are the same or not. Positions
 * p1 and p2 are 1 based.
 *
 * INPUT SAMPLE:
 *
 * The first argument will be a path to a filename containing a comma separated list of 3 integers, one list
 * per line. E.g.
 *
 * 86,2,3
 * 125,1,2
 *
 * OUTPUT SAMPLE:
 *
 * Print to stdout, 'true'(lowercase) if the bits are the same, else 'false'(lowercase). E.g.
 *
 * true
 * false
 */

package com.pridesoftware.codeeval.easy.bitpositions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {


    public static void main(String[] args){
        String fileName = args[0];

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while((line = bufferedReader.readLine()) != null){
                String sentence = bitPositions(line);
                System.out.println(sentence);
            }

        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    protected static String bitPositions(String line){
        String[] splitLine = line.split(",");
        String bitArray = Integer.toBinaryString(Integer.parseInt(splitLine[0]));

        int index1 = bitArray.length() - Integer.parseInt(splitLine[1]);
        int index2 = bitArray.length() - Integer.parseInt(splitLine[2]);

        return Boolean.toString (bitArray.charAt(index1) == bitArray.charAt(index2)).toLowerCase();

    }
}
