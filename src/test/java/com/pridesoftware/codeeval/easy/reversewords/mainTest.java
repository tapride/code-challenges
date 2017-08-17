package com.pridesoftware.codeeval.easy.reversewords;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;


public class mainTest {

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
        String[] args = new String[]{"input/code-eval/ReverseWords/input.txt"};

        String expected =
                "World Hello" + System.getProperty("line.separator") +
                "CodeEval Hello" + System.getProperty("line.separator");

        Main.main(args);
        String actual = outContent.toString();
        assertEquals(expected, actual);
    }
}