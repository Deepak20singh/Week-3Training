package algorithmsruntimeanalysisproblems.datastructuresforsearching;

public class ArrayCode {
    public static boolean search(int[] arr,int target){
        boolean ans=false;
        for(int i=0;i<arr.length;i++){
           if(arr[i]==target){
               ans=true;
               break;
           }
        }

        return ans;
    }
}
