package OOP;


import java.util.HashMap;

public class Chat {

    HashMap chat;
    String tuba;

    public Chat(String toaNimi) {
        tuba = toaNimi;
        chat = new HashMap();
    }

    public void sisestaSonum(String nimi, String sonum){
        chat.put(sonum, nimi);
    }


    public void prindiKoikSonumidKoosKasutajanimega() {
        System.out.println(chat);
    }

    public void adminKustutabSonumi(String s) {
        chat.remove(s);
    }

    public void prindiToaNimi() {
        System.out.println(tuba);
    }
}
