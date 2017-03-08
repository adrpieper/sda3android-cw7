package format;

/**
 * Created by Adrian on 2017-03-08.
 */
public class XmlFormatter implements DataFormatter {

    @Override
    public void format(Person person) {
        System.out.println("<person/>");
    }

    @Override
    public void format(Car car) {
        System.out.println("<car/>");
    }
}
