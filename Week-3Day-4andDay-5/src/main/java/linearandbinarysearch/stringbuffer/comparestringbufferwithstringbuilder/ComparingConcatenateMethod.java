package linearandbinarysearch.stringbuffer.comparestringbufferwithstringbuilder;

public class ComparingConcatenateMethod {
    public static StringBuffer concatenaingStringBuffer(String str){
        StringBuffer result= new StringBuffer();
        for (int i=0;i<str.length();i++){
            result.append(str.charAt(i));
        }
        return result;
    }
    public static StringBuilder concatenaingStringBuilder(String str){
        StringBuilder result= new StringBuilder();
        for (int i=0;i<str.length();i++){
            result.append(str.charAt(i));
        }
        return result;
    }
}
