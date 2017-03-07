package stream;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Adrian on 2017-03-07.
 */
public class StreamExercises {

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,25,30,31,23,15,16,3,5,30);
        number.stream().forEach(System.out::println);
        number.stream().filter((i) -> i<10).forEach(System.out::println);
        number.stream().filter((Integer i) -> {
            int reszta = i%3;
            boolean czyZero = (reszta==0);
            return czyZero;
        }).forEach(System.out::println);
    }
}

