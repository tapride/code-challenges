package com.pridesoftware.codeeval.easy.testing;

/**
 * TESTING
 *
 * CHALLENGE DESCRIPTION:
 * In many teams, there is a person who tests a project, finds bugs and errors, and prioritizes them. Now, you have
 * the unique opportunity to try yourself as a tester and test a product. Here, you have two strings - the first one
 * is provided by developers, and the second one is mentioned in design. You have to find and count the number of bugs,
 * and also prioritize them for fixing using the following statuses: 'Low', 'Medium', 'High', 'Critical' or 'Done'.
 *
 * INPUT SAMPLE:
 * The first argument is a path to a file. Each line includes a test case with two strings separated by a pipeline '|'.
 * The first string is the one the developers provided to you for testing, and the second one is from design.
 *
 * Heelo Codevval | Hello Codeeval
 * hELLO cODEEVAL | Hello Codeeval
 * Hello Codeeval | Hello Codeeval
 *
 * OUTPUT SAMPLE:
 * Write a program that counts the number of bugs and prioritizes them for fixing using the following statuses:
 * 'Low' - 2 or fewer bugs;
 * 'Medium' - 4 or fewer bugs;
 * 'High' - 6 or fewer bugs;
 * 'Critical' - more than 6 bugs;
 * 'Done' - all is done;
 *
 * Low
 * Critical
 * Done
 *
 * CONSTRAINTS:
 * Strings are of the same length from 5 to 40 characters.
 * Upper and lower case matters.
 * The number of test cases is 40.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args){
        String fileName = args[0];

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while((line = bufferedReader.readLine()) != null){
                String sentence = processLine(line);
                System.out.println(sentence);
            }

        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    public static String processLine(String line){
        return line;
    }

    public static String rateIssue(String actual, String expected){
        return "";
    }

    public static int countDefects(String actual, String expected){
        return 0;
    }
}