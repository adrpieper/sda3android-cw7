package function;

/**
 * Created by Adrian on 2017-03-06.
 */
public class Main {

    public static void main(String[] args) {
        NumberGenerator generator = new FourGenerator();
        System.out.println(generator.generate());
        generator = new NumberGenerator() {
            @Override
            public int generate() {
                return 10;
            }
        };
        System.out.println(generator.generate());
        generator = () -> 8;
        System.out.println(generator.generate());
        generator = () -> {
            return 12;
        };
        System.out.println(generator.generate());
        generator = Main::generateOne;
        System.out.println(generator.generate());

    }

    public static int generateOne() {
        return 1;
    }
}
