package function;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Adrian on 2017-03-06.
 */
public class Example {

    public static void main(String[] args) {
        Function<Integer, Double> divideByTwo = (Integer i) -> {
            double result = i/2.0;
            return result;
        };
        System.out.println(divideByTwo.apply(6));
        Consumer<Double> doublePrinter = System.out::println;
        doublePrinter.accept(10.0);
        Predicate<String> longerThanFive = text -> text.length() > 5;
        System.out.println(longerThanFive.test("haha"));
        System.out.println(longerThanFive.test("hahaha"));
    }


}
