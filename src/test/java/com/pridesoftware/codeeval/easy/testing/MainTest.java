package com.pridesoftware.codeeval.easy.testing;

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

        outContent.flush();
        errContent.flush();
        Main.main(args);
        String actual = outContent.toString();
        Assert.assertEquals(expected, actual);


    }



    @Test
    public void testRateIssue1(){
        String inputExpectedValue = "Hello Codeeval";
        String inputActualValue =   "Heelo Codevval";
        String  expected = "Low";
        String actual = Main.rateIssue(inputActualValue, inputExpectedValue);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRateIssue2(){
        String inputExpectedValue = "Hello Codeeval";
        String inputActualValue =   "hELLO cODEEVAL";
        String expected = "Critical";
        String actual = Main.rateIssue(inputActualValue, inputExpectedValue);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRateIssue3(){
        String inputExpectedValue = "Hello Codeeval";
        String inputActualValue =   "Hello Codeeval";
        String  expected = "Done";
        String actual = Main.rateIssue(inputActualValue, inputExpectedValue);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRateIssue4(){
        String inputExpectedValue = "Hello Codeeval";
        String inputActualValue =   "hElLO cODEEVA";
        String actual = Main.rateIssue(inputActualValue, inputExpectedValue);
        Assert.assertNull(actual);
    }

    @Test
    public void testRateIssue5(){
        String inputExpectedValue = "Hello Codeeval";
        String inputActualValue =   "hElLO cODEEVALs";
        String actual = Main.rateIssue(inputActualValue, inputExpectedValue);
        Assert.assertNull(actual);
    }

    @Test
    public void testRateIssue6(){
        String inputExpectedValue = "Hello Codeeval";
        String inputActualValue =   "HEllo cOdEeval";
        String expected = "Medium";
        String actual = Main.rateIssue(inputActualValue, inputExpectedValue);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRateIssue7(){
        String inputExpectedValue = "Hello Codeeval";
        String inputActualValue =   "heLLo coDEeval";
        String expected = "High"; // <=6
        String actual = Main.rateIssue(inputActualValue, inputExpectedValue);
        Assert.assertEquals(expected, actual);
    }




    @Test
    public void testCountDefects1(){
        String inputExpectedValue = "Hello Codeeval";
        String inputActualValue =   "Heelo Codevval";
        int expected = 2;
        int actual = Main.countDefects(inputActualValue, inputExpectedValue);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCountDefects2(){
        String inputExpectedValue = "Hello Codeeval";
        String inputActualValue =   "hELLO cODEEVAL";
        int expected = 13;
        int actual = Main.countDefects(inputActualValue, inputExpectedValue);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCountDefects3(){
        String inputExpectedValue = "Hello Codeeval";
        String inputActualValue =   "Hello Codeeval";
        int  expected = 0;
        int actual = Main.countDefects(inputActualValue, inputExpectedValue);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCountDefects4(){
        String inputExpectedValue = "Hello Codeeval";
        String inputActualValue =   "hElLO cODEEVA";
        int expected = -1;
        int actual = Main.countDefects(inputActualValue, inputExpectedValue);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCountDefects5(){
        String inputExpectedValue = "Hello Codeeval";
        String inputActualValue =   "hELLO cODEEVALs";
        int expected = -1;
        int actual = Main.countDefects(inputActualValue, inputExpectedValue);
        Assert.assertEquals(expected, actual);
    }


}
