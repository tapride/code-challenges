/**
 * MULTIPLICATION TABLES
 *
 * CHALLENGE DESCRIPTION:
 * Print out the grade school multiplication table upto 12*12.
 *
 * INPUT SAMPLE:
 * There is no input for this program.
 *
 * OUTPUT SAMPLE:
 * Print out the table in a matrix like fashion, each number formatted to a width of 4 (The numbers are right-aligned
 * and strip out leading/trailing spaces on each line). The first 3 line will look like:
 *
 * 1   2   3   4   5   6   7   8   9  10  11  12
 * 2   4   6   8  10  12  14  16  18  20  22  24
 * 3   6   9  12  15  18  21  24  27  30  33  36
 *
 */

package com.pridesoftware.codeeval.easy.multiplication_tables;

public class Main {

    public static void main(String[] args) {
        for (int y = 1; y <= 12; y++){
            System.out.println(generateRow(y));
        }
    }

    public static String generateValue(int x, int y){
        int fieldLength = 4;
        String value = String.valueOf(x * y);
        StringBuilder sb = new StringBuilder();
        while (sb.length() + value.length() < fieldLength){
            sb.append(" ");
        }
        sb.append(value);
        return sb.toString();
    }

    public static String generateRow(int y){
        StringBuilder sb = new StringBuilder();
        for (int x = 1; x <= 12; x++ ){
            sb.append(generateValue(x,y));
        }
        return sb.toString().trim() ;
    }


}