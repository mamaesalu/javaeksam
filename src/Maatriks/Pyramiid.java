package Maatriks;

/**
 * Nüüd paneme loode ja kagu nurga kokku ja loome pealtvaates püramiidi:
 *
 *  0 0 0 0 0 0 0 0 0
 *  0 1 1 1 1 1 1 1 0
 *  0 1 2 2 2 2 2 1 0
 *  0 1 2 3 3 3 2 1 0
 *  0 1 2 3 4 3 2 1 0
 *  0 1 2 3 3 3 2 1 0
 *  0 1 2 2 2 2 2 1 0
 *  0 1 1 1 1 1 1 1 0
 *  0 0 0 0 0 0 0 0 0
 *
 *  Kui tuletad meelde kuidas loode ja kagu nurka lahendada ning
 *  kuidas kirdest edelasse diagonaali joonistada, siis tead ka
 *  kuidas seda ülesannet lahendada.
 *
 *  Massiivi ei ole vaja panna, lihtsalt prindi välja. Ära üle
 *  mõtle - lahendada on võimalik kahe tsükli ja ühe if lausega.
 */
public class Pyramiid {
    public static void main(String[] args) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i+j <= 8){
                    if (i <= j) {
                        System.out.print(i + " ");;
                    } else {
                        System.out.print(j + " ");
                    }
                }
                if (i+j > 8){
                    if (i <= j){
                        System.out.print(8-j + " ");
                    } else {
                        System.out.print(8-i + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}