package linearandbinarysearchtest.linearsearchtest.firstnegativenumbertest;

import linearandbinarysearch.linearsearch.firstnegativenumber.LinearSearch;
import org.junit.Assert;
import org.junit.Test;

public class FirstNegativeNumber_test {
    @Test
    public void tester(){
        LinearSearch obj=new LinearSearch();

        int arr[]={2,3,4,5,4,2,-1,-9};
        int result=obj.search(arr);
        Assert.assertEquals(-1,result);

    }
}

