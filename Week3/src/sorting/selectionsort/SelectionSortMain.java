package sorting.selectionsort;

import java.util.Arrays;

public class SelectionSortMain {
    public static void main(String[] args) {
        SelectionSort s=new SelectionSort();
        int[] arr={3,4,2,1,6,8};
        int[] res=s.sorting(arr);
        System.out.println(Arrays.toString(res));

    }
}
