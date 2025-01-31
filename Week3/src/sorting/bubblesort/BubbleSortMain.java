package sorting.bubblesort;

import java.util.Arrays;

public class BubbleSortMain {
    public static void main(String[] args) {
        BubbleSort b=new BubbleSort();
        int[] arr={3,4,2,1,6,8};
        int[] res=b.sorting(arr);
        System.out.println(Arrays.toString(res));
    }
}
