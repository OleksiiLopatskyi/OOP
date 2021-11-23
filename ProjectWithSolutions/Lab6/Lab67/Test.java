package ProjectWithSolutions.Lab6.Lab67;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
public class Test {
    @org.junit.Test
    public void or_test_success() throws Exception {
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(1);
        list.add(5);
        list.add(8);
        list.add(7);
        list.add(2);
        list.add(4);
        list.add(3);
        list.sort(new Comparator<Integer>() {
                      @Override            public int compare(Integer o1, Integer o2) {
                          return o1.compareTo(o2);
                      }
                  }
        );
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        }
                ;
        list.removeIf(predicate);
        list.sort(new Comparator<Integer>() {
                      @Override            public int compare(Integer o1, Integer o2) {
                          return o1.compareTo(o2);
                      }
                  }
        );
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);
        Assert.assertEquals (list, list1);
    }
}

