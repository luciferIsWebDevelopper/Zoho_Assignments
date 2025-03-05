package Assignment.Strings;

import java.util.Scanner;

public class ValidateEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        boolean isValid = false;
        if (email.contains("@") && email.contains(".")) {
            isValid = true;
        }
        System.out.println("Is the email valid: " + isValid);
        scanner.close();
    }
}
