package kompozycja;

/**
 * Created by Adrian on 2017-03-08.
 */
public class Adres {
    private String ulica;
    private String miasto;
    private int numerDomu;

    public Adres() {}

    // Factory method
    public static Adres createAdres(String ulica, String miasto, int numerDomu){
        Adres adres = new Adres();
        adres.ulica = ulica;
        adres.miasto = miasto;
        adres.numerDomu = numerDomu;
        return adres;
    }

    public Adres(String ulica, String miasto, int numerDomu) {
        this.ulica = ulica;
        this.miasto = miasto;
        this.numerDomu = numerDomu;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public int getNumerDomu() {
        return numerDomu;
    }

    public void setNumerDomu(int numerDomu) {
        this.numerDomu = numerDomu;
    }
}
