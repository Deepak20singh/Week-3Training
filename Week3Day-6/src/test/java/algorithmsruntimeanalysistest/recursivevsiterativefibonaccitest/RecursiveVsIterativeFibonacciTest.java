package algorithmsruntimeanalysistest.recursivevsiterativefibonaccitest;

import org.junit.Assert;
import org.junit.Test;

import static algorithmsruntimeanalysisproblems.recursivevsiterativefibonacci.IterativeCode.fiboIterative;
import static algorithmsruntimeanalysisproblems.recursivevsiterativefibonacci.RecursiveCode.recursiveFibo;

public class RecursiveVsIterativeFibonacciTest {

    @Test
    public void Tester() {
        int n = 40;

        long startTimeIterative = System.nanoTime();
        int iterativeAnswer = fiboIterative(n);
        long endTimeIterative = System.nanoTime();
        long iterativeTime = endTimeIterative - startTimeIterative;

        long startTimeRecursive = System.nanoTime();
        int recursiveAnswer = recursiveFibo(n);
        long endTimeRecursive = System.nanoTime();
        long recursiveTime = endTimeRecursive - startTimeRecursive;

        Assert.assertEquals("Fibonacci values should match", iterativeAnswer, recursiveAnswer);

        Assert.assertTrue("Iterative Function should be faster than Recursive", iterativeTime < recursiveTime);
    }
}
