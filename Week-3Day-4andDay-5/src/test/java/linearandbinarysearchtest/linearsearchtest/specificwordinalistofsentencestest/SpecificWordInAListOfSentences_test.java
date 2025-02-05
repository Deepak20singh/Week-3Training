package linearandbinarysearchtest.linearsearchtest.specificwordinalistofsentencestest;

import linearandbinarysearch.linearsearch.specificwordinalistofsentences.SpecificWord;
import org.junit.Assert;
import org.junit.Test;


public class SpecificWordInAListOfSentences_test {
    @Test
    public void tester(){
        SpecificWord obj=new SpecificWord();

        String inputsen="My name is anthony gonsalvis";
        String[] arr=inputsen.split("\\s+");

        String input="name";
        boolean result =obj.search (arr,input);


        Assert.assertEquals(true,result);

    }
}

