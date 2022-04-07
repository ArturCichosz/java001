package com.examples.basics.data.types;

public class J10_arrays {
    public static void main(String[] args) {
        int numArr[] = new int[10];   // wskazyjemy jak dluga ma być tamblica
        numArr[1] = 7;                // przypisujemy wartość tablicy
        System.out.println("numArr[1]: " + numArr[1]);  // wywołujemy drugi element z tablicy
        System.out.println(numArr.length); // wielkość tablicy

        float floatArr[] = { 10.23f, 12.1f, 123f, -99.9f, 15.15f};
        System.out.println("floatArr[0]: " + floatArr[0]);
        System.out.println("floatArr.length: " + floatArr.length);

        String strArr[] = new String[7];
        System.out.println("StringArr[1]: " + strArr[1]);

        String srtArr1[] = { "Ania", "Marek", "Zosia"};
        System.out.println("StringArr1[1]: " + srtArr1[1]);

    }
}
