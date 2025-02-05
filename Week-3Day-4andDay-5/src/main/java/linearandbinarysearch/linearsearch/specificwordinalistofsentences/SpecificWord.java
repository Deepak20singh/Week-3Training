package linearandbinarysearch.linearsearch.specificwordinalistofsentences;

public class SpecificWord {
    public static boolean search(String[] arr,String word){
        boolean result=false;
        for (String element : arr) {
            if (element.equalsIgnoreCase(word)) {  // Case-insensitive search
                result=true;
            }
        }
        return result;
    }
}
