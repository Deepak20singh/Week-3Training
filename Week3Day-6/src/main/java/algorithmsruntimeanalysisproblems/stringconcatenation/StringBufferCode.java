package algorithmsruntimeanalysisproblems.stringconcatenation;

public class StringBufferCode {
    public static long bufferTime;
    public static StringBuffer stringBuffer(String str){
        long startTime=System.nanoTime();
        StringBuffer s=new StringBuffer();
        for (int i=0;i<str.length();i++){
            s.append(str.charAt(i));
        }
        long endTime=System.nanoTime();
        bufferTime=endTime-startTime;
        return s;
    }
}
