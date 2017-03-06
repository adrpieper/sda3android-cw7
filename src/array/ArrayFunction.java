package array;

import java.util.function.Consumer;

/**
 * Created by Adrian on 2017-03-06.
 */
public class ArrayFunction {

    public static void main(String[] args) {
        int[] numbers = {1,32,43,12};
        doForEach(numbers, new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        doForEach(numbers, System.out::println);
        doForEach(numbers, (i) -> {
            System.out.println(i*i);
        });
        doForEach(numbers,ArrayFunction::multiplyAndPrint);
    }

    public static void doForEach(int[] tab, Consumer<Integer> task){
        for (int n : tab) {
            task.accept(n);
        }
    }

    public static void multiplyAndPrint(int i) {
        System.out.println(i*i);
    }
}
