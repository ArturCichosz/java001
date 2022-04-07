package com.examples.basics.data;

import java.math.BigDecimal;   // jeśli damy gwiazdkę, to będzie mniej importów
import java.math.BigInteger;

public class bigIntegerBigDecimal {
    public static void main(String[] args) {
        BigInteger bigInt = new BigInteger("6527398572938759273592873"); // nadanie stringa do biginteger
        bigInt = bigInt.add(new BigInteger("1284718027340817208471024124")); // dodanie liczby do big integer
        System.out.println(bigInt); // z automatu wyświetlane jako string

        BigDecimal bigDecimal = new BigDecimal("12.2222222222222222222222");
        bigDecimal = bigDecimal.add (new BigDecimal("12.222222222222222222"));
        System.out.println(bigDecimal);
    }
}
