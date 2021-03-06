package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Created by Adrian on 2017-03-07.
 */
public class StreamExercises {

    public static void main(String[] args) {
        zad4();
    }

    private static void zad4() {
        List<Integer> numbers = Arrays.asList(1, 25, 30, 31, 23, 15, 16, 3, 5, 30);
        int sum = numbers.stream().reduce((a,b) -> a+b).get();

        // Dodatkowe przykłady
        System.out.println(sum);
        int max = numbers.stream().reduce(Math::max).get();
        System.out.println(max);
        final Random random = new Random();
        int r = numbers.stream().reduce((a,b) -> random.nextBoolean() ? a : b).get();
        System.out.println(r);
    }

    private static void zad3() {
        List<Integer> numbers = Arrays.asList(1, 25, 30, 31, 23, 15, 16, 3, 5, 30);
        numbers.stream()
                .map(StreamExercises::isLessThanTen)
                .forEach(System.out::println);

        // Jakiś dodatkowy przykład
        numbers.stream()
                .map((i) -> i+1000) // do każdej liczby w strumieniu dodaje 1000
                .forEach((b) -> System.out.println("w = " + b));
    }

    private static void zad2() {
        List<Integer> number = Arrays.asList(1, 25, 30, 31, 23, 15, 16, 3, 5, 30);
        List<Integer> lessThanTenList = number.stream()
                .filter(StreamExercises::isLessThanTen)
                .collect(Collectors.toList());
        lessThanTenList.forEach(System.out::println);
        System.out.println();

        List<Integer> dividedByThreeList = number.stream()
                .filter(StreamExercises::isDividedByThree)
                .collect(Collectors.toList());
        dividedByThreeList.forEach(System.out::println);
        System.out.println();


        List<Integer> fiveOnEndList = number.stream()
                .filter(StreamExercises::isFiveOnEnd)
                .collect(Collectors.toList());
        fiveOnEndList.forEach(System.out::println);
        System.out.println();
    }

    public static boolean isLessThanTen(int i) {
        return i < 10;
    }

    public static boolean isDividedByThree(int i){
        int reszta = i%3;
        boolean czyZero = (reszta==0);
        return czyZero;
    }

    public static boolean isFiveOnEnd(Integer i){
        String text = i.toString();
        char lastChar = text.charAt(text.length()-1);
        return lastChar == '5';
    }

    private static void zad1() {
        List<Integer> number = Arrays.asList(1,25,30,31,23,15,16,3,5,30);
        number.stream().forEach(System.out::println);
        System.out.println();

        number.stream().filter(StreamExercises::isLessThanTen).forEach(System.out::println);
        System.out.println();

        number.stream().filter(StreamExercises::isDividedByThree).forEach(System.out::println);
        System.out.println();

        number.stream().filter(StreamExercises::isFiveOnEnd).forEach(System.out::println);
        System.out.println();
    }
}


