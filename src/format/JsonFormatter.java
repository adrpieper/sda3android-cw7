package format;

/**
 * Created by Adrian on 2017-03-08.
 */
public class JsonFormatter implements DataFormatter {

    @Override
    public void format(Person person) {
        System.out.println("{}");
    }

    @Override
    public void format(Car car) {
        System.out.println("{}");
    }
}
