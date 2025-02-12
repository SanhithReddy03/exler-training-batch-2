public class Demo068 {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
       
        int evenCount = 0;

       
        for (int num : arr) {
         
            if (num % 2 == 0) {
                evenCount++;
            }
        }

     
        System.out.println("The number of even numbers in the array is: " + evenCount);
    }
}
