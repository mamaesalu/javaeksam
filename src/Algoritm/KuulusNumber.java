package Algoritm;

import java.util.Arrays;

/**
 * Antud on int[] massiiv. Eemalda kõik nr 3 väärtused ja leia millist numbrit esineb kõige siis rohkem?
 * Mitte siis number, mis on kolmandal indeksil, vaid nr kolm ise.
 */
public class KuulusNumber {

    static int count;
    static int maxcount = 0;
    static int suurim;

    public static void main(String[] args) {

        int[] naide = {1, 5, 3, 3, 6, 3, 7, 7}; // vastus on 7

        for (int i = 0; i < naide.length; i++) {
            count = 0;
            if (naide[i] != 3) {
                for (int j = 0; j < naide.length; j++) {
                    if (naide[j]== naide[i] && j!=i){
                        count++;
                    }
                }
            }
            if (count > maxcount) {
                maxcount = count;
                suurim = naide[i];
            }
        }
        System.out.println(suurim);
    }
}
