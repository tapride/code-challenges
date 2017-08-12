/**
 * AUTHOR: Tom Pride (PrideThomasA@PrideFamily.us)
 *
 * DESCRIPTION:
 * Everything in com.pridesoftware.codeeval.fizbuzz is for the Fizz Buzz challenge on CodeEval.com.
 * https://www.codeeval.com/open_challenges/1/
 *
 *
 *
 * CHALLENGE DESCRIPTION:
 *
 * Players generally sit in a circle. The first player says the number �1�, and each player says next number in
 * turn. However, any number divisible by X (for example, three) is replaced by the word fizz, and any divisible
 * by Y (for example, five) by the word buzz. Numbers divisible by both become fizz buzz. A player who hesitates,
 * or makes a mistake is eliminated from the game.
 *
 * Write a program that prints out the final series of numbers where those divisible by X, Y and both are
 * replaced by �F� for fizz, �B� for buzz and �FB� for fizz buzz.
 *
 * INPUT SAMPLE:
 * Your program should accept a file as its first argument. The file contains multiple separated lines; each
 * line contains 3 numbers that are space delimited. The first number is the first divider (X), the second number
 * is the second divider (Y), and the third number is how far you should count (N). You may assume that the input
 * file is formatted correctly and the numbers are valid positive integers.
 *
 * For example:
 * 3 5 10
 * 2 7 15
 *
 * OUTPUT SAMPLE:
 * 1 2 F 4 B F 7 8 F B
 * 1 F 3 F 5 F B F 9 F 11 F 13 FB 15
 * Print out the series 1 through N replacing numbers divisible by X with �F�, numbers divisible by Y with �B�
 * and numbers divisible by both with �FB�. Since the input file contains multiple sets of values, your output
 * should print out one line per set. Ensure that there are no trailing empty spaces in each line you print.
 *
 * CONSTRAINTS:
 * The number of test cases ? 20
 * "X" is in range [1, 20]
 * "Y" is in range [1, 20]
 * "N" is in range [21, 100]
 *
 *
 * Input sample files can be found in input/FizzBuzz/
 *
 **/

package com.pridesoftware.codeeval.fizzbuzz;

import java.io.*;

@SuppressWarnings("LossyEncoding")
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] line_parts = line.split(" ");
            int x = Integer.parseInt(line_parts[0]);
            int y = Integer.parseInt(line_parts[1]);
            int limit = Integer.parseInt(line_parts[2]);
            FizzBuzz(x,y,limit);
        }
    }

    public static void FizzBuzz(int x, int y, int limit){
        for (int index = 1; index <= limit; index++){

            int fizz = index % x;
            int buzz = index % y;

            if(index > 1){
                System.out.print(" ");
            }

            if (fizz == 0 && buzz == 0){
                System.out.print("FB");
            }
            else if (fizz == 0){
                System.out.print("F");
            }
            else if (buzz == 0){
                System.out.print("B");
            }
            else{
                System.out.print(index);
            }
        }

        System.out.println("");
    }
}
