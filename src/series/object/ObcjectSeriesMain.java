package series.object;

/**
 * Created by Adrian on 2017-03-07.
 */
public class ObcjectSeriesMain {

    public static void main(String[] args) {
        Serie serie = new SimpleSerie();
        System.out.println(serie.sum(5));

        Serie constantSerie = new Serie() {
            @Override
            public int generate(int i) {
                return 5;
            }
        };

        System.out.println(constantSerie.sum(5));
        Serie some = new SomeSerie();
        System.out.println(some.sum(5));
    }

    static class SomeSerie extends Serie {

        @Override
        public int generate(int i) {
            return i+10;
        }
    }
}
