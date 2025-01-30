import java.util.Scanner;
class Demo055 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int square = number * number;
        System.out.println("Square of " +number+ " is " +square);
        sc.close();
    }
}