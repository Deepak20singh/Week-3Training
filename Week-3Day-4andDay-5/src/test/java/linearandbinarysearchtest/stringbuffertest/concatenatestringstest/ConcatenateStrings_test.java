package linearandbinarysearchtest.stringbuffertest.concatenatestringstest;

import linearandbinarysearch.stringbuffer.concatenatestrings.ConcatenatingString;
import org.junit.Assert;
import org.junit.Test;

public class ConcatenateStrings_test {
    @Test
    public void tester(){
        ConcatenatingString obj=new ConcatenatingString();


        String[] input=new String[]{"Deepak","Singh"};
        StringBuffer result=obj.concatenaing(input);


        Assert.assertEquals("DeepakSingh",result.toString());


    }
}
