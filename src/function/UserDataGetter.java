package function;

import java.util.Scanner;

/**
 * Created by Adrian on 2017-03-06.
 */
public class UserDataGetter {

    private String name;

    public static void main(String[] args) {
        UserDataGetter userDataGetter = new UserDataGetter();
        userDataGetter.getData();
        userDataGetter.showData();
    }

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię:");
        name = scanner.next();
        scanner.close();
    }

    public void showData() {
        System.out.println(name);
    }
}
