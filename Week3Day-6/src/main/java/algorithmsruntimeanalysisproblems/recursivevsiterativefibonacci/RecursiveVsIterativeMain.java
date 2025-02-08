package algorithmsruntimeanalysisproblems.recursivevsiterativefibonacci;

import static algorithmsruntimeanalysisproblems.recursivevsiterativefibonacci.IterativeCode.fiboIterative;
import static algorithmsruntimeanalysisproblems.recursivevsiterativefibonacci.RecursiveCode.recursiveFibo;

public class RecursiveVsIterativeMain {
    public static void main(String[] args) {
        int n=40;
        long startTime1=System.nanoTime();

        System.out.println(fiboIterative(n));
        long endTime1=System.nanoTime();
        long startTime2=System.nanoTime();
        System.out.println(recursiveFibo(n));
        long endTime2=System.nanoTime();
        System.out.println("Iterative :- "+(endTime1-startTime1));
        System.out.println("Recursive :- "+(endTime2-startTime2));
    }
}
