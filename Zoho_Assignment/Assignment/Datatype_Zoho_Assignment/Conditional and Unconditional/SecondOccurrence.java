public class SecondOccurrence {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6};
        int numberToFind = 2;
        int occurrence = 0;
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToFind) {
                occurrence++;
                if (occurrence == 2) {
                    index = i;
                    break;
                }
            }
        }

        if (index != -1) {
            System.out.println("The second occurrence of number " + numberToFind + " is at index: " + index);
        } else {
            System.out.println("The number " + numberToFind + " does not occur twice in the array.");
        }
    }
}
