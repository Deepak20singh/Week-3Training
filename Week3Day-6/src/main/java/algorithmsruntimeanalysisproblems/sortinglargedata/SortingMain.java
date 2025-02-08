package algorithmsruntimeanalysisproblems.sortinglargedata;

import java.util.Arrays;

import static algorithmsruntimeanalysisproblems.sortinglargedata.BubbleSort.bubbleSort;
import static algorithmsruntimeanalysisproblems.sortinglargedata.BubbleSort.bubbleTime;
import static algorithmsruntimeanalysisproblems.sortinglargedata.MergeSort.mergeSort;
import static algorithmsruntimeanalysisproblems.sortinglargedata.MergeSort.mergeTime;
import static algorithmsruntimeanalysisproblems.sortinglargedata.QuickSort.quickSort;
import static algorithmsruntimeanalysisproblems.sortinglargedata.QuickSort.quickTime;

public class SortingMain {
    public static void main(String[] args) {
        int arr1[]={
                89, 23, 45, 12, 67, 34, 99, 5, 78, 43, 56, 90, 32, 11, 77, 24, 68, 39, 18, 50,
                82, 95, 62, 14, 71, 88, 6, 27, 44, 58, 72, 19, 81, 30, 91, 15, 26, 83, 64, 33,
                40, 98, 54, 9, 37, 70, 21, 100, 59, 13, 31, 55, 79, 97, 66, 7, 48, 41, 75, 17,
                28, 96, 85, 1, 49, 10, 74, 92, 3, 60, 35, 84, 4, 42, 80, 16, 25, 2, 57, 29,
                87, 61, 52, 46, 22, 63, 76, 8, 36, 47, 20, 53, 93, 51, 38, 94, 86, 73, 65, 69
        };
        int arr2[]=arr1;

        int arr3[]=arr2;
       bubbleSort(arr1);

        quickSort(arr2,0,arr2.length-1);
        mergeSort(arr3,0,arr3.length-1);
        System.out.println("Bubble Sort result:- "+ Arrays.toString(arr1)+"\nTime taken by bubble sort :- "+bubbleTime);
        System.out.println("Merge Sort result:- "+ Arrays.toString(arr2)+"\nTime taken by merge sort :- "+mergeTime);
        System.out.println("Quick Sort result:- "+ Arrays.toString(arr3)+"\nTime taken by quick sort :- "+quickTime);
    }
}
