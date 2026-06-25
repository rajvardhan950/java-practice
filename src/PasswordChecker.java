
import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Set your password\n");
        String password;
        do {
            System.out.print("please enter your password");
            password = input.next();

        } while (!isValidPassword(password));
        System.out.println("thanks for entering the correct password");

    }

    public static boolean isValidPassword(String password) {
        return password.length() > 6;
    }
}

