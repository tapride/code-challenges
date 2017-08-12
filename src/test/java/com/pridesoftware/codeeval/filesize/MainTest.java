package com.pridesoftware.codeeval.filesize;

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
        String[] args = new String[]{"input/FileSize/test1.txt"};

        String expected =
                "12" + System.getProperty("line.separator") ;

        Main.main(args);
        String actual = outContent.toString();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGetFileSize(){
        String input = "input/FileSize/test1.txt";
        int expected = 12;
        int actual = Main.getFileSize(input);
        Assert.assertEquals(expected, actual);
    }


}
