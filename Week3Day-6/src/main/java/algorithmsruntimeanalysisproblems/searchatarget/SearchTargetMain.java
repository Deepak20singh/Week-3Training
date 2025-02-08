package algorithmsruntimeanalysisproblems.searchatarget;

import static algorithmsruntimeanalysisproblems.searchatarget.SearchTargetBinarySearch.binary;
import static algorithmsruntimeanalysisproblems.searchatarget.SearchTargetLinearSearch.linear;

public class SearchTargetMain {
    public static void main(String[] args) {
        int arr[]=new int[1000];
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }
        int target=979;
        linear(arr,target);
        binary(arr,target);
    }
}
