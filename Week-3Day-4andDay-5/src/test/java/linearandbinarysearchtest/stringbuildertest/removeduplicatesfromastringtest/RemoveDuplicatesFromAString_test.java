package linearandbinarysearchtest.stringbuildertest.removeduplicatesfromastringtest;

import linearandbinarysearch.stringbuilder.removeduplicatesfromastring.RemoveDuplicate;
import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromAString_test {
    @Test
    public void tester(){
        RemoveDuplicate obj=new RemoveDuplicate();

        StringBuilder input=new StringBuilder("Deepak");
        StringBuilder result=obj.removeDuplicate(input);

        Assert.assertEquals("Depak",result.toString());

    }
}
