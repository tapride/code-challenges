package com.pridesoftware.codeeval.lowercase;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.*;

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
        String[] args = new String[]{"input/CleanUpTheWords/input.txt"};

        String expected =
                "hello world" + System.getProperty("line.separator") ;

        Main.main(args);
        String actual = outContent.toString();
        Assert.assertEquals(expected, actual);

    }
}
