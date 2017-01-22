package Maatriks;

import java.util.Arrays;

/**
 * Loo 10*10 maatriks tsirkuse lauamänguga. Ehk numbrid ühest sajani
 * alustavad alt vasakult ja jõuavad üles vasakule.
 *
 * Näide 5*5 laual:
 * 30 29 28 27 26
 * 21 22 23 24 25
 * 20 19 18 17 16
 * 11 12 13 14 15
 * 10 9  8  7  6
 * 1  2  3  4  5
 */
public class Tsirkus {
    public static void main(String[] args) {
        int n = 10; //selline lahendus kehtib paarisarvulise n korral

        Integer[][] laud = new Integer[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i%2 == 0){
                    laud[i][j] = n*n-((i*n)+j);
                }
                else {
                    laud[i][j] = (n*n+1)-n*(i+1)+j;
                }

            }
        }
        printMaatriks(laud);
    }

    // Lihtsalt abiline meetod, et maatriksit välja printida
    private static void printMaatriks(Integer[][] laud) {
        for (int i = 0; i < laud.length; i++) {
            System.out.println(Arrays.toString(laud[i]));
        }
        System.out.println("");
    }
}
