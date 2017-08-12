package com.pridesoftware.codeeval.lowercase;

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
