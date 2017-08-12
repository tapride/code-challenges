/**
 *
 * DETECTING CYCLES
 *
 * CHALLENGE DESCRIPTION:
 * Given a sequence, write a program to detect cycles within it.
 *
 * INPUT SAMPLE:
 * Your program should accept as its first argument a path to a filename containing a sequence of numbers (space
 * delimited). The file can have multiple such lines. E.g
 *
 * 2 0 6 3 1 6 3 1 6 3 1
 * 3 4 8 0 11 9 7 2 5 6 10 1 49 49 49 49
 * 1 2 3 1 2 3 1 2 3
 *
 * OUTPUT SAMPLE:
 * Print to stdout the first cycle you find in each sequence. Ensure that there are no trailing empty spaces on
 * each line you print. E.g.
 *
 * 6 3 1
 * 49
 * 1 2 3
 *
 * The cycle detection problem is explained more widely on wiki http://en.wikipedia.org/wiki/Cycle_detection
 *
 * Constrains:
 * The elements of the sequence are integers in range [0, 99]
 * The length of the sequence is in range [0, 50]
 *
 */

package com.pridesoftware.codeeval.moderate.detectingCycles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {

    public static void main(String[] args){

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]))) {
            String line;
            while((line = bufferedReader.readLine()) != null){
                String lineOut = processLine(line);
                System.out.println(lineOut);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String processLine(String line){

        String[] splitLine = line.split("\\s");

        int[] firstMatch = findIndexOfFirstMatch(splitLine);

        if (firstMatch == null || firstMatch.length != 2){
            return null;
        }
        else if (firstMatch[0]+1 == firstMatch[1]){
            return splitLine[firstMatch[0]];
        }
        else{
            int offset = 0;
            StringBuilder sb = new StringBuilder();

            while (true){

                if (splitLine[firstMatch[0]+offset].equals(splitLine[firstMatch[1]+offset])){
                    if (offset > 0){
                        sb.append(" ");
                    }
                    sb.append(splitLine[firstMatch[0]+offset]);
                }
                else
                {
                    break;
                }

                offset++;
                if (firstMatch[0] + offset >= splitLine.length || firstMatch[1] + offset >= splitLine.length
                        || firstMatch[0] + offset >= firstMatch[1] ){
                    break;
                }
            }

            return sb.toString();
        }

    }

    public static int[] findIndexOfFirstMatch(String[] splitLine){
        for (int i = 0; i < splitLine.length ; i++){
            for(int j = i+1 ; j < splitLine.length ; j++){
                if (splitLine[i].equals(splitLine[j])) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static int findIndexOfMatchEnding(String line, int[] matchStart){
        int offset = 1;
        return -1;
    }

}
