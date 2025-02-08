package algorithmsruntimeanalysisproblems.searchatarget;

public class SearchTargetLinearSearch {
    public static long linear(int[] arr, int target) {
        int ans = -1;
        long start1 = System.nanoTime();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans = i;
                break;
            }
        }

        long end1 = System.nanoTime();
        System.out.println("Linear Search Index: " + ans);
        System.out.println("Linear Search Time Taken: " + (end1 - start1) + " ns");
        return (end1 - start1);
    }
}
