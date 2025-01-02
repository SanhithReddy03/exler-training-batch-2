public class demo3 {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 25;
        int num3 = 20;

        int greatest;

        if (num1 > num2 && num1 > num3) {
            greatest = num1;
        } else if (num2 > num3) {
            greatest = num2;
        } else {
            greatest = num3;
        }

        System.out.println("The greatest number is: " + greatest);
    }
}
