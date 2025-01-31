package sorting.bubblesort;

public class BubbleSort {
    public int[] sorting(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j< arr.length-1-i;j++){//-i isliye taki hr bar lst element ko check na krna pade
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    return arr;}
}
