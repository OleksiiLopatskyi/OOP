package ProjectWithSolutions.Lab3.Lab34;
import ProjectWithSolutions.Lab3.Lab34.OctString;
import org.junit.Assert;
public class Test {
    @org.junit.Test
    public void octalAdd_test_success() throws Exception {
        int a = Integer.parseInt(String.valueOf(4));
        int b = Integer.parseInt(String.valueOf(5));
        int c = a + b;
        OctString octString = new OctString(4);
        OctString octString1 = new OctString(5);
        OctString plus = octString.plus(octString1);
        Assert.assertEquals(Integer.toOctalString(c), plus.getOctValue());
    }
}
