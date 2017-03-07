package series;

import java.util.function.Function;

/**
 * Created by Adrian on 2017-03-07.
 */
public class FunctionExample {

    public static void main(String[] args) {

        System.out.println("sum("+5+")=" + sum(5,FunctionExample::generateSeries));
        System.out.println("sum("+5+")=" + sum(5,(i) -> 2*i+5));

    }

    public static int sum(int n, Function<Integer,Integer> series) {
        int result = 0;
        for(int i = 0 ; i < n; i++) {
            result += series.apply(i);
        }
        return result;
    }

    public static int generateSeries (int i){
        return 2*i+5;
    }
}
