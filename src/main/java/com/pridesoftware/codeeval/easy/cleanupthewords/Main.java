/**
 * CLEAN UP THE WORDS
 * CHALLENGE DESCRIPTION:
 *
 * You have a list of words. Letters of these words are mixed with extra symbols, so it is hard to define the
 * beginning and end of each word. Write a program that will clean up the words from extra numbers and symbols.
 *
 * INPUT SAMPLE:
 *
 * The first argument is a path to a file. Each line includes a test case with a list of words: letters are
 * both lowercase and uppercase, and are mixed with extra symbols.
 *
 * See input/CleanUpTheWords/input.txt for example file.
 *
 * OUTPUT SAMPLE:
 *
 * Print the cleaned up words separated by spaces in lowercase letters.
 *
 * See input/CleanUpTheWords/output.txt for example output.
 *
 * CONSTRAINTS:
 *  - Print the words separated by spaces in lowercase letters.
 *  - The length of a test case together with extra symbols can be in a range from 10 to 100 symbols.
 *  - The number of test cases is 40.
 *
 */

package com.pridesoftware.codeeval.cleanupthewords;

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
        char[] chars = line.toCharArray();
        boolean lastCharWasLetter = false;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0;i<chars.length;i++){
            if(isLetter(chars[i])){
                stringBuilder.append(chars[i]);
                lastCharWasLetter = true;
            }
            else if (lastCharWasLetter){
                stringBuilder.append(" ");
                lastCharWasLetter = false;
            }
            else{
                lastCharWasLetter = false;
            }
        }

        return stringBuilder.toString().toLowerCase().trim();
    }

    public static boolean isLetter(char aCharacter)  {
         String aString = Character.toString(aCharacter);
         return  aString.toUpperCase().matches("[A-Z]");
    }

}
