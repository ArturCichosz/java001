package com.examples.basics.data.types;

import java.util.Locale;

public class J09_string {
    public static void main(String[] args) {
        String s1 = "String #1";
        String s2 = new String(" String #2"); // wywołanie stringa za pomocą konstruktora
        String s3 = s1 + s2;
        System.out.println(s3);
        System.out.println(s3.toUpperCase()); // dodanie funkcji wielkich liter
        System.out.println(s3.length()); // funkcja, która zwraca długość stringa

        String s4 = "Wiersz #1 \n \t wiersz #2 \n \\ \u263A "; // typy znaków / unicode
        System.out.println(s4);
    }
}
