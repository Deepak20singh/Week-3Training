package algorithmsruntimeanalysisproblems.datastructuresforsearching;

import java.util.TreeSet;

public class TreeSetCode {
    public static TreeSet<Integer> treeCode(int arr[]){
        TreeSet<Integer> tree=new TreeSet<>();
        for(int i=0;i<arr.length;i++){
            tree.add(arr[i]);
        }
        return tree;
    }
}
