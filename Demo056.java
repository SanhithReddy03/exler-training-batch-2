import java.util.Scanner;
class Demo056 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
       int  res = number * number * number;
        System.out.println("cube of "+number+ " is "+res);
        sc.close();

    }
    
}