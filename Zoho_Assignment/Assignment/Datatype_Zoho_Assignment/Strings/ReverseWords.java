package Assignment.Strings;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String reverse = "";
        String[] words = str.split(" ");
        for (int j = words.length - 1; j >= 0; j--) {
            reverse += words[j] + " ";
        }
        System.out.println("Reversed words: " + reverse);
        scanner.close();

    }
}
