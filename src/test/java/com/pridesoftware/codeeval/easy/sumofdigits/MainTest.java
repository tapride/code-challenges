package com.pridesoftware.codeeval.easy.sumofdigits;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void testMain() throws Exception {

        String[] args = new String[]{"input/SumOfDigits/input.txt"};

        String expected =
                "5" + System.getProperty("line.separator") +
                "16" + System.getProperty("line.separator") ;

        outContent.flush();
        errContent.flush();
        Main.main(args);
        String actual = outContent.toString();
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void testSumOfDigits1(){
        String input = "23";
        String expectedOutput = "5";
        String actualOutput = Main.sumOfDigits(input);
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testSumOfDigits2(){
        String input = "496";
        String expectedOutput = "19";
        String actualOutput = Main.sumOfDigits(input);
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}