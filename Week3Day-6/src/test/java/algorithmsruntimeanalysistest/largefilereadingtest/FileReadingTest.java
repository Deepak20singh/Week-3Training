package algorithmsruntimeanalysistest.largefilereadingtest;

import org.junit.Assert;
import org.junit.Test;

import static algorithmsruntimeanalysisproblems.largefilereading.FileReaderCode.readFile;
import static algorithmsruntimeanalysisproblems.largefilereading.InputStreamCode.readFileInput;

public class FileReadingTest {
    @Test
    public void Tester(){
        String filePathName="src/main/java/algorithmsruntimeanalysisproblems/largefilereading/Sample.txt";
        long startTime1=System.nanoTime();
        readFile(filePathName);
        long endTime1=System.nanoTime();
        long startTime2=System.nanoTime();
        readFileInput(filePathName);
        long endTime2=System.nanoTime();
        Assert.assertTrue("InputStream reader takes less time as compare to File Reader ",(endTime2-startTime2)<(endTime1-startTime1));
    }
}
