package Assignment.Strings;

import java.util.Scanner;

public class SqueakyClean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        SqueakyClean squeakyClean = new SqueakyClean();
        squeakyClean.clean(str);

    }

    void clean(String str) {
        String cleanStr = str.replaceAll(" ", "_");
        cleanStr = cleanStr.replaceAll("4", "a");
        cleanStr = cleanStr.replaceAll("3", "e");
        cleanStr = cleanStr.replaceAll("0", "O");
        cleanStr = cleanStr.replaceAll("1", "l");
        cleanStr = cleanStr.replaceAll("7", "t");
        for (int j = 0; j < cleanStr.length(); j++) {
            if (cleanStr.charAt(j) == '-') {
                cleanStr = cleanStr.substring(0, j) + cleanStr.substring(j + 1, j + 2).toUpperCase()
                        + cleanStr.substring(j + 2);
            }
        }
        cleanStr = cleanStr.replaceAll("[^a-zA-Z0-9_]", "");
        System.out.println("Cleaned string: " + cleanStr);
    }
}
