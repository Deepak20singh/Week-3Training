package algorithmsruntimeanalysisproblems.stringconcatenation;

import static algorithmsruntimeanalysisproblems.stringconcatenation.StringBufferCode.*;
import static algorithmsruntimeanalysisproblems.stringconcatenation.StringBuilderCode.*;
import static algorithmsruntimeanalysisproblems.stringconcatenation.StringCode.*;

public class StringCodeMain {
    public static void main(String[] args) {
        String stringInput="Deepak";
        System.out.println(stringCode(stringInput)+" Timing is "+stringTime);
        System.out.println(stringBuffer(stringInput)+" Timing is "+builderTime);
        System.out.println(stringBuilder(stringInput)+" Timing is "+builderTime);
    }
}
