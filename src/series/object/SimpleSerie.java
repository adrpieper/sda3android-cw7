package series.object;

/**
 * Created by Adrian on 2017-03-07.
 */
public class SimpleSerie extends Serie {
    @Override
    public int generate(int i) {
        return 2*i+5;
    }
}
