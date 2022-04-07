package com.examples.basics.operators;

public class Op2_incrementation_decrementation {
    public static void main(String[] args) {
        int a = 10;
        a++;                           // zwiększam a o 1
        System.out.println("a++ " + a);

        int b = 5;
        int c = 10 + b++;      // najpierw jest wykonywanie działanie, a potem inkrementacja B o 1 / przyrostkowa
        System.out.println(c);
        System.out.println(b);   // B zostało zinkrementowane ponieważ nie uczestniczyło w działaniu

        int d = 5;
        int e = 10 + ++d;  // inkrementacja przedrostkowa - D zostaje zwiększone przy działaniu
        System.out.println("e++ " + e);
        System.out.println(d);


    }
}
