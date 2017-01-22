package OOP;

import java.util.ArrayList;

public class Sonaraamat {
    private String keel;
    private ArrayList<String> soned = new ArrayList<String>();

    public Sonaraamat(String raamatuKeel) {
        keel = raamatuKeel;
    }

    public void sisestaSona(String puaas) {
        soned.add(puaas);
    }

    public String[] otsiEsimeseTaheJargi(String u) {
        ArrayList<String> vasted = new ArrayList();
        char esimeneTaht = u.charAt(0);
        for (int i = 0; i < soned.size(); i++) {
            String sone = soned.get(i);
            if (soned.get(i).charAt(0) == esimeneTaht){
                vasted.add(sone);
            }
        }
        String[] needsoned = new String[vasted.size()];
        for (int j = 0; j < vasted.size(); j++) {
            needsoned[j] = vasted.get(j);
        }
        return needsoned;
    }

    public void eemaldaSona(String s) {
        soned.remove(s);
    }

    public void misKeelesRaamatOn() {
        System.out.println(keel);
    }
}
