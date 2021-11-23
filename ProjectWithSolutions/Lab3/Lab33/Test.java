package ProjectWithSolutions.Lab3.Lab33;
import org.junit.Assert;

public class Test {
    @org.junit.Test
    public void or_test_success() throws Exception {
        Or bitString = new Or();
        bitString.setA(0b110);
        bitString.setB(0b000);
        Assert.assertEquals(0b110, bitString.or().getA());
    }
}
