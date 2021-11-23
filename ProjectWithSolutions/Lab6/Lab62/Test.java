package ProjectWithSolutions.Lab6.Lab62;
import org.junit.Assert;
public class Test {
    @org.junit.Test
    public void and_test_success() throws Exception {
        Binary bitString1 = new Binary(1);
        Binary bitString2 = new Binary(1);
        char [] test = {
                '0'}
                ;
        char [] test1 = {
                '1'}
                ;
        bitString1.setA(test);
        bitString2.setA(test1);
        Assert.assertArrayEquals(test1, Binary.or(bitString1, bitString2).getA());
    }
}
