package linearandbinarysearchtest.stringbuffertest.comparestringbufferwithstringbuildertest;

import linearandbinarysearch.stringbuffer.comparestringbufferwithstringbuilder.ComparingConcatenateMethod;
import org.junit.Assert;
import org.junit.Test;


public class CompareStringBufferWithStringBuilder_test {
    @Test
    public void tester(){
        ComparingConcatenateMethod obj=new ComparingConcatenateMethod();

        String input=new String("DeepakSingh");
        long startTime1 = System.nanoTime();

        StringBuffer result1=obj.concatenaingStringBuffer("DeepakSingh");
        long endTime1 = System.nanoTime();
        long startTime2 = System.nanoTime();

        StringBuilder result2=obj.concatenaingStringBuilder("DeepakSingh");
        long endTime2 = System.nanoTime();
        long bufferTime=endTime1-startTime1;
        long builderTime=endTime2-startTime2;



        Assert.assertEquals(true,bufferTime>builderTime);


    }
}
