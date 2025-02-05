package linearandbinarysearch.binarysearch.targetvalue;

public class ElementIn2DArray {
    public static int[] search(int[][] arr, int target) {
        int[] res = new int[]{-1,-1};  // Default if not found
        int rows = arr.length;
        int cols = arr[0].length;

        int start = 0;
        int end = (rows * cols) - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int i = mid / cols;        // Row index
            int j = mid % cols;        // Column index

            if (arr[i][j] == target) {
                return new int[]{i,j};
                           // Exit the loop once found
            } else if (arr[i][j] < target) {
                start = mid + 1;       // Search in the right half
            } else {
                end = mid - 1;         // Search in the left half
            }
        }
        return res;
    }

}
