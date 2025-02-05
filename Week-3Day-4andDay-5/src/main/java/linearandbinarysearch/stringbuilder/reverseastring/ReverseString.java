package linearandbinarysearch.stringbuilder.reverseastring;

public class ReverseString {
    public static StringBuilder reverseString(StringBuilder str){
         int s= str.length();
         for(int i=0;i<s/2;i++){
             char c= str.charAt(i);
             str.setCharAt(i, str.charAt(s - i-1));
             str.setCharAt(s - i-1, c);
         }
        return str;
    }
    public static StringBuilder reverseByMethod(StringBuilder str){
        return str.reverse();
    }
}
