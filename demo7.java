import java.util.*;
public class demo7{

   public static void main(String[] args) {
    String name;
    int age;
    long phno;
    Scanner sc = new Scanner(System.in);


    System.out.println("Enter the name");
    name = sc.nextLine();
    System.out.println("Enter the age");
    age = sc.nextInt();
    System.out.println("Enter the phno");
    phno = sc.nextLong();
    System.out.println("Hello "+name+"ur age is "+age+"ur phno number is "+phno);
 }
}