package com.pridesoftware.codeeval.lowercase;

/**
 * LOWERCASE
 *
 * CHALLENGE DESCRIPTION:
 * Given a string write a program to convert it into lowercase.
 *
 * INPUT SAMPLE:
 * The first argument will be a path to a filename containing sentences, one per line. You can assume all characters
 * are from the english language. E.g.
 *
 * HELLO CODEEVAL
 * This is some text
 *
 *
 * OUTPUT SAMPLE:
 * Print to stdout, the lowercase version of the sentence, each on a new line. E.g.
 *
 * hello codeeval
 * this is some text
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
        return line.toLowerCase();
    }
}
