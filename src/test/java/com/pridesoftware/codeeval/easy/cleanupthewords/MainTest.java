package com.pridesoftware.codeeval.easy.cleanupthewords;

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
        String[] args = new String[]{"input/CleanUpTheWords/input.txt"};

        String expected =
                "hello world" + System.getProperty("line.separator") +
                "can you" + System.getProperty("line.separator") +
                "what are you doing" + System.getProperty("line.separator");

        Main.main(args);
        String actual = outContent.toString();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testProcessLine(){
        String input1 = "(--9Hello----World...--)";
        String expected1 = "hello world";
        Assert.assertEquals(expected1, Main.processLine(input1));

        String input2 = "Can 0$9 ---you~";
        String expected2 = "can you";
        Assert.assertEquals(expected2, Main.processLine(input2));

        String input3 = "13What213are;11you-123+138doing7";
        String expected3 = "what are you doing";
        Assert.assertEquals(expected3, Main.processLine(input3));

    }

    @Test
    public void testIsLetter_A(){
        Assert.assertEquals(true, Main.isLetter('A'));
        Assert.assertEquals(true, Main.isLetter('a'));
    }

    @Test
    public void testIsLetter_B(){
        Assert.assertEquals(true, Main.isLetter('B'));
        Assert.assertEquals(true, Main.isLetter('b'));
    }

    @Test
    public void testIsLetter_C(){
        Assert.assertEquals(true, Main.isLetter('C'));
        Assert.assertEquals(true, Main.isLetter('c'));
    }

    @Test
    public void testIsLetter_D(){
        Assert.assertEquals(true, Main.isLetter('D'));
        Assert.assertEquals(true, Main.isLetter('d'));
    }
    @Test
    public void testIsLetter_E(){
        Assert.assertEquals(true, Main.isLetter('E'));
        Assert.assertEquals(true, Main.isLetter('e'));
    }
    @Test
    public void testIsLetter_F(){
        Assert.assertEquals(true, Main.isLetter('F'));
        Assert.assertEquals(true, Main.isLetter('f'));
    }
    @Test
    public void testIsLetter_G(){
        Assert.assertEquals(true, Main.isLetter('G'));
        Assert.assertEquals(true, Main.isLetter('g'));
    }
    @Test
    public void testIsLetter_H(){
        Assert.assertEquals(true, Main.isLetter('H'));
        Assert.assertEquals(true, Main.isLetter('h'));
    }
    @Test
    public void testIsLetter_I(){
        Assert.assertEquals(true, Main.isLetter('I'));
        Assert.assertEquals(true, Main.isLetter('i'));
    }
    @Test
    public void testIsLetter_J(){
        Assert.assertEquals(true, Main.isLetter('J'));
        Assert.assertEquals(true, Main.isLetter('j'));
    }
    @Test
    public void testIsLetter_K(){
        Assert.assertEquals(true, Main.isLetter('K'));
        Assert.assertEquals(true, Main.isLetter('k'));
    }
    @Test
    public void testIsLetter_L(){
        Assert.assertEquals(true, Main.isLetter('L'));
        Assert.assertEquals(true, Main.isLetter('l'));
    }
    @Test
    public void testIsLetter_M(){
        Assert.assertEquals(true, Main.isLetter('M'));
        Assert.assertEquals(true, Main.isLetter('m'));
    }
    @Test
    public void testIsLetter_N(){
        Assert.assertEquals(true, Main.isLetter('N'));
        Assert.assertEquals(true, Main.isLetter('n'));
    }
    @Test
    public void testIsLetter_O(){
        Assert.assertEquals(true, Main.isLetter('O'));
        Assert.assertEquals(true, Main.isLetter('o'));
    }
    @Test
    public void testIsLetter_P(){
        Assert.assertEquals(true, Main.isLetter('P'));
        Assert.assertEquals(true, Main.isLetter('p'));
    }
    @Test
    public void testIsLetter_Q(){
        Assert.assertEquals(true, Main.isLetter('Q'));
        Assert.assertEquals(true, Main.isLetter('q'));
    }
    @Test
    public void testIsLetter_R(){
        Assert.assertEquals(true, Main.isLetter('R'));
        Assert.assertEquals(true, Main.isLetter('r'));
    }
    @Test
    public void testIsLetter_S(){
        Assert.assertEquals(true, Main.isLetter('R'));
        Assert.assertEquals(true, Main.isLetter('r'));
    }
    @Test
    public void testIsLetter_T(){
        Assert.assertEquals(true, Main.isLetter('T'));
        Assert.assertEquals(true, Main.isLetter('t'));
    }

    @Test
    public void testIsLetter_U(){
        Assert.assertEquals(true, Main.isLetter('U'));
        Assert.assertEquals(true, Main.isLetter('u'));
    }
    @Test
    public void testIsLetter_V(){
        Assert.assertEquals(true, Main.isLetter('V'));
        Assert.assertEquals(true, Main.isLetter('v'));
    }
    @Test
    public void testIsLetter_W(){
        Assert.assertEquals(true, Main.isLetter('W'));
        Assert.assertEquals(true, Main.isLetter('w'));
    }
    @Test
    public void testIsLetter_X(){
        Assert.assertEquals(true, Main.isLetter('X'));
        Assert.assertEquals(true, Main.isLetter('x'));
    }
    @Test
    public void testIsLetter_Y(){
        Assert.assertEquals(true, Main.isLetter('Y'));
        Assert.assertEquals(true, Main.isLetter('y'));
    }
    @Test
    public void testIsLetter_Z(){
        Assert.assertEquals(true, Main.isLetter('Z'));
        Assert.assertEquals(true, Main.isLetter('z'));
    }
    @Test
    public void testIsLetter_minus(){
        Assert.assertEquals(false, Main.isLetter('-'));
    }
    @Test
    public void testIsLetter_plus(){
        Assert.assertEquals(false, Main.isLetter('+'));
    }
    @Test
    public void testIsLetter_period(){
        Assert.assertEquals(false, Main.isLetter('.'));
    }
    @Test
    public void testIsLetter_dollarsign(){
        Assert.assertEquals(false, Main.isLetter('$'));
    }
    @Test
    public void testIsLetter_semicolon(){
        Assert.assertEquals(false, Main.isLetter(';'));
    }
    @Test
    public void testIsLetter_squiglyline(){
        Assert.assertEquals(false, Main.isLetter('~'));
    }
    @Test
    public void testIsLetter_numbers(){
        for (int i = 0 ; i < 10 ; i++) {
            Assert.assertEquals(false, Main.isLetter(Integer.toString(i).toCharArray()[0]));
        }
    }

}
