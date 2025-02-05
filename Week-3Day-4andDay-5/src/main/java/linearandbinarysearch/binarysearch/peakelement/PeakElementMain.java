package linearandbinarysearch.binarysearch.peakelement;

import java.util.ArrayList;

import static linearandbinarysearch.binarysearch.peakelement.PeakElement.search;

public class PeakElementMain {
    public static void main(String[] args) {
        int[] arr={1,2,3,45,6,8,5,9,0};
        ArrayList result=search(arr);
        System.out.println(result.toString());
    }
}
