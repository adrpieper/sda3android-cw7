package array.object;

/**
 * Created by Adrian on 2017-03-06.
 */
public abstract class ArrayTask {
    private int[] data;

    public void setData(int[] data) {
        this.data = data;
    }

    protected abstract void doTask(int i);

    public void runTask() {
        for (int i : data) {
            doTask(i);
        }
    }
}
