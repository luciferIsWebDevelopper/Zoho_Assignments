package Assignment.Arrays;

import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the number of rotations: ");
        int k = scanner.nextInt();
        int[] rotatedArr = new int[n];
        for (int i = 0; i < n; i++) {
            rotatedArr[(i + k) % n] = arr[i];
        }
        System.out.println("Array after " + k + " rotations:");
        for (int i = 0; i < n; i++) {
            System.out.print(rotatedArr[i] + " ");
        }
        scanner.close();
    }

}
