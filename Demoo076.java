
public class Demoo076 {
    public static void main(String[] args) {
        int[] array = { 12, 35, 1, 10, 34, 1 };
       

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int element : array) {
            if (element > largest) {
                secondLargest = largest;
                largest = element;
            } else if (element > secondLargest && element != largest) {
                secondLargest = element;
            }
        }

        System.out.println("Second largest element: " + secondLargest);
    }
}