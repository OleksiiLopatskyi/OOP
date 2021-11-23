package ProjectWithSolutions.Lab5.Lab51;
import org.junit.Assert;
public class Test {
    @org.junit.Test
    public void minutes_test_success() throws Exception {
        int hours = 1;
        int mins = 45;
        int calculatedMins = hours * 60 + mins;
        Time time = new Time();
        time.init(1, 45);
        int minutes = time.minutes();
        Assert.assertEquals(calculatedMins, minutes);
    }
}