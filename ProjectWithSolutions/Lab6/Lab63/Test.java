package ProjectWithSolutions.Lab6.Lab63;
import org.junit.Assert;
public class Test {
    @org.junit.Test
    public void or_test_success() throws Exception {
        LinkedList bitString1 = new LinkedList();
        LinkedList bitString2 = new LinkedList();
        char [] test = {
                '1'}
                ;
        bitString1.add('0');
        bitString2.add('1');
        Assert.assertEquals (1, LinkedList.or(bitString1, bitString2).size());
        Assert.assertEquals ('1', LinkedList.or(bitString1, bitString2).getByIndex(0));
    }
}
