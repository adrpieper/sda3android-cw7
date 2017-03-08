package kompozycja;

/**
 * Created by Adrian on 2017-03-08.
 */
public class TypButow {
    public final static TypButow KAPCIE = new TypButow(10);
    public static TypButow KALOSZE = new TypButow(12);

    private int rozmiar;

    private TypButow(int rozmiar) {
        this.rozmiar = rozmiar;
    }
}
