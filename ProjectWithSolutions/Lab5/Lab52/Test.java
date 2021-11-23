package ProjectWithSolutions.Lab5.Lab52;

import org.junit.Assert;
public class Test {
    @org.junit.Test public void add_test_success() throws Exception {
        double a = 2;
        double b = 2;
        double a2 = 2;
        double b2 = 2;
        double calculatedAdd1 = a + a2;
        double calculatedAdd2 = b + b2;
        Complex v1 = new Complex(2,2);
        Complex v2 = new Complex(2,2);
        Complex add = v1.add(v2);
        Assert.assertEquals(calculatedAdd1, add.getA(), 0.01);
        Assert.assertEquals(calculatedAdd2, add.getB(), 0.01);
    }
}

