package com.pridesoftware.hackerrank.algorithms.plusminus;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        plusMinus(System.out, System.in, args);
    }

    protected static void plusMinus(OutputStream outputStream, InputStream inputStream, String[] args)
    {
        System.setOut(new PrintStream(outputStream));
        Scanner in = new Scanner(inputStream);

        int size = in.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(String.format("%7.6f",fractionPositive(arr)));
        System.out.println(String.format("%7.6f",fractionNegative(arr)));
        System.out.println(String.format("%7.6f",fractionZero(arr)));
    }

    protected static double fractionPositive(int[] arr){
        int count = 0;
        int total = arr.length;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0)
                count++;
        }
        return (double)count / (double)total;

    }

    protected static double fractionNegative(int[] arr){
        int count = 0;
        int total = arr.length;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 0)
                count++;
        }
        return (double)count / (double)total;
    }

    protected static double fractionZero(int[] arr){
        int count = 0;
        int total = arr.length;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0)
                count++;
        }
        return (double)count / (double)total;
    }
}