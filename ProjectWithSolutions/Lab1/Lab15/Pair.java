package ProjectWithSolutions.Lab1.Lab15;
import java.util.Scanner;
public class Pair {
    private int first;
    private int second;
    public int product(){
        return first * second;
    }
    public void init(int first, int second) {
        this.first = first;
        System.out.println("First katet = " + getFirst());
        if (first <= 0) {
            System.out.println("The length cannot be minus or null!");
            return;
        }
        this.second = second;
        System.out.println("Second katet = " + getSecond());
        if (second <= 0) {
            System.out.println("The length cannot be minus or null!");
            return;
        }
    }
    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of first katet =  ");
        first = scanner.nextInt();
        if (first <= 0) {
            System.out.println("The length cannot be minus or null!");
            return;
        }
        System.out.print("Enter value of second katet = ");
        second = scanner.nextInt();
        if (second <= 0) {
            System.out.println("The length cannot be minus or null!");
            return;
        }
    }
    public int getFirst() {
        return first;
    }
    public void setFirst(int first) {
        this.first = first;
    }
    public int getSecond() {
        return second;
    }
    public void setSecond(int second) {
        this.second = second;
    }
}


