package com.examples.basics.operators;

public class Op7_compoundAssigmentOperator {
    public static void main(String[] args) {
        // złożone operatory przypisania
        // += -= *= &=

        int a = 5;
        a += 10;      // dodanie do a 10
        System.out.println(a);

        int b = 2;
        b *= 3;
        System.out.println(b);   // 2*3 = 6

        int c = 20;
        c %= 3;    // MODULO - RESZTA Z DZIELENIA
        System.out.println(c);
    }
}
