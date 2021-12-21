package testing;

import biblioteca.Book;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        new Parinte().afisare();

        new Copil().afisare();

        Parinte p = new Copil();
        p.afisare();

    }


    static void afisare(String a) {
        System.out.println(a);
    }

    static void afisare(String a, String b) {
        System.out.println(a + " " + b);
    }

}
