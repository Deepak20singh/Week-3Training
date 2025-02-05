package linearandbinarysearchtest.stringbuildertest.reverseastringtest;

import linearandbinarysearch.stringbuilder.reverseastring.ReverseString;
import org.junit.Assert;
import org.junit.Test;

public class ReverseAString_test {
    @Test
    public void tester(){
        ReverseString obj=new ReverseString();

        StringBuilder sc;
        sc= new StringBuilder("deepak");
        StringBuilder res=sc.reverse();
        StringBuilder result=obj.reverseString(sc);

        Assert.assertEquals(res,result);

    }
}
