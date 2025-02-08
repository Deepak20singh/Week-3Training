package algorithmsruntimeanalysisproblems.stringconcatenation;

public class StringBuilderCode {
    public static long builderTime;
    public static StringBuilder stringBuilder(String str){
        long startTime=System.nanoTime();
        StringBuilder s=new StringBuilder();
        for (int i=0;i<str.length();i++){
            s.append(str.charAt(i));
        }
        long endTime=System.nanoTime();
        builderTime=endTime-startTime;
        return s;
    }
}
