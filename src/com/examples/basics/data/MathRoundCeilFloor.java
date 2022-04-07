package com.examples.basics.data;

public class MathRoundCeilFloor {
    public static void main(String[] args) {

        System.out.println(Math.round(5.51)); // zaokrąglenie do liczby całkowitej

        System.out.println((int) 5.51d); // rzutowanie z double na int / utrata 0.51

        System.out.println(Math.ceil(6.11));  // zaokrągla do maksymalnej całkowitej liczby

        System.out.println(Math.floor(6.11)); // zaokrągla do najmniejszej całkowitej liczby
    }
}
