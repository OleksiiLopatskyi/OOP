package ProjectWithSolutions.Lab6.Lab64;
import org.junit.Assert;
public class Test {
    @org.junit.Test
    public void or_test_success() throws Exception {
        Integer [] t = {
                4, 5, 8, 3}
                ;
        double result = 0;
        for (double n: t){
            result += n;
        }
        result = result / t.length;
        Assert.assertEquals (5, result, 0.1);
    }
}
