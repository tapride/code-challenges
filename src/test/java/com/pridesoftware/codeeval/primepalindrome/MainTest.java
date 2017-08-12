package com.pridesoftware.codeeval.primepalindrome;


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
        String[] args = new String[0];

        String expected =
                "929" + System.getProperty("line.separator");
        Main.main(args);
        String actual = outContent.toString();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGetPrimes() throws Exception{
        int[] expected = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        int[] actual = Main.getPrimes(30);
        Assert.assertArrayEquals(expected, actual);

        expected = new int[]{2, 3, 5, 7, 11, 13, 17, 19};
        actual = Main.getPrimes(20);
        Assert.assertArrayEquals(expected, actual);

        expected = new int[]{2, 3, 5, 7};
        actual = Main.getPrimes(10);
        Assert.assertArrayEquals(expected, actual);

    }

    @Test
    public void testIsPalindrome(){
        int input = 11;
        boolean expected = true;
        boolean actual = Main.isPalindrome(input);
        Assert.assertEquals(expected, actual);

        input = 13;
        expected = false;
        actual = Main.isPalindrome(input);
        Assert.assertEquals(expected, actual);

        input = 313;
        expected = true;
        actual = Main.isPalindrome(input);
        Assert.assertEquals(expected, actual);

        input = 571;
        expected = false;
        actual = Main.isPalindrome(input);
        Assert.assertEquals(expected, actual);

        input = 7;
        expected = true;
        actual = Main.isPalindrome(input);
        Assert.assertEquals(expected, actual);


    }
}
