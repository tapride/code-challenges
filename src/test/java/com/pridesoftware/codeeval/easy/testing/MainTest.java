package com.pridesoftware.codeeval.easy.testing;

import com.pridesoftware.codeeval.lowercase.Main;
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
        String[] args = new String[]{"input/Testing/input.txt"};

        String expected =
                "Low" + System.getProperty("line.separator") +
                "Critical" + System.getProperty("line.separator") +
                "Done" + System.getProperty("line.separator");

        Main.main(args);
        String actual = outContent.toString();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testCountDefects1(){

    }
}
