package kompozycja;

/**
 * Created by Adrian on 2017-03-08.
 */
public class TypFirmyTest {

    public static void main(String[] args) {

        TypFirmy typFirmy = TypFirmy.SPOLKA_JAWNA;
        TypButow typButow = TypButow.KALOSZE;
        // Nie mogę tego zrobić, bo zmienna jest finalna
        // TypFirmy.SPOLKA_JAWNA = TypFirmy.SPOLKA_ZOO;
        TypButow.KALOSZE = TypButow.KAPCIE;
    }
}
