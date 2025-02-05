package linearandbinarysearch.challengeproblems.comparestringsandfilereader;

import java.io.FileNotFoundException;

import static linearandbinarysearch.challengeproblems.comparestringsandfilereader.Compare.comparing;
import static linearandbinarysearch.challengeproblems.comparestringsandfilereader.FileReadAndCount.*;

public class CompareMain {
    public static void main(String[] args) throws FileNotFoundException {
        String[] str={"Deepak","Singh"};
        comparing(str);
        String filepath = "src/main/java/linearandbinarysearch/challengeproblems/comparestringsandfilereader/Sample.txt";
        fileWordCountByFileReader(filepath);

        fileWordCountByInputStream(filepath);
        display();


    }
}
