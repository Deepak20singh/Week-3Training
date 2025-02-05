package linearandbinarysearch.binarysearch.rotationpoint;

import static linearandbinarysearch.binarysearch.rotationpoint.RotationPoint.search;

public class RotationPointMain {
    public static void main(String[] args) {
        int[] arr={8,9,0,2,3,4,5,6,7};
        int ans=search(arr);
        System.out.println("The rotation point is "+ans);


    }
}
