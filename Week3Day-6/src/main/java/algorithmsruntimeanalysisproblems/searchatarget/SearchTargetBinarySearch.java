package algorithmsruntimeanalysisproblems.searchatarget;

public class SearchTargetBinarySearch {
    public static long binary(int[] arr, int target) {
        int ans = -1;
        long start1 = System.nanoTime();

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        long end1 = System.nanoTime();
        System.out.println("Binary Search Index: " + ans);
        System.out.println("Binary Search Time Taken: " + (end1 - start1) + " ns");
        return (end1 - start1);
    }
}
