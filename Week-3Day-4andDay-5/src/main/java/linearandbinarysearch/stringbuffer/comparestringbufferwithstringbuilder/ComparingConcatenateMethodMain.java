package linearandbinarysearch.stringbuffer.comparestringbufferwithstringbuilder;
import static linearandbinarysearch.stringbuffer.comparestringbufferwithstringbuilder.ComparingConcatenateMethod.*;
import java.util.Scanner;

public class ComparingConcatenateMethodMain {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the String :- ");

        String input=new String(s.nextLine());
        long startTime1 = System.nanoTime();
        StringBuffer result1=concatenaingStringBuffer(input);
        long endTime1 = System.nanoTime();

        long startTime2 = System.nanoTime();
        StringBuilder result2=concatenaingStringBuilder(input);
        long endTime2 = System.nanoTime();

        System.out.println("The result using StringBuffer :- "+result1+"\nThe time taken by function :- "+(endTime1-startTime1));
        System.out.println("The result using StringBuilder :- "+result2+"\nThe time taken by function :-  "+(endTime2-startTime2));
    }
}
