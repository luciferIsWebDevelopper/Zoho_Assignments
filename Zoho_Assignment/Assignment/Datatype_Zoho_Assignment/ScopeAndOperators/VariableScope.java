public class VariableScope {
    public static void main(String[] args) {
        int outsideIf = 10;

        if (outsideIf > 5) {
            int insideIf = 20;
            System.out.println("Inside if block:");
            System.out.println("outsideIf: " + outsideIf);
            System.out.println("insideIf: " + insideIf);
        }

        System.out.println("Outside if block:");
        System.out.println("outsideIf: " + outsideIf);
        // The following line will cause a compiler error because insideIf is not in scope here
        // System.out.println("insideIf: " + insideIf);
    }
}