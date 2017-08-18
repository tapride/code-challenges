package com.pridesoftware.hackerrank.algorithms.plusminus;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class SolutionTest {

    @Test
    public void testPlusMinus(){
        String input =
                "6" + System.getProperty("line.separator") +
                "-4 3 -9 0 4 1" + System.getProperty("line.separator");

        String expectedOutput =
                "0.500000" + System.getProperty("line.separator") +
                "0.333333" + System.getProperty("line.separator") +
                "0.166667" + System.getProperty("line.separator");

        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        Solution.plusMinus(outputStream, inputStream, null);

        String actualOutput = new String(outputStream.toByteArray());

        Assert.assertEquals(expectedOutput, actualOutput);
    }

}
