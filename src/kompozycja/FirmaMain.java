package kompozycja;

/**
 * Created by Adrian on 2017-03-08.
 */
public class FirmaMain {
    public static void main(String[] args) {
        Firma firma = new Firma(
                "Super Firma",
                TypFirmy.SPOLKA_ZOO,
                new Adres("Kwiatowa","Gdańsk",15)
        );
        Pracownik pracownik = new Pracownik(
                "Jan",
                "Kowalski",
                new Adres("Kwiatowa","Gdańsk",10)
        );
        firma.add(pracownik);


    }

    public static void show(Firma firma){

    }

    public static void show(Pracownik pracownik){

    }


    public static void show(Adres adres){

    }
}
