package algorithmsruntimeanalysisproblems.sortinglargedata;


public class MergeSort {
    public static long mergeTime;
    public static void merge(int[] arr, int start, int mid, int end) {
        int size1 = mid - start + 1;
        int size2 = end - mid;

        int[] left = new int[size1];
        int[] right = new int[size2];

        // Copying elements into left and right subarrays
        for (int i = 0; i < size1; i++)
            left[i] = arr[start + i];

        for (int j = 0; j < size2; j++)
            right[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = start;

        // Merging left and right arrays in sorted order
        while (i < size1 && j < size2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copying remaining elements from left array (if any)
        while (i < size1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copying remaining elements from right array (if any)
        while (j < size2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr, int start, int end) {
        long startTime=System.nanoTime();
        if (start < end) {
            int mid = start + (end - start) / 2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);

            merge(arr, start, mid, end);
        }
        long endTime=System.nanoTime();
        mergeTime=endTime-startTime;
    }


}
