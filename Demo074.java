public class SortArray{
    void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = 0;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }


class Demo074{


    public static void main(String[] args) {
        SortArray obj = new SortArray();
        int[] arr = {10, 5, 16, 3, 2, 8};
        obj.sort(arr);
    }
}
