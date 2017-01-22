package OOP;

public class Zelda {
    private int elud;

    public Zelda(int elusid) {
        elud = elusid;
    }

    public void kaklusKolliga(int kollilElusid) {
        elud = elud - kollilElusid;
    }

    public void prindiMituEluAlles() {
        System.out.println(elud);
    }

    public void prindiKasOnElus() {
        if (elud > 0){
            System.out.println("Elus");
        }
        else System.out.println("Surnud");
    }
}
