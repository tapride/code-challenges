package com.pridesoftware.codeeval.multiplication_tables;

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
        String[] args = new String[]{};

        String expected =
                "1   2   3   4   5   6   7   8   9  10  11  12" + System.getProperty("line.separator") +
                "2   4   6   8  10  12  14  16  18  20  22  24" + System.getProperty("line.separator") +
                "3   6   9  12  15  18  21  24  27  30  33  36" + System.getProperty("line.separator") +
                "4   8  12  16  20  24  28  32  36  40  44  48" + System.getProperty("line.separator") +
                "5  10  15  20  25  30  35  40  45  50  55  60" + System.getProperty("line.separator") +
                "6  12  18  24  30  36  42  48  54  60  66  72" + System.getProperty("line.separator") +
                "7  14  21  28  35  42  49  56  63  70  77  84" + System.getProperty("line.separator") +
                "8  16  24  32  40  48  56  64  72  80  88  96" + System.getProperty("line.separator") +
                "9  18  27  36  45  54  63  72  81  90  99 108" + System.getProperty("line.separator") +
                "10  20  30  40  50  60  70  80  90 100 110 120" + System.getProperty("line.separator") +
                "11  22  33  44  55  66  77  88  99 110 121 132" + System.getProperty("line.separator") +
                "12  24  36  48  60  72  84  96 108 120 132 144" + System.getProperty("line.separator");

        Main.main(args);
        String actual = outContent.toString();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGenerateValue1() throws Exception {
        int inputX = 1;
        int inputY = 1;
        String expected = "   1";
        String actual = Main.generateValue(inputX, inputY);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGenerateValue2() throws Exception {
        int inputX = 10;
        int inputY = 3;
        String expected = "  30";
        String actual = Main.generateValue(inputX, inputY);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGenerateValue3() throws Exception {
        int inputX = 12;
        int inputY = 12;
        String expected = " 144";
        String actual = Main.generateValue(inputX, inputY);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testgenerateRow1() throws Exception {
        int inputY = 1;
        String expected = "1   2   3   4   5   6   7   8   9  10  11  12";
        String actual = Main.generateRow(inputY);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testgenerateRow2() throws Exception {
        int inputY = 2;
        String expected = "2   4   6   8  10  12  14  16  18  20  22  24";
        String actual = Main.generateRow(inputY);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testgenerateRow3() throws Exception {
        int inputY = 3;
        String expected = "3   6   9  12  15  18  21  24  27  30  33  36";
        String actual = Main.generateRow(inputY);
        Assert.assertEquals(expected, actual);
    }
}
