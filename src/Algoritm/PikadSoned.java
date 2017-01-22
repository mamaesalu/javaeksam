package Algoritm;

import java.util.Arrays;

/**
 * Antud on massiiv. Mitu sõne on massiivis keskmisest pikemad?
 */
public class PikadSoned {
    public static void main(String[] args) {

        String[] naide = {"kaalikas", "joonas", "maakera", "homeros", "mandel"}; // vastus on 3
        int pikkus = 0;
        int keskmine;
        int pikem = 0;

        for (int i = 0; i < naide.length; i++) {
            pikkus = pikkus + naide[i].length();
        }

        keskmine = pikkus / naide.length;

        for (int i = 0; i < naide.length; i++) {
            if (naide[i].length() > keskmine) {
                pikem++;
            }
        }
        System.out.println(pikem);
    }
}
