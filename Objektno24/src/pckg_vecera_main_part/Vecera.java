package pckg_vecera_main_part;

import pckg_outsorce_vecera.Desert;
import pckg_outsorce_vecera.Predjelo;

public class Vecera {

    public static void main(String[] args) {
        Predjelo predjelo = new Predjelo("Cezar","Salata", 3);
        GlavnoJelo glavno = new GlavnoJelo();
        Desert desert = new Desert("Sladoled dupli", 2);
        predjelo.pojediPredjelo();
        PredjeloNovo predjeloNovo = new PredjeloNovo("Grčka", "salata", 2, "main");
        predjeloNovo.pojediPredjelo();
        float cijena = glavno.totalPrice();

    }
}
