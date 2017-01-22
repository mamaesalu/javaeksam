package OOP;

import java.util.ArrayList;

public class Korter {
    int max;
    ArrayList korter;

    public Korter(int mahutab) {
        max = mahutab;
        korter = new ArrayList();
    }

    public void saabus(String s) {
        if (korter.size() < 10){
            korter.add(s);
        }
    }

    public void prindiKylalisteArv() {
        System.out.println(korter);
    }

    public void prindiPaljuVeelMahub() {
        System.out.println(max-korter.size());
    }

    public void lahkus(String taavi) {
        korter.remove(taavi);
    }
}
