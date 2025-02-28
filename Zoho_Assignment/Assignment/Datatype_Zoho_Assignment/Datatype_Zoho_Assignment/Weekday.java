import java.util.Scanner;

enum Days{
SUNDAY,
MONDAY,
TUESDAY,
WEDNESDAY,
THURSDAY,
FRIDAY,
SATURDAY
}
public class Weekday {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int day=in.nextInt();
        System.out.println("The Day is: "+Days.values()[day-1]);
        in.close();
    }
}
