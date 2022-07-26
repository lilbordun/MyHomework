import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 15);
        }
        System.out.println("Initial array :" + Arrays.toString(arr));
         SelectionSort.sort(arr);

        System.out.println("Sorted array :" + Arrays.toString(arr));
    }

}