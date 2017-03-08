package kompozycja;

/**
 * Created by Adrian on 2017-03-08.
 */
public class Pracownik {
    private String imie;
    private String nazwisko;
    private Adres adres;

    public Pracownik(String imie, String nazwisko, Adres adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public String getMiasto(){
        return adres.getMiasto();
    }
}
