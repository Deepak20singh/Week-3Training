package stackqueuehashsethashmap.stacksandqueues.queueusingstacks;

import java.util.Scanner;

public class QueueStackMain {
    public static void main(String[] args) {
        StackImplement s=new StackImplement();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string :- ");
        String input=sc.nextLine();
        System.out.println();

        for(int i=0;i<input.length();i++){
            s.enque(input.charAt(i));
        }
        for(int i=0;i<input.length();i++){
            System.out.println(s.deque());
        }

    }
}
