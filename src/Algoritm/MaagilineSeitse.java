package Algoritm;

/**
 * Antud on int[] massiiv. Korruta kõik seitsmed kahega ja leia arvude keskmine.
 */
public class MaagilineSeitse {
    public static void main(String[] args) {

        int[] naide = {7, 4, 324, 65, 4, 78, 7, 45, 4};
        int summa = 0;

        for (int i = 0; i <= naide.length-1; i++) {
            if (naide[i]== 7){
                naide[i]= 2*naide[i];
            }
            summa = summa + naide[i];
        }

        double keskmine = (double)summa / naide.length;
        System.out.println(keskmine);
        System.out.println(naide.length);
        System.out.println(summa);
    }
}
