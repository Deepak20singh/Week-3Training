package sorting.heapsort;
import java.util.Arrays;

import static sorting.heapsort.HeapSort.heapSort;

public class HeapSortMain {
    public static void main(String[] args) {
        int[] arr = {12000, 11345, 13865, 53789, 65333, 70000};//salary

        System.out.println("Before Sorting: " + Arrays.toString(arr));
        heapSort(arr);
        System.out.println("After Sorting:  " + Arrays.toString(arr));

    }
}
