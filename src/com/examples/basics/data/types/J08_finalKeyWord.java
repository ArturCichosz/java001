package com.examples.basics.data.types;

public class J08_finalKeyWord {
    public static void main(String[] args) {
        int number = 10;
        number = 20; // możemy mienić wartość int

        final int number2 = 100;
        //number2 = 200; // nie można zmienić, zostało przypisane na stałe wartość 100
    }
}
