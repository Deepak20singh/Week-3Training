package linearandbinarysearch.inputstreamreader.convertbytestream;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ConvertByteStream {
    public static void main(String[] args) {
        String filePath="src/main/java/linearandbinarysearch/inputstreamreader/convertbytestream/Sample.txt";
        try(InputStreamReader io=new InputStreamReader(new FileInputStream(filePath),"UTF-8")) {

            int data;
            while((data=io.read())!=-1){
                char c= (char) data;

                System.out.print(c);
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
