package linearandbinarysearch.stringbuffer.concatenatestrings;
import static linearandbinarysearch.stringbuffer.concatenatestrings.ConcatenatingString.*;
import java.util.Scanner;

public class ConcatenatingMain {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        String input[]=new String[]{"hello","world"};
        StringBuffer result=concatenaing(input);
        System.out.println("The result :- "+result);
    }
}
