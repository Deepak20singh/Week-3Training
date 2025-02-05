package linearandbinarysearchtest.binarysearchtest.peakelementtest;

import linearandbinarysearch.binarysearch.peakelement.PeakElement;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


public class PeakElement_test {
    @Test
    public void tester(){
        PeakElement obj=new PeakElement();
        int[] arr={1,2,3,45,6,8,5,9,0};
        ArrayList result=obj.search(arr);
        ArrayList expected=new ArrayList();
        expected.addFirst(45);
        expected.add(8);
        expected.add(9);

        Assert.assertEquals(expected,result);

    }
}
