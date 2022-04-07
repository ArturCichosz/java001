package com.examples.basics.data;

public class enumExample {

    enum soundVolume { LOW, MEDIUM, HIGH, VERY_HIGH};
    enum carVariant { SEDAN, COMBI, SUPER_CAR};


    public static void main(String[] args) {
        soundVolume phoneSound = soundVolume.LOW; // przypisujemy konkretną zmienną i konkretną wartość
        System.out.println(phoneSound);

    }
}
