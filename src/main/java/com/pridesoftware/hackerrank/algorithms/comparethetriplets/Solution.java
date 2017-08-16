package com.pridesoftware.hackerrank.algorithms.comparethetriplets;

import java.util.Scanner;

public class Solution {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        // Complete this function
        return solve(new int[]{a0,a1,a2}, new int[]{b0,b1,b2}, 3);
    }

    static int[] solve(int[] a, int[] b, int length){
        int[] score = new int[]{0,0};

        for (int i = 0; i < length; i++){
            if (a[i] > b[i]) score[0]++;
            else if (b[i] > a[i]) score[1]++;
        }
        return score;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


    }
}

