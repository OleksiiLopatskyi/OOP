package ProjectWithSolutions.Lab1.Lab16;
import java.util.Scanner;
public class RightAngled {
    private Pair katets;
    public void display() {
        if(katets.getFirst() <= 0 || katets.getSecond() <= 0){
            return;
        }
else{
            System.out.println("Hypotenuse = " + hypotenuse());
        }
        if(katets.getFirst() <= 0 || katets.getSecond() <= 0){
            return;
        }
else{
            System.out.println("Area = " + area());
        }
    }
    public double hypotenuse() {
        return Math.sqrt(katets.getFirst() * katets.getFirst() + katets.getSecond() * katets.getSecond());
    }
    public int area() {
        return katets.getFirst() * katets.getSecond() / 2;
    }
    public Pair getKatets() {
        return katets;
    }
    public void setKatets(Pair katets) {
        this.katets = katets;
    }
    public class Pair {
        private int first;
        private int second;
        public int product() {
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
}

