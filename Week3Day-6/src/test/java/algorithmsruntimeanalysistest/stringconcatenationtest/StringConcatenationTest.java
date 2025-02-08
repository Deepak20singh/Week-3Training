package algorithmsruntimeanalysistest.stringconcatenationtest;

import org.junit.Assert;
import org.junit.Test;

import static algorithmsruntimeanalysisproblems.stringconcatenation.StringBufferCode.stringBuffer;
import static algorithmsruntimeanalysisproblems.stringconcatenation.StringBuilderCode.builderTime;
import static algorithmsruntimeanalysisproblems.stringconcatenation.StringBuilderCode.stringBuilder;
import static algorithmsruntimeanalysisproblems.stringconcatenation.StringCode.stringCode;
import static algorithmsruntimeanalysisproblems.stringconcatenation.StringCode.stringTime;

public class StringConcatenationTest {
    @Test
    public void Tester(){
        String stringInput="Deepak";
        stringBuffer(stringInput);
        long stringBuilderTime=builderTime;
        stringCode(stringInput);
        long stringTiming=stringTime;
        stringBuilder(stringInput);
        long stringBufferTime= builderTime;
        Assert.assertTrue("StringBuffer should be faster than StringBuilder", stringBufferTime>stringBuilderTime);



    }
}
