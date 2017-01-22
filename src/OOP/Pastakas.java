package OOP;

public class Pastakas {
    int tintiAlles;


    public Pastakas(int tindiKogus) {
        tintiAlles = tindiKogus;
    }

    public void kirjuta(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isSpaceChar(s.charAt(i))) {
                tintiAlles--;
            }
            if (tintiAlles>=0){
                System.out.print(s.charAt(i));
            }
        }
        System.out.println();
    }

    public void prindiPaljuTintiAlles() {
        System.out.println(tintiAlles);
    }
}