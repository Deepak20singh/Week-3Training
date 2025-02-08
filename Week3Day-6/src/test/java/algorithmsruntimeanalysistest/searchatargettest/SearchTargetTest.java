package algorithmsruntimeanalysistest.searchatargettest;

import org.junit.Assert;
import org.junit.Test;
import static algorithmsruntimeanalysisproblems.searchatarget.SearchTargetBinarySearch.binary;
import static algorithmsruntimeanalysisproblems.searchatarget.SearchTargetLinearSearch.linear;

public class SearchTargetTest {
    @Test
    public void tester() {
        int arr[] = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        int target = 9999;

        long linearTime = linear(arr, target);
        long binaryTime = binary(arr, target);

        System.out.println("Linear Search Time: " + linearTime + " ns");
        System.out.println("Binary Search Time: " + binaryTime + " ns");

        Assert.assertTrue("Binary search should be faster than linear search", binaryTime < linearTime);
    }
}
