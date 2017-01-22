package Maatriks;

import java.util.Arrays;

/**
 * Loo 10*10 maatriks tagurpidi Tsirkuse lauamänguga. Ehk numbrid ühest sajani
 * alustavad ülevalt paremalt ja jõuavad alla paremale (või kui kaugele iganes).
 *
 * Näide 5*5 laual:
 *  5  4  3  2  1
 *  6  7  8  9 10
 * 15 14 13 12 11
 * 16 17 18 19 20
 * 25 24 23 22 21
 * 26 27 28 29 30
 */
public class Sukrist {
    public static void main(String[] args) {
        int n = 10;
        Integer[][] laud = new Integer[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i%2 == 0){
                    laud[i][j] = i*n + n-j;
                }
                else {
                    laud[i][j] = (i+1)*n + j-(n-1);
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
