package com.pridesoftware.hackerrank.algorithms.DiagonalDifference;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args)
            throws IOException
    {
        diagonalDifference(System.out, System.in, args);
    }

    protected static void diagonalDifference(OutputStream outContent, InputStream inContent, String args[])
            throws IOException
    {
        System.setOut(new PrintStream(outContent));
        Scanner in = new Scanner(inContent);

        int[][] arr = readArray(in);
        int p = calculatePrimaryDiagonal(arr);
        int s = calculateSecondaryDiagonal(arr);
        int value = Math.abs(p-s);
        System.out.print(value);

    }

    protected static int[][] readArray(Scanner in){
        int n = in.nextInt();
        int[][] arr = new int[n][n];

        for (int r = 0; r < n; r++){
            for (int c = 0; c < n ; c++){
                arr[r][c] = in.nextInt();
            }
        }
        return arr;
    }

    protected static int calculatePrimaryDiagonal(int[][] arr){
        int sum = 0;
        for (int i = 0 ; i < arr.length ; i++){
            sum += arr[i][i];
        }
        return sum;
    }

    protected static int calculateSecondaryDiagonal(int[][] arr){
        int sum = 0;
        for (int i = 0 ; i < arr.length ; i++){
            sum += arr[i][(arr.length - 1) - i];
        }
        return sum;
    }

}