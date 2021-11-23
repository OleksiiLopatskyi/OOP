package ProjectWithSolutions.Lab4.Lab44;

import org.junit.Assert;
public class Test {
    @org.junit.Test
    public void value_test_success() throws Exception {
        double a = 2;
        double b = 2;
        double calculatedValue = a / b;
        Rational v = new Rational(2,2);
        double value = v.value();
        Assert.assertEquals(calculatedValue, value, 0.01);
    }
}

