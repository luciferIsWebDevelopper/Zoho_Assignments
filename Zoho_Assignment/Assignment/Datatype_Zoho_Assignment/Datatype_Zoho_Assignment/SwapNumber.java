public class SwapNumber {
    public static void main(String[] args) {
        int firstNumber=12;
        int secondNumber=43;
        firstNumber=firstNumber+secondNumber-(secondNumber=firstNumber);
        System.out.println(firstNumber);
        System.out.println(secondNumber);
    }
}
