package com.pridesoftware.hackerrank.algorithms.aVeryBigSum;


import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testAVeryBigSum(){
        long[] inArray = new long[]{1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
        int inLength = 5;
        long expected = 5000000015L;
        long actual = Solution.aVeryBigSum(inLength, inArray);
        Assert.assertEquals(expected, actual);
    }
}
