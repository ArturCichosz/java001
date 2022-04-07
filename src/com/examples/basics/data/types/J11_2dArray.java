package com.examples.basics.data.types;

public class J11_2dArray {
    public static void main(String[] args) {
        String strArr[][] = {  // [2][3]
                { "1", "2", "3"},
                { "4", "5", "6"}
        };
        System.out.println(strArr[0][1]); // [wiersz][wartość]

        int numArr[][] = new int[3][4];
        numArr[1][2] = 100;


        int numRows = 10;
        int numCols = 15;

        int arr[][] = new int[numRows][numCols];

    }
}
