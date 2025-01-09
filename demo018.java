import java.util.Scanner;

public class demo018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of hours: ");
        int hours = scanner.nextInt();

        int seconds = convertHoursToSeconds(hours);
        System.out.println(hours + " hours is equal to " + seconds + " seconds.");

        scanner.close();
    }

    public static int convertHoursToSeconds(int hours) {
        return hours * 3600;
    }
}