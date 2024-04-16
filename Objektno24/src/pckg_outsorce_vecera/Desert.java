package pckg_outsorce_vecera;

public class Desert {
    private String naziv;
    int kol;

    public Desert(String naziv, int kol) {
        this.kol = kol;
        this.naziv = naziv;
    }

    public void info(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Desert{" +
                "naziv='" + naziv + '\'' +
                ", kol=" + kol +
                '}';
    }
}
