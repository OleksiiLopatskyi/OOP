package ProjectWithSolutions.Lab6.Lab61;
import org.junit.Assert;
public class Test {
    @org.junit.Test
    public void add_test_success() throws Exception {
        int expected = -3 * 20;
        int[] a = {
                -3, 20}
                ;
        int firstNegative = 1;
        int result = 0;
        for (int i : a) {
            if (i < 0) {
                firstNegative = i;
                break;
            }
        }
        for (int i = 0;
             i < a.length;
             i++) {
            if (a[i] % 2 == 0) {
                a[i] = firstNegative * a[i];
                result = a[i];
            }
        }
        Assert.assertEquals(expected, result);
    }
}

