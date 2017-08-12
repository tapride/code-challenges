/**
 * PRIME PALINDROME
 *
 * CHALLENGE DESCRIPTION:
 *
 * Write a program which determines the largest prime palindrome less than 1000.
 *
 * INPUT SAMPLE:
 *
 * There is no input for this program.
 *
 * OUTPUT SAMPLE:
 *
 * Print to stdout the largest prime palindrome less than 1000.
 *
 * 929
 */


package com.pridesoftware.codeeval.easy.primepalindrome;


public class Main {

    public static void main(String[] args) {
        int[] primeNumbers = getPrimes(1000);
        int greatestPrimePalindrome = -1;
        for (int i = primeNumbers.length -1 ; i >= 0; i--)
        {
            if (isPalindrome(primeNumbers[i])){
                System.out.println(primeNumbers[i]);
                break;
            }

        }


    }

    public static int[] getPrimes(int lessThanEqualTo){
        int[] primeNumbers = new int[]{2};

        for (int i = 3; i <= lessThanEqualTo; i++){

            boolean isPrime = true;

            for (int j = 0; j < primeNumbers.length; j++){
                   if (i % primeNumbers[j] == 0){
                       isPrime = false;
                       break;
                   }
               }

            if (isPrime){
                int[] temp = primeNumbers;
                primeNumbers = new int[temp.length+1];
                System.arraycopy(temp, 0, primeNumbers, 0, temp.length);
                primeNumbers[primeNumbers.length-1] = i;
            }

        }

        return primeNumbers;
    }

    public static boolean isPalindrome(int aNumber){
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


