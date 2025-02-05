package linearandbinarysearch.linearsearch.firstnegativenumber;

public class LinearSearch {
    public static int search(int[] arr){
        int ans=-1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]<0){
                ans=arr[i];
                return ans;
            }
        }
        return ans;
    }
}
