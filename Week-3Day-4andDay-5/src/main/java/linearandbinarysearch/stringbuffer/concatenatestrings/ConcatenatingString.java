package linearandbinarysearch.stringbuffer.concatenatestrings;
public class ConcatenatingString {
    public static StringBuffer concatenaing(String[] str){
        StringBuffer result= new StringBuffer();
        for (int i=0;i<str.length;i++){
            result.append(str[i]);
        }
        return result;
    }
}
