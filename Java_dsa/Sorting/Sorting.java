import java.lang.reflect.Array;
import java.util.Arrays;

public class Sorting {

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped)
                break;
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        int n = arr.length;
        for(int i=1; i < n; i++){
            int j = i - 1;
            int temp = arr[i];
            while (j >= 0 && arr[j] > temp) {    
                // arr[j] > temp ==> 10, | 1, 5, 3, 9, 2, 6, 8, 0, -1, 1 arr[j] = 10 and temp = 1
                // so replace a[j+1] i.e 1st index with 0th index and now 1 is placed its position until
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr1 = {10, 1, 5, 3, 9, 2, 6, 8, 0, -1, 1};
        int[] arr2 = {10, 1, 5, 3, 9, 2, 6, 8, 0, -1, 1};
        arr1 = Sorting.bubbleSort(arr1);
        arr2 = Sorting.insertionSort(arr2);
        Arrays.stream(arr1).forEach(x-> System.out.print(x + " "));
        System.out.println("\n----------------------------------");
        Arrays.stream(arr2).forEach(x-> System.out.print(x + " "));
        
    }
}
