/**
 *
 * DATA RECOVERY
 *
 * CHALLENGE DESCRIPTION:
 *
 * Your friends decided to make fun of you. They have installed a script on your computer which shuffled all words
 * within a text. It is a joke, so they have left hints for each sentence. The hints will allow you to rebuild the
 * data easily, but you need to find out how to use them.
 *
 * Your task is to write a program which reconstructs each sentence out of a set of words and prints out
 * the original sentences.
 *
 * INPUT SAMPLE:
 *
 * Your program should accept a path to a filename as its first argument. Each line is a test case which consists
 * of a set of words and a sequence of numbers separated by a semicolon. The words within a set and the numbers
 * within a sequence are separated by a single space.
 *
 *  See file input/DataRecovery/input.txt
 *
 * OUTPUT SAMPLE:
 * Print out a reconstructed sentence for each test case, one per line.
 *
 * See file input/DataRecovery/output.txt
 *
 * CONSTRAINTS:
 *  - The number of test cases is in a range from 20 to 40.
 *  - The words consist of ASCII uppercase and lowercase letters, digits, and punctuation marks.
 *
 */

package com.pridesoftware.codeeval.easy.DataRecovery;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args){
        String fileName = args[0];

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while((line = bufferedReader.readLine()) != null){
                String recoveredSentence = recoverSentence(line);
                System.out.println(recoveredSentence);
            }

        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    public static String recoverSentence(String fileLine){
        String[] breakout = fileLine.split(";");
        String[] words = breakout[0].split("\\s");
        String[] places = breakout[1].split("\\s");

        String[] correctedOrder = new String[words.length];

        for (int i = 0 ; i < words.length ; i++ ){
            if (i < places.length) {
                int place = Integer.parseInt(places[i]);
                correctedOrder[place-1] = words[i];
            }
            else
            {
                for(int j = 0; j < correctedOrder.length; j++){
                    if(correctedOrder[j] == null){
                        correctedOrder[j] = words[i];
                    }
                }
            }
        }

        StringBuilder correctedSentence = new StringBuilder();
        for (int i = 0 ; i < correctedOrder.length ; i++) {
            correctedSentence.append(correctedOrder[i]);
            if (i != correctedOrder.length -1)
            {
                correctedSentence.append(" ");
            }
        }
        return correctedSentence.toString();
    }

}
