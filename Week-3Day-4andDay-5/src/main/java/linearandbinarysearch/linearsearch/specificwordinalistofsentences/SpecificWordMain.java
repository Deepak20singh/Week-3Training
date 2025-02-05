package linearandbinarysearch.linearsearch.specificwordinalistofsentences;

import java.util.Scanner;


import static linearandbinarysearch.linearsearch.specificwordinalistofsentences.SpecificWord.search;

public class SpecificWordMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence :- ");

        String inputsen=new String(sc.nextLine());
        String[] arr=inputsen.split("\\s+");
        System.out.println("Enter the word :- ");
        String input=new String(sc.nextLine());
        boolean result =search (arr,input);
        System.out.println("Thats "+result+" word is present in sentence");
    }
}
