package kompozycja;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian on 2017-03-08.
 */
public class Firma {
    private String nazwa;
    private List<Pracownik> pracownicy;
    private TypFirmy typ;
    private Adres adres;

    public Firma(String nazwa, TypFirmy typ, Adres adres) {
        this.nazwa = nazwa;
        this.adres = adres;
        this.pracownicy = new ArrayList<>();
        this.typ = typ;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public List<Pracownik> getPracownicy() {
        return pracownicy;
    }

    public void setPracownicy(List<Pracownik> pracownicy) {
        this.pracownicy = pracownicy;
    }

    public TypFirmy getTyp() {
        return typ;
    }

    public void setTyp(TypFirmy typ) {
        this.typ = typ;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public void add(Pracownik pracownik) {
        pracownicy.add(pracownik);
    }
}
