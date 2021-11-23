package ProjectWithSolutions.Lab6.Lab67;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
public class Lab6_7 {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(6);
        list.add(1);
        list.add(5);
        list.add(8);
        list.add(7);
        list.add(2);
        list.add(4);
        list.add(3);
        List<Integer> list1 = new ArrayList<>(list);
        list.sort(new Comparator<Integer>() {
            @Override            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        }
);
        System.out.println(list);
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        }
;
        sortIf(list1, predicate);
        System.out.println(list1);
    }
    public static List <Integer> sortIf(List <Integer> list, Predicate <Integer> predicate ){
        list.removeIf(predicate);
        list.sort(new Comparator<Integer>() {
            @Override            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        }
);
        return list;
    }
}