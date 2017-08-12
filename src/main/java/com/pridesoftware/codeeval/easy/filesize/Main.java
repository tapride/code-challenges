/**
 * INPUT:
 *
 * The first argument to your program has the path to the file you need to check the size of.
 *
 * OUTPUT SAMPLE:
 *
 * Print the size of the file in bytes. E.g.
 *
 */
package com.pridesoftware.codeeval.easy.filesize;

import java.io.*;

public class Main {
    public static void main(String[] args){
        System.out.println(getFileSize(args[0]));
    }

    public static int getFileSize(String filePath){
        File myFile = new File(filePath);
        int fileSize = 0;
        try {
            FileInputStream myInputStream = new FileInputStream(myFile);
            int character = 0;
            while ((character = myInputStream.read()) != -1){
                fileSize++;
            }
            return fileSize;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return -1;
        } catch (IOException e) {
            e.printStackTrace();
            return -2;
        }

    }
}
