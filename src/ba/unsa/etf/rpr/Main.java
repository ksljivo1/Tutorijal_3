package ba.unsa.etf.rpr;

import static ba.unsa.etf.rpr.Grad.BIHAC;
import static ba.unsa.etf.rpr.Grad.BRCKO;

public class Main {

    public static void main(String[] args) {
        MobilniBroj c = new MobilniBroj(62, "569-689");
        FiksniBroj b = new FiksniBroj(BRCKO, "790-860");
        MedunarodniBroj a = new MedunarodniBroj("+31", "09-039");
        Imenik k = new Imenik();
        k.dodaj("Mujo", c);
        k.dodaj("Hamo", b);
        k.dodaj("Avdo", a);
        k.dodaj("Mrav", new MobilniBroj(69, "989-632"));
        System.out.println(k.naSlovo('M'));
    }
}
