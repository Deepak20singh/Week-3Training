package linearandbinarysearch.stringbuilder.reverseastring;
import java.util.Scanner;

import static linearandbinarysearch.stringbuilder.reverseastring.ReverseString.*;

public class ReverseStringMain {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the String :- ");

        StringBuilder sc = new StringBuilder(s.nextLine());
        System.out.println();
        StringBuilder result=reverseString(sc);
        System.out.println("The reverse order :- "+result);

    }
}
