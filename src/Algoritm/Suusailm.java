package Algoritm;

/**
 * Antud on kaks massiivi õhu temperatuuridega. Arvuta mõlema puhul mitu positiivset temperatuuri
 * on massiivis rohkem kui negatiivseid.
 */
public class Suusailm {

    public static void main(String[] args) {
        int[] kraadid1 = {11, 10, 5, 1, 3, -2, -6, 2, -13, -24, -9, 0};
        int[] kraadid2 = {-23, -25, -22, -18, -15, -19, -13};
        int rohkem = 0;

        rohkem = arvuta(kraadid1);
        prindi(rohkem);

        rohkem = arvuta(kraadid2);
        prindi(rohkem);
    }

    private static int arvuta(int[] kraadid) {
        int pos = 0;
        int neg = 0;
        for (int i = 0; i < kraadid.length; i++) {
            if (kraadid[i] > 0) {
                pos++;
            } else if (kraadid[i] < 0) {
                neg++;
            }
        }
        int rohkem = pos - neg;
        return rohkem;
    }

    private static void prindi(int rohkem){
        if (rohkem>0){
            System.out.println("Positiivseid on rohkem " + rohkem + " tükki");
        }
        else System.out.println("Positiivseid on vähem!");
    }

}
