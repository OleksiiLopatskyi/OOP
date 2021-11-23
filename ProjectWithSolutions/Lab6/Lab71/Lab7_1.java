package ProjectWithSolutions.Lab6.Lab71;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Lab7_1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        generate(read(), list);
        System.out.println(list);
        System.out.println();
        System.out.println(sum(list));
    }

    public static int read(){
        int k;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of size array: ");
        k = scanner.nextInt();
        if (k <= 0) {
            throw new RuntimeException("Size cannot be minus or null!");
        }
        return k;
    }

    public static int sum(List<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 1){
                sum += i + 1;
            }
        }
        return sum;
    }

    public static void generate(int k, List<Integer> list){
        for (int i = 0; i < k; i++) {
            list.add((int) (Math.random() * 10));
        }
    }
}
