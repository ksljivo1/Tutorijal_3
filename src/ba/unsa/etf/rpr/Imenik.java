package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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

    public Set<String> izGrada(Grad grad) {
        Set<String> gradovi = new TreeSet<String>();
        for(String ime : imenik.keySet()) {
            if(imenik.get(ime) instanceof FiksniBroj &&
            FiksniBroj.dajPozivniBroj(grad) == Character.getNumericValue(imenik.get(ime).ispisi().charAt(1)) * 10 +
            Character.getNumericValue(imenik.get(ime).ispisi().charAt(2)))
                gradovi.add(ime);
        }
        return gradovi;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(Grad g) {
        Set<TelefonskiBroj> brojevi = new TreeSet<TelefonskiBroj>(new Comparator<TelefonskiBroj>() {
            @Override
            public int compare(TelefonskiBroj o1, TelefonskiBroj o2) {
                return o1.ispisi().compareTo(o2.ispisi());
            }
        });
        for(String ime : imenik.keySet()) {
            if(imenik.get(ime) instanceof FiksniBroj &&
            FiksniBroj.dajPozivniBroj(g) == Character.getNumericValue(imenik.get(ime).ispisi().charAt(1)) * 10 +
            Character.getNumericValue(imenik.get(ime).ispisi().charAt(2)))
                brojevi.add(imenik.get(ime));
        }
        return brojevi;
    }
}
