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
        firma.add(new Pracownik(
                "Jan",
                "Dominik",
                new Adres("Złota","Gdańsk",26)
        ));

        show(firma);
    }

    public static void show(Firma firma){

        System.out.println(firma.getNazwa() + "(" + firma.getTyp() + ")");
        show(firma.getAdres());
        for (Pracownik pracownik : firma.getPracownicy()) {
            show(pracownik);
        }
    }

    public static void show(Pracownik pracownik){
        System.out.println(" Pracownik : " +pracownik.getImie() + " " + pracownik.getNazwisko());
        show(pracownik.getAdres());
    }


    public static void show(Adres adres){
        System.out.println("adres : ");
        System.out.println(adres.getMiasto());
        System.out.println("ul. " + adres.getUlica() + " " + adres.getNumerDomu());

    }
}
