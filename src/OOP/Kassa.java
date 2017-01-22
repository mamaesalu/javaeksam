package OOP;

import java.util.ArrayList;

public class Kassa {
    String kassapidaja;
    ArrayList kassa;

    public Kassa(String kassas) {
        kassapidaja=kassas;
        kassa = new ArrayList();
    }

    public void lisaToode(String piim) {
        kassa.add(piim);
    }

    public void eemaldaToode(String piim) {
        kassa.remove(piim);
    }

    public void prindiOstutsekk() {
        System.out.println(kassa);
    }

    public void prindiKassapidajaNimi() {
        System.out.println(kassapidaja);
    }
}