package com.pridesoftware.hackerrank.algorithms.DiagonalDifference;

import sun.jvm.hotspot.HelloWorld;

import java.io.*;
import java.util.*;

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
        System.out.println("Hello world!");

    }

    protected static int[][] readArray(Scanner in){
      return null;
    }

    protected static int calculatePrimaryDiagonal(int[][] arr){
        return 0;
    }

    protected static int calculateSecondaryDiagonal(int[][] arr){
        return 0;
    }

}