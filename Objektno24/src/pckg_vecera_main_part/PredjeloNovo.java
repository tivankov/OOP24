package pckg_vecera_main_part;

import pckg_outsorce_vecera.Predjelo;

public class PredjeloNovo extends Predjelo {

    private String proizvodjac;
    public PredjeloNovo(String naziv, String vrsta, int kol, String pro) {
        super(naziv, vrsta, kol);
        this.proizvodjac = pro;
    }

    @Override
    public String toString() {
        return "PredjeloNovo{" +
                "proizvodjac='" + proizvodjac + '\'' +
                ", naziv='" + naziv + '\'' +
                ", vrsta='" + vrsta + '\'' +
                ", kol=" + kol +
                '}';
    }
}
