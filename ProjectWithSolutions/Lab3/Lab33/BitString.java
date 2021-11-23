package ProjectWithSolutions.Lab3.Lab33;

import java.util.Scanner;

public class BitString {
    private long a;
    private long b;

    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        a = scanner.nextInt();
        System.out.print("Enter value of b: ");
        b = scanner.nextInt();
    }

    public void init(long a, long b) {
        this.a = a;
        this.b = b;
    }

    public long getA() {
        return a;
    }

    public void setA(long a) {
        this.a = a;
    }

    public long getB() {
        return b;
    }

    public void setB(long b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "BitString{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

}
