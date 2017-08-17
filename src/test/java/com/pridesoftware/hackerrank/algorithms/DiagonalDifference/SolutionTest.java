package com.pridesoftware.hackerrank.algorithms.DiagonalDifference;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;

public class SolutionTest {

    @Test
    public void testDiagonalDifference1()
            throws IOException {
        String input =
                "3" + System.getProperty("line.separator") +
                "11 2 4" + System.getProperty("line.separator") +
                "4 5 6" + System.getProperty("line.separator") +
                "10 8 -12" + System.getProperty("line.separator");
        String expectedOutput = "15";

        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        Solution.diagonalDifference(outputStream, inputStream, null);

        String actualOutput = new String(outputStream.toByteArray());

        Assert.assertEquals(expectedOutput, actualOutput);
    }


    @Test
    public void testCalculatePrimaryDiagonal1(){
        int[][] input = {{11,2,4},{4,5,6},{10,8,-12}};
        int expectedOutput = 4;
        int actualOutput = Solution.calculatePrimaryDiagonal(input);
        Assert.assertEquals(expectedOutput, actualOutput);
    }


    @Test
    public void testCalculateSecondaryDiagonal1(){
        int[][] input = {{11,2,4},{4,5,6},{10,8,-12}};
        int expectedOutput = 19;
        int actualOutput = Solution.calculateSecondaryDiagonal(input);
        Assert.assertEquals(expectedOutput, actualOutput);
    }





}
