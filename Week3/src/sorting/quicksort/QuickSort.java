package sorting.quicksort;

public class QuickSort {
    int[] prices;

    public QuickSort(int[] prices) {
        this.prices = prices;
    }

    private int partition(int left, int right) {
        int pivot = prices[right];  // Choosing last element as pivot
        int i = left - 1; // Pointer for smaller elements

        for (int j = left; j < right; j++) {
            if (prices[j] <= pivot) {
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, right);
        return i + 1;
    }

    private void quickSort(int left, int right) {
        if (left < right) {
            int pivotIndex = partition(left, right);
            quickSort(left, pivotIndex - 1);  // Sorting left part
            quickSort(pivotIndex + 1, right); // Sorting right part
        }
    }

    public void sort() {
        quickSort(0, prices.length - 1);
    }

    private void swap(int i, int j) {
        int temp = prices[i];
        prices[i] = prices[j];
        prices[j] = temp;
    }

    public void show() {
        for (int price : prices) {
            System.out.println(price);
        }
    }



}
