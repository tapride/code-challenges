/**
 * SUM OF DIGITS
 *
 * CHALLENGE DESCRIPTION:
 *
 * Given a positive integer, find the sum of its constituent digits.
 *
 * INPUT SAMPLE:
 *
 * The first argument will be a path to a filename containing positive integers, one per line. E.g.
 *
 * 23
 * 496
 *
 * OUTPUT SAMPLE:
 *
 * Print to stdout, the sum of the numbers that make up the integer, one per line. E.g.
 *
 * 5
 * 19
 */

package com.pridesoftware.codeeval.easy.sumofdigits;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args){
        String fileName = args[0];

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while((line = bufferedReader.readLine()) != null){
                String sentence = sumOfDigits(line);
                System.out.println(sentence);
            }

        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    protected static String sumOfDigits(String line){
        char[] numbers = line.toCharArray();
        int sum = 0;

        for (char c: numbers) {
            int i = Integer.parseInt(String.valueOf(c));
            sum += i;
        }

        return String.valueOf(sum);
    }
}
