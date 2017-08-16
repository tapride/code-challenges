/**
 * REVERSE AND ADD
 *
 * CHALLENGE DESCRIPTION:
 *
 * Credits: Programming Challenges by Steven S. Skiena and Miguel A. Revilla
 *
 * The problem is as follows: choose a number, reverse its digits and add it to the original. If the sum is not a
 * palindrome (which means, it is not the same number from left to right and right to left), repeat this procedure.
 *
 * For example:
 *
 * 195 (initial number) + 591 (reverse of initial number) = 786
 * 786 + 687 = 1473
 * 1473 + 3741 = 5214
 * 5214 + 4125 = 9339 (palindrome)
 *
 * In this particular case the palindrome 9339 appeared after the 4th addition. This method leads to palindromes in a
 * few step for almost all of the integers. But there are interesting exceptions. 196 is the first number for which no
 * palindrome has been found. It is not proven though, that there is no such a palindrome.
 *
 * INPUT SAMPLE:
 *
 * 195
 *
 * Your program should accept as its first argument a path to a filename. Each line in this file is one test case. Each
 * test case will contain an integer n < 10,000. Assume each test case will always have an answer and that it is
 * computable with less than 100 iterations (additions).
 *
 * OUTPUT SAMPLE:
 *
 * For each line of input, generate a line of output which is the number of iterations (additions) to compute the
 * palindrome and the resulting palindrome. (they should be on one line and separated by a single space character).
 *
 * For example:
 *
 * 4 9339
 *
 */

package com.pridesoftware.codeeval.moderate.reverseandadd;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {


    public static void main(String[] args){
        String fileName = args[0];

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while((line = bufferedReader.readLine()) != null){
                String sentence = reverseAndAdd(line);
                System.out.println(sentence);
            }

        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    protected static String reverseAndAdd(String line){
        int itterations = 0;

        long value = Long.valueOf(line);

        for (int i = 0 ; i <= 100; i++ ){
            value = addReverse(value);
            itterations++;

            if (isPalindrome(value)){
                return String.valueOf(itterations) + " " + String.valueOf(value);
            }
        }

        return "";
    }

    protected static long addReverse(long value){
        String[] strValue = String.valueOf(value).split("");
        StringBuilder strBld = new StringBuilder();

        for (int i = strValue.length-1; i >= 0; i--){
            strBld.append(strValue[i]);
        }

        long value2 = Long.parseLong(strBld.toString());

        return value + value2;

    }

    public static boolean isPalindrome(long aNumber){
        boolean isPalindrome = true;
        String aNumberString = String.valueOf(aNumber);

        if (aNumberString.length() == 1)
            return isPalindrome;

        int valueA = 0;
        int valueB = aNumberString.length()-1;
        do {
            if (aNumberString.charAt(valueA) != aNumberString.charAt(valueB)){
                isPalindrome = false;
                break;
            }
            valueA++;
            valueB--;
        }while(valueA <= valueB);

        return isPalindrome;
    }

}
