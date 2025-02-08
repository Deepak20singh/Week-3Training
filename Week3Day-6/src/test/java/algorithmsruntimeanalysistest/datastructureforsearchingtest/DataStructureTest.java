package algorithmsruntimeanalysistest.datastructureforsearchingtest;

import algorithmsruntimeanalysisproblems.datastructuresforsearching.HashSetCode;
import algorithmsruntimeanalysisproblems.datastructuresforsearching.TreeSetCode;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.TreeSet;

import static algorithmsruntimeanalysisproblems.datastructuresforsearching.ArrayCode.search;

public class DataStructureTest {
    @Test
    public void Tester(){
        int[] arr={89, 23, 45, 12, 67, 34, 99, 5, 78, 43, 56, 90, 32, 11, 77, 24, 68, 39, 18, 50,
                82, 95, 62, 14, 71, 88, 6, 27, 44, 58, 72, 19, 81, 30, 91, 15, 26, 83, 64, 33,
                40, 98, 54, 9, 37, 70, 21, 100, 59, 13, 31, 55, 79, 97, 66, 7, 48, 41, 75, 17,
                28, 96, 85, 1, 49, 10, 74, 92, 3, 60, 35, 84, 4, 42, 80, 16, 25, 2, 57, 29,
                87, 61, 52, 46, 22, 63, 76, 8, 36, 47, 20, 53, 93, 51, 38, 94, 86, 73, 65, 69
        };
        int target=76;
        long startTime1=System.nanoTime();
        search(arr,target);
        long endTime1=System.nanoTime();

        TreeSet<Integer> treeAns= TreeSetCode.treeCode(arr);
        HashSet<Integer> hashAns= HashSetCode.hashCode(arr);

        long startTime2=System.nanoTime();
        hashAns.contains(target);
        long endTime2=System.nanoTime();


        long startTime3=System.nanoTime();

        treeAns.contains(target);
        long endTime3=System.nanoTime();

        Assert.assertTrue("HashSet is faster then TreeSet",(endTime3-startTime3)>(endTime2-startTime2));
        Assert.assertTrue("HashSet is faster then Array",(endTime1-startTime1)>(endTime2-startTime2));
    }
}
