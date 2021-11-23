package ProjectWithSolutions.Lab2.Lab28;

import org.junit.Assert;
public class Test {
    @org.junit.Test
    public void perimeter_test_success() throws Exception {
        int a = 3;
        int b = 4;
        int c = 5;
        int expected = 12;
        int perimeter = a + b + c;
        Assert.assertEquals(expected, perimeter);
    }
}

