import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 15);
        }
        System.out.println("Initial array :" + Arrays.toString(arr));
for (int n = 0; n < arr.length; n++){
    int start = n;
    for (int j = n + 1; j < arr.length; j++){
        if (arr[j] < arr[start]){
            start = j;}
            }
    int temp = arr[n];
    arr[n] = arr[start];
    arr[start] = temp;
}
        System.out.println("Sorted array :" + Arrays.toString(arr));
        }
    }

