
/**
 * AUTHOR: Tom Pride (PrideThomasA@PrideFamily.us)
 *
 * DESCRIPTION:
 * Everything in com.pridesoftware.codeeval.happynumbers is for the Happy Numbers challenge on CodeEval.com.
 * https://www.codeeval.com/open_challenges/39/
 *
 * CHALLENGE DESCRIPTION:
 * A happy number is defined by the following process. Starting with any positive integer, replace the number by the
 * sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it
 * loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are
 * happy numbers, while those that do not end in 1 are unhappy numbers.
 *
 * INPUT SAMPLE:
 * The first argument is the pathname to a file which contains test data, one test case per line. Each line
 * contains a positive integer. E.g.
 * 1
 * 7
 * 22
 *
 * OUTPUT SAMPLE:
 * If the number is a happy number, print out 1. If not, print out 0. E.g
 * 1
 * 1
 * 0
 *
 * For the curious, here's why 7 is a happy number: 7->49->97->130->10->1.
 * Here's why 22 is NOT a happy number: 22->8->64->52->29->85->89->145->42->20->4->16->37->58->89 ...
 *
 *
 */

package com.pridesoftware.codeeval.happynumbers;

import java.io.*;

public class Main {

    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            int num = Integer.valueOf(line);
            int result = isNumberHappy(num);
            System.out.println(result);
        }
    }


    public static int isNumberHappy(int num)
    {
        int currentValue = num;

        do {
              currentValue = calculateNextNumber(currentValue);
        }while (currentValue != 1 && currentValue !=4);

        if (currentValue == 1){
            return 1;
        }
        else {
            return 0;
        }
    }

    public static int[] breakNumberIntoDigits(int num)
    {
        String numberAsString = String.valueOf(num);
        int[] arrayOfDigits = new int[numberAsString.length()];

        for (int i = 0; i < numberAsString.length(); i++)
        {
            int intVal = Integer.valueOf(String.valueOf(numberAsString.charAt(i)));
            arrayOfDigits[i] = intVal;
        }
        return arrayOfDigits;
    }


    public static int calculateNextNumber(int currentNumber)
    {
        int digits[] = breakNumberIntoDigits(currentNumber);
        int sum = 0;
        for (int i = 0; i < digits.length; i++)
        {
            sum += digits[i] * digits[i];
        }
        return sum;  //sum is the next number
    }
}