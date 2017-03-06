package function;

import java.util.Scanner;

/**
 * Created by Adrian on 2017-03-06.
 */
public class SimpleUserDataProgram {

    public static void main(String[] args) {
        showData(getDate());
    }

    public static String getDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię:");
        String name = scanner.next();
        scanner.close();
        return name;
    }

    public static void showData(String name) {
        System.out.println("imię : " + name);
    }


}
