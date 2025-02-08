package algorithmsruntimeanalysisproblems.largefilereading;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderCode {
    public static void readFile(String filePath){
        try(FileReader fr=new FileReader(filePath)) {
            int data = 0;
            while((data= fr.read())!=-1){

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
