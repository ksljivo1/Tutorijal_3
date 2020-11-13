package ba.unsa.etf.rpr;

public class MobilniBroj extends TelefonskiBroj {
    private int mobilnaMreza;
    private String broj;

    MobilniBroj(int mobilnaMreza, String broj) {
       this.broj = broj;
       this.mobilnaMreza = mobilnaMreza;
    }

    @Override
    public String ispisi() {
        return "0" + ((Integer)mobilnaMreza).toString() + "/" + broj;
    }

    @Override
    public int hashCode() {
        return broj.hashCode() + mobilnaMreza;
    }
}
