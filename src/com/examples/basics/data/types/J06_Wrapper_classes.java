package com.examples.basics.data.types;

public class J06_Wrapper_classes {
    public static void main(String[] args) {
        int a = 123;
        Integer number = Integer.valueOf(a); // obiekt number będzie wewnątrz posiadał wartość 123 / funkcja konwerowania
        System.out.println(a);
        System.out.println( number.toString()); // skonwertowane na stringa
        System.out.println( number.floatValue()); // skonwertowane do liczby zmienno przecinkowej
        System.out.println( Integer.toHexString(a)); // bez konwetowania na stringa - kod szesnastkowy
        // Java Integer DOC na google
    }
}
