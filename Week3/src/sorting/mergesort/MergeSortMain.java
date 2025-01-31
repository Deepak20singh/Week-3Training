package sorting.mergesort;

import java.util.Arrays;

public class MergeSortMain {
    public static void main(String[] args) {
        MergeSort merge=new MergeSort();
        int[] book ={23,45,56,6,78,9};
        int[] result=merge.mergesort(book);
        System.out.println(Arrays.toString(result));

    }
}
