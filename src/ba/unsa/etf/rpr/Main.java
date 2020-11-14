package ba.unsa.etf.rpr;

import java.util.Set;

import static ba.unsa.etf.rpr.Grad.BIHAC;
import static ba.unsa.etf.rpr.Grad.BRCKO;
import static ba.unsa.etf.rpr.Grad.SARAJEVO;

public class Main {

    public static void main(String[] args) {
        /*MobilniBroj c = new MobilniBroj(62, "569-689");
        FiksniBroj b = new FiksniBroj(BRCKO, "790-860");
        MedunarodniBroj a = new MedunarodniBroj("+31", "09-039");
        Imenik k = new Imenik();
        k.dodaj("Mujo", c);
        k.dodaj("Hamo", b);
        k.dodaj("Avdo", a);
        k.dodaj("Mrav", new MobilniBroj(69, "989-632"));
        k.dodaj("Auto", new FiksniBroj(BRCKO, "790-871"));
        k.dodaj("Zmija", new FiksniBroj(BRCKO, "700-151"));
        k.dodaj("Bosna", new FiksniBroj(BRCKO, "150-351"));
        k.dodaj("Lampa", new FiksniBroj(BIHAC, "156-331"));
        System.out.println(k.izGrada(BRCKO));
        for(TelefonskiBroj papa : k.izGradaBrojevi(BRCKO)) {
            System.out.println(papa.ispisi());
        }*/
        Imenik imenik = new Imenik();
        imenik.dodaj("Ivo Ivic", new FiksniBroj(SARAJEVO, "123-456"));
        imenik.dodaj("Sara Sarac", new FiksniBroj(SARAJEVO, "123-156"));
        imenik.dodaj("Meho Mehic", new FiksniBroj(SARAJEVO, "123-656"));
        imenik.dodaj("Pero Peric", new MobilniBroj(64, "987-654"));
        imenik.dodaj("John Smith", new MedunarodniBroj("+1", "23 45-67-89"));
        Set<TelefonskiBroj> set = imenik.izGradaBrojevi(SARAJEVO);
        String result = "";
        for (TelefonskiBroj broj : set) {
            result += broj.ispisi() + ",";
        }
        System.out.println(result);
    }
}
