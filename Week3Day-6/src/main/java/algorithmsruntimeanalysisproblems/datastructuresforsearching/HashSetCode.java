package algorithmsruntimeanalysisproblems.datastructuresforsearching;

import java.util.HashSet;

public class HashSetCode {
    public static HashSet<Integer> hashCode(int[] arr){
        HashSet<Integer> hash=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hash.add(arr[i]);
        }
        return hash;
    }
}
