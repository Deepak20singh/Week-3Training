package linearandbinarysearch.stringbuilder.removeduplicatesfromastring;

import java.util.Scanner;

import static linearandbinarysearch.stringbuilder.removeduplicatesfromastring.RemoveDuplicate.removeDuplicate;

public class RemoveDuplicatesMain {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String :- ");
        StringBuilder input=new StringBuilder(s.nextLine());
        System.out.println();
        StringBuilder result=removeDuplicate(input);
        System.out.println("The result :- "+ result);
    }
}
