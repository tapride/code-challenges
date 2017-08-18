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
        
    }
}