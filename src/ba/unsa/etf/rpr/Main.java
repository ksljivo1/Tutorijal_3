package ba.unsa.etf.rpr;

import static ba.unsa.etf.rpr.Grad.BIHAC;
import static ba.unsa.etf.rpr.Grad.BRCKO;

public class Main {

    public static void main(String[] args) {
        /*MobilniBroj a = new MobilniBroj(62, "569-689");*/
        FiksniBroj a = new FiksniBroj(BRCKO, "790-860");
        System.out.println(a.hashCode());
    }
}
