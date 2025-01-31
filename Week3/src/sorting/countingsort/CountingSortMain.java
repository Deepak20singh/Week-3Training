package sorting.countingsort;

import java.util.Arrays;

import static sorting.countingsort.CountingSort.countingSort;

public class CountingSortMain {
    public static void main(String[] args) {
        int[] ages = {12, 14, 10, 18, 17, 11, 15, 12, 14, 16, 18, 13, 10};

        System.out.println("Before Sorting: " + Arrays.toString(ages));
        countingSort(ages,10,18);
        System.out.println("After Sorting: " + Arrays.toString(ages));

    }
}
