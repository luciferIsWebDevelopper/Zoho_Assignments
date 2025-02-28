import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int andResult = num1 & num2;
        int orResult = num1 | num2;
        int xorResult = num1 ^ num2;
        int leftShift1 = num1 << 1;
        int leftShift2 = num2 << 1;
        int rightShift1 = num1 >> 1;
        int rightShift2 = num2 >> 1;
        int rightShiftZeroFill = num2 >>> 1;
        
        System.out.println("Bitwise AND (num1 & num2): " + andResult);
        System.out.println("Bitwise OR (num1 | num2): " + orResult);
        System.out.println("Bitwise XOR (num1 ^ num2): " + xorResult);
        System.out.println("Left Shift (num1 << 1): " + leftShift1);
        System.out.println("Left Shift (num2 << 1): " + leftShift2);
        System.out.println("Right Shift (num1 >> 1): " + rightShift1);
        System.out.println("Right Shift (num2 >> 1): " + rightShift2);
        System.out.println("Right Shift with Zero Fill (num2 >>> 1): " + rightShiftZeroFill);

        scanner.close();
    }
}
