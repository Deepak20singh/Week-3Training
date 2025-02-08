package algorithmsruntimeanalysisproblems.sortinglargedata;

public class QuickSort {
    public static long quickTime;
    public static void quickSort(int[] arr, int start, int end){
        long startTime=System.nanoTime();
        if (start >= end) return ; // Base condition to stop recursion

        int low=start;
        int high=end;
        int mid=start+(end-start)/2;
        int pivot=arr[mid];
        while (low <= high) {
            while (arr[low] < pivot) {
                low++;
            }
            while (arr[high] > pivot) {
                high--;
            }

            if(low<=high){
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
        }
        quickSort(arr,start,high);
        quickSort(arr,low,end);

        long endTime=System.nanoTime();

  quickTime=endTime-startTime;
    }
}
