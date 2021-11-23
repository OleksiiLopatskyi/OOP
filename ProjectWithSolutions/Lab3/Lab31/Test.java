package ProjectWithSolutions.Lab3.Lab31;
import org.junit.Assert;
public class Test {
    @org.junit.Test
    public void minutes_test_success() throws Exception {
        int first = 2;
        int second = 2;
        int calculatedArea = (first * second) / 2;
        RightAngled rightAngled = new RightAngled();
        rightAngled.init(2, 2);
        int area = rightAngled.area();
        Assert.assertEquals(calculatedArea, area);
    }
}