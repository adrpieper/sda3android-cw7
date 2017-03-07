package series.object;

/**
 * Created by Adrian on 2017-03-07.
 */
public abstract class Serie {

    public abstract int generate(int i);

    public int sum(int n) {
        int result = 0;
        for(int i = 0 ; i < n; i++) {
            result += generate(i);
        }
        return result;
    }
}
