package array.object;

/**
 * Created by Adrian on 2017-03-06.
 */
public class ArrayObjectMain {

    public static void main(String[] args) {
        int [] numbers = {1,5,12,90};
        ArrayTask arrayTask = new ArrayPrinter();
        arrayTask.setData(numbers);
        arrayTask.runTask();
        ArrayTask annonymousTask = new ArrayTask() {
            @Override
            protected void doTask(int i) {
                System.out.println(i*i);
            }
        };
        annonymousTask.setData(numbers);
        annonymousTask.runTask();
    }
}
