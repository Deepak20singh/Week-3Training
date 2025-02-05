package linearandbinarysearchtest.binarysearchtest.targetvaluetest;

import linearandbinarysearch.binarysearch.targetvalue.ElementIn2DArray;
import org.junit.Assert;
import org.junit.Test;


public class TargetValue_test {
    @Test
    public void tester(){
        ElementIn2DArray obj=new ElementIn2DArray();

        int[][] arr = {
                {10, 20, 30, 40},
                {50, 55, 65, 67},
                {70, 72, 73, 89},
                {90, 93, 97, 99}
        };

        int target = 72;
        int[] result = obj.search(arr, target);

        Assert.assertEquals(2,result[0]);
        Assert.assertEquals(1,result[1]);

    }
}
