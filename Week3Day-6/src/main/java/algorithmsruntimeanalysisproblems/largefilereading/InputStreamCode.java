package algorithmsruntimeanalysisproblems.largefilereading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamCode {
    public static void readFileInput(String filePath){
        try(FileInputStream fp=new FileInputStream(filePath);
            InputStreamReader reading=new InputStreamReader(fp);
        )
        {
            int data;
            while ((data= reading.read())!=-1){

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
