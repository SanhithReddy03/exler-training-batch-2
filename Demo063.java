public class Demo063 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        
        // First element
        int firstElement = arr[0];
        
        // Last element
        int lastElement = arr[arr.length - 1];
        int  add = firstElement + lastElement;
        
        System.out.println("addition of first and last element is: "+add);
        
    }
}
