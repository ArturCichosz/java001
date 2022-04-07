package com.examples.basics.operators;

public class Op1_basics {
    public static void main(String[] args) {
        int a = 10;
        int b, c;

        c = b = a + 5;

        System.out.println("b:" + b + " c:" + c);

        int v = (100 * 2) / 5 + 20;
        System.out.println("v:" + v);

        System.out.println("modulo:" + (20 % 7));  // reszta z dzielenia
    }
}
