package linearandbinarysearch.challengeproblems.searchingproblem;

import static linearandbinarysearch.challengeproblems.searchingproblem.BinarySearch.binarySearch;
import static linearandbinarysearch.challengeproblems.searchingproblem.LinearSearch.linearSearch;;

public class SearchMain {
    public static void main(String[] args) {
      int arr[]={1,2,3,4,6,7,8,9};
      linearSearch(arr);
      binarySearch(arr,4);
    }
}
