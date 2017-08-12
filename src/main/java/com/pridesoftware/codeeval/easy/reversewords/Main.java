/**
 *
 * REVERSE WORDS
 *
 * CHALLENGE DESCRIPTION:
 *
 * Write a program which reverses the words in an input sentence.
 *
 * INPUT SAMPLE:
 *
 * The first argument is a file that contains multiple sentences, one per line. Empty lines are also possible.
 *
 * For example:
 *
 * Hello World
 * Hello CodeEval
 *
 * OUTPUT SAMPLE:
 *
 * Print to stdout each sentence with the reversed words in it, one per line. Empty lines in the input should be
 * ignored. Ensure that there are no trailing empty spaces in each line you print.
 *
 * For example:
 *
 * World Hello
 * CodeEval Hello
 *
 */


package com.pridesoftware.codeeval.easy.reversewords;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            if (line.trim().length() > 0){
                String[] words = line.split(" ");
                for (int i = words.length - 1; i >= 0; i--){
                    System.out.print(words[i]);
                    if (i != 0){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print(System.getProperty("line.separator"));
                    }
                }

            }


        }
    }
}
