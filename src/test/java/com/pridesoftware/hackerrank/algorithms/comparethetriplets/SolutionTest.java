package com.pridesoftware.hackerrank.algorithms.comparethetriplets;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testSolve1(){
        int[] a = new int[]{5,6,7};
        int[] b = new int[]{3,6,10};
        int[] expected = new int[]{1,1};
        int[] actual = Solution.solve(a[0],a[1],a[2],b[0],b[1],b[2]);
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void testSolve2(){
        int[] a = new int[]{6,8,20};
        int[] b = new int[]{3,6,10};
        int[] expected = new int[]{3,0};
        int[] actual = Solution.solve(a[0],a[1],a[2],b[0],b[1],b[2]);
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void testSolve3(){
        int[] a = new int[]{1,4,8};
        int[] b = new int[]{3,6,10};
        int[] expected = new int[]{0,3};
        int[] actual = Solution.solve(a[0],a[1],a[2],b[0],b[1],b[2]);
        Assert.assertArrayEquals(expected,actual);
    }
}
