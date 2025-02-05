package linearandbinarysearch.linearsearch.firstnegativenumber;

import static linearandbinarysearch.linearsearch.firstnegativenumber.LinearSearch.search;

public class LinearSearchMain {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,4,2,-1,-9};
        System.out.println("The result :- "+search(arr));
    }
}
