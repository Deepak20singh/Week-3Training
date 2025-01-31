package sorting.quicksort;

public class QuickSortMain {
    public static void main(String[] args) {
        int[] productPrices = {234,56,74,78,64532};
        QuickSort product = new QuickSort(productPrices);

        System.out.println("Before Sorting:");
        product.show();

        product.sort();

        System.out.println("After Sorting:");
        product.show();
    }
}
