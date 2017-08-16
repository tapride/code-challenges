package com.pridesoftware.hackerrank.algorithms.solvemefirst;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testSolveMeFirst1(){
        int a = 4;
        int b = 7;
        int expected = 11;
        int actual = Solution.solveMeFirst(a,b);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSolveMeFirst2(){
        int a = 3;
        int b = 1;
        int expected = 4;
        int actual = Solution.solveMeFirst(a,b);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSolveMeFirst3(){
        int a = 185;
        int b = 623;
        int expected = 808;
        int actual = Solution.solveMeFirst(a,b);
        Assert.assertEquals(expected, actual);
    }
}
