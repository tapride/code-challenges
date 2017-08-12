package com.pridesoftware.codeeval.detectingCycles;

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

        String[] args = new String[]{"input/DetectingCycles/input.txt"};

        String expected =
                "6 3 1" + System.getProperty("line.separator") +
                "49" + System.getProperty("line.separator")+
                "1 2 3" + System.getProperty("line.separator");

        Main.main(args);
        String actual = outContent.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindIndexOfFirstMatch1(){
        String[] input = new String[]{"2", "0", "6", "3", "1", "6", "3", "1", "6", "3", "1"};
        int[] expectedOutput = new int[]{2,5};
        int[] actualOutput = Main.findIndexOfFirstMatch(input);
        Assert.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testFindIndexOfFirstMatch2(){
        String[] input =
                new String[]{"3", "4", "8", "0", "11", "9", "7", "2", "5", "6", "10", "1", "49", "49", "49", "49"};
        int[] expectedOutput =
                new int[]{12,13};
        int[] actualOutput = Main.findIndexOfFirstMatch(input);
        Assert.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testFindIndexOfFirstMatch3(){
        String[] input =
                new String[]{"1", "2", "3", "1", "2", "3", "1", "2", "3"};
        int[] expectedOutput =
                new int[]{0,3};
        int[] actualOutput = Main.findIndexOfFirstMatch(input);
        Assert.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testProcessLine1(){
        String input = "2 0 6 3 1 6 3 1 6 3 1";
        String expectedOutput = "6 3 1";
        String actualOutput = Main.processLine(input);
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testProcessLine2(){
        String input = "3 4 8 0 11 9 7 2 5 6 10 1 49 49 49 49";
        String expectedOutput = "49";
        String actualOutput = Main.processLine(input);
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testProcessLine3(){
        String input = "1 2 3 1 2 3 1 2 3";
        String expectedOutput = "1 2 3";
        String actualOutput = Main.processLine(input);
        Assert.assertEquals(expectedOutput, actualOutput);
    }

}
