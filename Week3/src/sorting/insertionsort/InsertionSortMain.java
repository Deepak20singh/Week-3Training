package sorting.insertionsort;


import java.util.Arrays;

public class InsertionSortMain {
    public static void main(String[] args) {
        InsertionSort b=new InsertionSort();
        int[] arr={3,4,2,1,6,8};
        int[] res=b.insertion(arr);
        System.out.println(Arrays.toString(res));
    }
}
