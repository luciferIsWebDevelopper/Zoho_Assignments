import java.util.Scanner;

class BirdWatcher {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last week details: ");

        int[] lastWeek = new int[7];
        for (int i = 0; i < 7; i++) {
            lastWeek[i] = sc.nextInt();
        }
        System.out.println("Enter the current week details: ");
        int[] currentWeek = new int[7];
        for (int i = 0; i < 7; i++) {
            currentWeek[i] = sc.nextInt();
        }
        new BirdWatcher().getLastWeek(lastWeek);
        new BirdWatcher().getToday(currentWeek);
        new BirdWatcher().incrementTodaysCount(currentWeek);
        new BirdWatcher().hasDayWithoutBirds(currentWeek);
        new BirdWatcher().getCountForFirstDays(currentWeek, 3);
        new BirdWatcher().getBusyDays(currentWeek);
    }

    void getLastWeek(int[] lastWeek) {
        System.out.println("Last week: ");
        for (int i = 0; i < 7; i++) {
            System.out.print(lastWeek[i] + " ");
        }
    }

    void getToday(int[] currentWeek) {
        System.out.println("\nToday: " + currentWeek[currentWeek.length - 1]);
    }

    void incrementTodaysCount(int[] currentWeek) {
        currentWeek[currentWeek.length - 1]++;
        System.out.println("Today's count after increment: " + currentWeek[currentWeek.length - 1]);
    }

    void hasDayWithoutBirds(int[] currentWeek) {
        boolean hasDayWithoutBirds = false;
        for (int i = 0; i < currentWeek.length; i++) {
            if (currentWeek[i] == 0) {
                hasDayWithoutBirds = true;
                break;
            }
        }
        System.out.println("Has day without birds: " + hasDayWithoutBirds);
    }

    void getCountForFirstDays(int[] currentWeek, int n) {
        int c = 0;
        for (int j = 0; j < n; j++) {
            c += currentWeek[j];
        }
        System.out.println("Count for first " + n + " days: " + c);
    }

    void getBusyDays(int[] currentWeek) {
        int busy = Integer.MIN_VALUE;
        for (int i = 0; i < currentWeek.length; i++) {
            if (currentWeek[i] > busy) {
                busy = currentWeek[i];
            }
        }
        System.out.println("Busy days: " + busy);
    }
}