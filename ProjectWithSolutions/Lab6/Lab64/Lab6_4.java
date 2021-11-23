package ProjectWithSolutions.Lab6.Lab64;
public class Lab6_4 {
    public static void main(String[] args) {
        Integer [] a = {
4, 5, 8, 3}
;
        Double [] b = {
5., 6., 1., 9.}
;
        System.out.println(average(a));
        System.out.println(average(b));
    }
    public static <T extends Number> double average(T[] array) {
        double result = 0;
        for (T t: array){
            result += t.doubleValue();
        }
        result = result / array.length;
        return result;
    }
}