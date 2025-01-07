
import java.util.Scanner;

public class Areaofcircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

    
        double area = Math.PI * Math.pow(radius, 2);

        
        System.out.println("The area of the circle is: " + area);
    }
}


This program uses the Scanner class to read the radius input from the user, calculates the area using the formula $$\text{area} = \pi \times \text{radius}^2$$, and then prints the result.