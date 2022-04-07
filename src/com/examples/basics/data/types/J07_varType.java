package com.examples.basics.data.types;

public class J07_varType {
    public static void main(String[] args) {
        int number = add(10,"5");  // nadajemy wartości funkcji add
        System.out.println(number);

    }
    public static int add(int a, String b) {    // tworzenie funkcji z dwoma argumentami - skonwertujemy stringa
        var result = a + Integer.valueOf(b).intValue(); // konwertowanie stringa na int / typ VAR możemy używać tylko lokalnie
        return result; // zwrócenie funkcji

    }
}
