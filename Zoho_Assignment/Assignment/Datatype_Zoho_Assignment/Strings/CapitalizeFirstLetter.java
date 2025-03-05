package Assignment.Strings;

import java.util.Scanner;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        String[] words = str.split(" ");
        for(int i=0;i<words.length;i++){
            words[i]=words[i].substring(0,1).toUpperCase()+words[i].substring(1);
        }
        System.out.println("String with first letter of each word capitalized: "+String.join(" ",words));
        scanner.close();
    }
}
