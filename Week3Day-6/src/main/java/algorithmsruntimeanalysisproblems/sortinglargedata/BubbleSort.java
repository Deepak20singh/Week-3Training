package algorithmsruntimeanalysisproblems.sortinglargedata;

public class BubbleSort {
    public static long bubbleTime;
    public static void bubbleSort(int[] arr){
        long startTime=System.nanoTime();
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {  // Outer loop for passes
           for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                  }
            }
              }
        long endTime=System.nanoTime();
        bubbleTime=endTime-startTime;
    }}

