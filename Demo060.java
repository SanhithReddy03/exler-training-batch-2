import java.util.Scanner;

public class Demo060 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        int firstTerm = 0, secondTerm = 1;
        System.out.print("Fibonacci Series: " + firstTerm + ", " + secondTerm);

        for (int i = 1; i <= n - 2; ++i) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(", " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
