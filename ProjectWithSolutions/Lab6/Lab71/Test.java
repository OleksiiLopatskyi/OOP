package ProjectWithSolutions.Lab6.Lab71;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.List;

public class Test {
   @org.junit.Test public void or_test_success() throws Exception {
        List<Integer> list = new ArrayList<>();

        list.add(6);
        list.add(1);
        list.add(5);
        list.add(8);

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 1){
                sum += i + 1;
            }
        }


        Assert.assertEquals (5, sum);
    }
}