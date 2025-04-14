public class Maths {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    int divide(int a, int b) {
        if (b == 0) {
            System.out.println("division by zero is not allowed");
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    double divide(double a, double b) {
        if (b == 0.0) {
            System.out.println("division by zero is not allowed");
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Maths math = new Maths();
        System.out.println("Addition of 5 and 3: " + math.add(5, 3));
        System.out.println("Addition of 5.5 and 3.2: " + math.add(5.5, 3.2));
        System.out.println("Subtraction of 5 and 3: " + math.subtract(5, 3));
        System.out.println("Subtraction of 5.5 and 3.2: " + math.subtract(5.5, 3.2));
        System.out.println("Multiplication of 5 and 3: " + math.multiply(5, 3));
        System.out.println("Multiplication of 5.5 and 3.2: " + math.multiply(5.5f, 3.2));
        System.out.println("Division of 6 by 3: " + math.divide(6, 3));
        System.out.println("Division of 6.0 by 3.0: " + math.divide(6.0, 3.0));
        System.out.println("Division of 6 by 0: " + math.divide(6, 0));
    }
}
