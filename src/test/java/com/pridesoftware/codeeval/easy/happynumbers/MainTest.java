package com.pridesoftware.codeeval.easy.happynumbers;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;


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
        String[] args = new String[]{"input/code-eval/HappyNumbers/input.txt"};

        String expected =
                "1" + System.getProperty("line.separator") +
                "1" + System.getProperty("line.separator") +
                "0" + System.getProperty("line.separator");

        Main.main(args);
        String actual = outContent.toString();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testIsNumberHappy() throws Exception {
        int input = 7;
        int expected= 1;
        int actual = Main.isNumberHappy(input);
        assertEquals(expected, actual);

        input = 1;
        expected = 1;
        actual = Main.isNumberHappy(input);
        assertEquals(expected, actual);

        input = 22;
        expected = 0;
        actual = Main.isNumberHappy(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testBreakNumberIntoDigits() throws Exception {
        int input = 33;
        int[] expected = new int[]{3,3};
        int[] actual = Main.breakNumberIntoDigits(input);
        Assert.assertArrayEquals(expected, actual);

        input = 18574;
        expected = new int[]{1,8,5,7,4};
        actual = Main.breakNumberIntoDigits(input);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testCalculateNextNumber() throws Exception {
        int input = 22;
        int expected = 8;
        int actual = Main.calculateNextNumber(input);
        Assert.assertEquals(expected, actual);
    }
}