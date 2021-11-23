package ProjectWithSolutions.Lab1.Lab18;
import org.junit.Assert;
import org.junit.Test;
public class PerimeterTest {
    @org.junit.Test
    public void perimeter_test_success() throws Exception {
        int a = 3;
        int b = 4;
        int c = 5;
        int expeted = 12;
        int perimeter = a + b + c;
        Assert.assertEquals(expeted, perimeter);
    }
}