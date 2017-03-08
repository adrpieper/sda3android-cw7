package format;

/**
 * Created by Adrian on 2017-03-08.
 */
public class JsonFormatter implements DataFormatter {

    @Override
    public void format(Person p) {
        System.out.println("{\n" +
                "\t“name” : “"+p.getName()+"”\n" +
                "\t“surname” : “"+p.getSurname()+"”\n" +
                "\t“age” : "+p.getAge()+"\n" +
                "}\n");
    }

    @Override
    public void format(Car car) {
        System.out.println("{}");
    }
}
