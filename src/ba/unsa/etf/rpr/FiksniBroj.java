package ba.unsa.etf.rpr;

public class FiksniBroj extends TelefonskiBroj {
    private Grad grad;
    private String broj;

    static Integer dajPozivniBroj(Grad grad) {
        switch(grad) {
            case BIHAC:
                return 37;
            case ORASJE:
                return 31;
            case TUZLA:
                return 35;
            case ZENICA:
                return 32;
            case GORAZDE:
                return 38;
            case TRAVNIK:
                return 30;
            case MOSTAR:
                return 36;
            case SIROKIBRIJEG:
                return 39;
            case SARAJEVO:
                return 33;
            case LIVNO:
                return 34;
            case BRCKO:
                return 49;
        }
        return 0;
    }
    public FiksniBroj(Grad grad, String broj) {
        this.grad = grad;
        this.broj = broj;
    }

    @Override
    public String ispisi() {
        return "0" + dajPozivniBroj(grad).toString() + "-" + broj;
    }

    @Override
    public int hashCode() {
        return dajPozivniBroj(grad) + broj.hashCode();
    }

}
