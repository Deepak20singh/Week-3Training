package linearandbinarysearchtest.challengeproblemstest.compareproblemstest;

import linearandbinarysearch.challengeproblems.comparestringsandfilereader.Compare;
import linearandbinarysearch.challengeproblems.comparestringsandfilereader.FileReadAndCount;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;

import static linearandbinarysearch.challengeproblems.comparestringsandfilereader.FileReadAndCount.*;

public class CompareProblems_test {
    @Test
    public void tester() throws FileNotFoundException {
        Compare compare=new Compare();
        FileReadAndCount file=new FileReadAndCount();
        String[] str={"Deepak","Singh"};
        String resultComp=compare.comparing(str);
        String filepath = "src/main/java/linearandbinarysearch/challengeproblems/comparestringsandfilereader/Sample.txt";
        fileWordCountByFileReader(filepath);

        fileWordCountByInputStream(filepath);
        String res=file.display();
        Assert.assertEquals("StringBuilder is faster then StringBuffer",resultComp);
        Assert.assertEquals("InputStreamReader is faster then File reader",res);


    }

}
