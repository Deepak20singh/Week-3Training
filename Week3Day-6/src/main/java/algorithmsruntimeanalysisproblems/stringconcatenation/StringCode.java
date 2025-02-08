package algorithmsruntimeanalysisproblems.stringconcatenation;

public class StringCode {
    public static long stringTime;
    public static String stringCode(String str){
        long startTime=System.nanoTime();
        String s=new String();
        for (int i=0;i<str.length();i++){
            s=s+str.charAt(i);
        }
        long endTime=System.nanoTime();
        stringTime=endTime-startTime;
        return s;
    }
}
