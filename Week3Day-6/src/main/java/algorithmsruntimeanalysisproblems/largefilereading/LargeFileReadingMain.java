package algorithmsruntimeanalysisproblems.largefilereading;

import static algorithmsruntimeanalysisproblems.largefilereading.FileReaderCode.readFile;
import static algorithmsruntimeanalysisproblems.largefilereading.InputStreamCode.readFileInput;

public class LargeFileReadingMain {
    public static void main(String[] args) {
        String filePathName="src/main/java/algorithmsruntimeanalysisproblems/largefilereading/Sample.txt";
        long startTime1=System.nanoTime();
        readFile(filePathName);
        long endTime1=System.nanoTime();
        long startTime2=System.nanoTime();
        readFileInput(filePathName);
        long endTime2=System.nanoTime();
        System.out.println("File Reading By File Reader :- "+(endTime1-startTime1));
        System.out.println("File Reading By InputStream Reader :- "+(endTime2-startTime2));

    }
}
