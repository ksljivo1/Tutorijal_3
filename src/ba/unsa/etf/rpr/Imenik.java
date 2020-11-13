package ba.unsa.etf.rpr;

import java.util.HashMap;
import java.util.Iterator;

public class Imenik {
    private HashMap<String, TelefonskiBroj> imenik = new HashMap<>();

    public void dodaj(String ime, TelefonskiBroj broj) {
        imenik.put(ime, broj);
    }

    public String dajBroj(String ime) {
        return imenik.get(ime).ispisi();
    }

    public String dajIme(TelefonskiBroj broj) {
        Iterator it = imenik.entrySet().iterator();
        while(it.hasNext()) {
            HashMap.Entry pair = (HashMap.Entry)it.next();
            if(pair.getValue().equals(broj)) return (String)pair.getKey();
        }
        return null;
    }
}
