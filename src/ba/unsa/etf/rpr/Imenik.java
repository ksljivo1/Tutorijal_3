package ba.unsa.etf.rpr;

import java.util.HashMap;
import java.util.Iterator;

public class Imenik {
    private HashMap<String, TelefonskiBroj> imenik = new HashMap<String, TelefonskiBroj>();

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

    public String naSlovo(char s) {
        Integer i = 0;
        String imena = "";
        for(String ime : imenik.keySet()) {
            if(ime.charAt(0) == s) {
                i++;
                imena = imena + i.toString() + ". " + ime + " - " + imenik.get(ime).ispisi() + "\n";
            }
        }
        return imena;
    }
}
