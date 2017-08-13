/**
 *
 */

package com.pridesoftware.codeeval.easy.details;

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
        String[] args = new String[]{"input/details/input.txt"};

        String expected =
                "1" + System.getProperty("line.separator") +
                "1" + System.getProperty("line.separator") +
                "2" + System.getProperty("line.separator") +
                "0" + System.getProperty("line.separator") ;

        Main.main(args);
        String actual = outContent.toString();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testMaxMoves1(){
        String input = "XX.YY";
        int expected = 1;
        int actual = Main.maxMoves(input);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testMaxMoves2(){
        String input = "X..YY";
        int expected = 2;
        int actual = Main.maxMoves(input);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testMaxMoves3(){
        String input = "X...Y..Y";
        int expected = 3;
        int actual = Main.maxMoves(input);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testMaxMoves4(){
        String input = "XXYY";
        int expected = 0;
        int actual = Main.maxMoves(input);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void processField1(){
        String input = "XX.YY,XXX.Y,X..YY,XX..Y";
        String expected = "1";
        String actual = Main.processField(input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void processField2(){
        String input = "XXX.YYYY,X...Y..Y,XX..YYYY,X.....YY,XX....YY";
        String expected = "1";
        String actual = Main.processField(input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void processField3(){
        String input = "XX...YY,X....YY,XX..YYY,X..YYYY";
        String expected = "2";
        String actual = Main.processField(input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void processField4(){
        String input = "XXYY,X..Y,XX.Y";
        String expected = "0";
        String actual = Main.processField(input);
        Assert.assertEquals(expected,actual);
    }
}
