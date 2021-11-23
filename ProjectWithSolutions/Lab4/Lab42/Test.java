package ProjectWithSolutions.Lab4.Lab42;
import org.junit.Assert;
public class Test {
    @org.junit.Test
    public void minutes_test_success() throws Exception {
        int r = 3;
        int calculatedVolume = (int) ((4 * 3.14 * r*r*r) / 3);
        Figure figure4 = new Globe(3);
        int volume = (int) figure4.volume();
        Assert.assertEquals(calculatedVolume, volume);
    }
}