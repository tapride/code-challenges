/**
 * AUTHOR: Tom Pride (PrideThomasA@PrideFamily.us)
 *
 * DESCRIPTION:
 * Everything in com.pridesoftware.codeeval.sumofprimes is for the Sum of Primes challenge on CodeEval.com.
 * https://www.codeeval.com/open_challenges/4/
 * *
 * CHALLENGE DESCRIPTION:
 * Write a program which determines the sum of the first 1000 prime numbers.
 *
 * INPUT SAMPLE:
 * There is no input for this program.
 *
 * OUTPUT SAMPLE:
 * Print to stdout the sum of the first 1000 prime numbers.
 * 3682913
 *
 */

package com.pridesoftware.codeeval.sumofprimes;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args){
        System.out.println(solution1());
    }

    private static String solution1(){
        int[] primeNumbers = new int[]{2};

        int num = 3;

        while (primeNumbers.length < 1000){
            boolean isPrime = true;

            for (int primeNumber : primeNumbers) {
                if (num % primeNumber == 0) {
                    isPrime = false;
                }
            }

            if (isPrime){
                int[] temp = primeNumbers;
                primeNumbers = new int[temp.length+1];
                System.arraycopy(temp, 0, primeNumbers, 0, temp.length);
                primeNumbers[primeNumbers.length-1] = num;
            }

            num++;
        }

        return String.valueOf(IntStream.of(primeNumbers).sum());

    }



}
