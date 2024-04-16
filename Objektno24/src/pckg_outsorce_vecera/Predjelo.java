package pckg_outsorce_vecera;

public class Predjelo {
    protected String naziv;
    protected String vrsta;
    protected int kol;

    public Predjelo(String naziv, String vrsta, int kol) {
        this.kol = kol;
        this.naziv = naziv;
        this.vrsta = vrsta;
    }

    public void pojediPredjelo(){
        System.out.println("Pojedeno: " + getClass().getSimpleName() + " | " + naziv + " | " + kol );
    }

    int kojaKolicina(){
        return kol;
    }
}
