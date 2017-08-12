package com.pridesoftware.codeeval.easy.DataRecovery;

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
        String[] args = new String[]{"input/DataRecovery/input.txt"};

        String expected =
            "However, it was not implemented until 1998 and 2000" + System.getProperty("line.separator") +
            "The first programming language" + System.getProperty("line.separator") +
            "The Manchester Mark 1 ran programs written in Autocode from 1952" + System.getProperty("line.separator");

        Main.main(args);
        String actual = outContent.toString();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testRecoverSentence(){
        String input1 = "2000 and was not However, implemented 1998 it until;9 8 3 4 1 5 7 2";
        String expected1 = "However, it was not implemented until 1998 and 2000";
        Assert.assertEquals(expected1, Main.recoverSentence(input1));

        String input2 = "programming first The language;3 2 1";
        String expected2 = "The first programming language";
        Assert.assertEquals(expected2, Main.recoverSentence(input2));


        String input3 = "programs Manchester The written ran Mark 1952 1 in Autocode from;6 2 1 7 5 3 11 4 8 9";
        String expected3 = "The Manchester Mark 1 ran programs written in Autocode from 1952";
        Assert.assertEquals(expected3, Main.recoverSentence(input3));

    }







}