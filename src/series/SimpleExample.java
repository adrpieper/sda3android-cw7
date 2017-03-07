package series;

/**
 * Created by Adrian on 2017-03-07.
 */
public class SimpleExample {

    public static void main(String[] args) {

        System.out.println("sum("+5+")=" + sum(5));

    }

    public static int sum(int n) {
        int result = 0;
        for(int i = 0 ; i < n; i++) {
            result += 2*i+5;
        }
        return result;
    }
}
