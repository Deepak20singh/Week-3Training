package linearandbinarysearchtest.challengeproblemstest.searchingproblemstest;

import linearandbinarysearch.binarysearch.firstandlastoccurrence.FirstAndLastOccurrance;
import org.junit.Assert;
import org.junit.Test;

import static linearandbinarysearch.challengeproblems.searchingproblem.BinarySearch.binarySearch;
import static linearandbinarysearch.challengeproblems.searchingproblem.LinearSearch.linearSearch;

public class SearchingProblem_test {
    @Test
    public void tester(){
        FirstAndLastOccurrance firstlast=new FirstAndLastOccurrance();
        int arr[]={1,2,3,4,6,7,8,9};
        int ansOfLinear=linearSearch(arr);
        int ansOfBinary=binarySearch(arr,6);
        Assert.assertEquals(5,ansOfLinear);
        Assert.assertEquals(4,ansOfBinary);


    }
}
