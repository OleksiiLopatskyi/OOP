package ProjectWithSolutions.Lab4.Lab43;

import ProjectWithSolutions.Lab4.Lab43.Money;
import org.junit.Assert;

public class Test {
    @org.junit.Test
    public void sum_test_success() throws Exception {
        double a = Double.parseDouble(String.valueOf(20));
        double b = Double.parseDouble(String.valueOf(30));
        double s = a + b;
        Money result = new Money();
        result.setMoney(s);
        Money money = new Money(5);
        Money money1 = new Money(5);
        money.setMoney(20);
        money1.setMoney(30);
        Money add = money.add(money1);
        Assert.assertEquals(result, add);
    }
}
