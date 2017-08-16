package com.pridesoftware.hackerrank.algorithms.simpleArraySum;


import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testSimpleArraySum1(){
        int[] inputArray = {1,2,3,4};
        int inputArrayLength = 4;
        int expected = 1+2+3+4;
        int actual = Solution.simpleArraySum(inputArrayLength,inputArray);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSimpleArraySum2(){
        int[] inputArray = {10,73,9};
        int inputArrayLength = 3;
        int expected = 10+73+9;
        int actual = Solution.simpleArraySum(inputArrayLength,inputArray);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSimpleArraySum3(){
        int[] inputArray = {10,73,9,8};
        int inputArrayLength = 4;
        int expected = 10+73+9+8;
        int actual = Solution.simpleArraySum(inputArrayLength,inputArray);
        Assert.assertEquals(expected, actual);
    }


}
