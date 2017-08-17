package com.pridesoftware.codeeval.easy.bitpositions;

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

        String[] args = new String[]{"input/code-eval/BitPositions/input.txt"};

        String expected =
                "true" + System.getProperty("line.separator") +
                "false" + System.getProperty("line.separator") ;

        outContent.flush();
        errContent.flush();
        Main.main(args);
        String actual = outContent.toString();
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void testBitPositions1(){
        String input = "86,2,3";
        String expectedOutput = "true";
        String actualOutput = Main.bitPositions(input);
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testBitPositions2(){
        String input = "125,1,2";
        String expectedOutput = "false";
        String actualOutput = Main.bitPositions(input);
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}