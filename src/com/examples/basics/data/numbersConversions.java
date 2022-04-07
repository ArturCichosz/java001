package com.examples.basics.data;

public class numbersConversions {
    public static void main(String[] args) {

        // konwersja jawna - konwencjonalna
        int i = 5;
        double d = 20.0d / (double)i;
        System.out.println(d);

        // konwersja niejawna - rozszerzająca

        int j = 5;
        double d1 = 20.0d / j;
        System.out.println(d1);

        double d2 = 5.5d;
        int k = 10 * (int)d2;  // przy konwersji flout/double na całkowity część ułamkowa zostaje usunięta
        System.out.println(k);

        byte small = (byte)200;   // wymuszenie byte - utrata pakietów
        System.out.println(small);

    }
}
