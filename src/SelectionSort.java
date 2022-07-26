import java.util.Arrays;
public class SelectionSort {

    public static int[] sort(int[] arr)  {
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
                return arr;
    }
    }

