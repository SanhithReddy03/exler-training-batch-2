public class Demoo77 {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] copiedArray = new int[originalArray.length];
        
        for (int i = 0; i < originalArray.length; i++) {
            int temp = originalArray[i];  
            copiedArray[i] = temp;   
        }
        
        System.out.print("Copied Array: ");
        for (int i = 0; i < copiedArray.length; i++) {
            System.out.print(copiedArray[i] + " ");
        }
    }
}
