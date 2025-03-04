package Assignment.Arrays;

import java.util.Scanner;

public class JaggedArray {
    static int[][] arr = {};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Create a jagged array");
            System.out.println("2. Minimum Element of the jagged array of n: ");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the no of weights of the person: "+(arr.length+1));
                    int N = scanner.nextInt();
                    int[] rows = new int[N];
                    for (int i = 0; i < N; i++) {
                        System.out.println("Enter the " + (i + 1) + " weight: ");
                        rows[i] = scanner.nextInt();
                    }
                    arr = addElement(rows);
                    break;
                case 2:
                    System.out.println("Enter the person No who's minimum weight");
                    int n = scanner.nextInt();
                    getMinimum(n-1);
                    break;
                case 3:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter The Valid Choices");
            }

        }

    }

    static int[][] addElement(int[] rows) {
        int[][] temp = new int[arr.length + 1][];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        temp[arr.length] = rows;
        return temp;
    }

    static void getMinimum(int n) {
        if (n >= arr.length || n < 0) {
            System.out.println("Please Enter Valid Person");
        } else {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < arr[n].length; i++) {
                if (min > arr[n][i])
                    min = arr[n][i];
            }
            System.out.println("The Minimum Weigth of the person" + n + "is: " + min);
        }
    }
}