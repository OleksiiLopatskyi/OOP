package ProjectWithSolutions.Lab1.Lab13;
import java.util.Scanner;

public class BitString {
    private long a;
    private long b;

    public static BitString not(BitString first) {
        BitString result = new BitString();
        result.a = ~first.a;

        return result;
    }

    public static BitString and(BitString first, BitString second) {
        BitString result = new BitString();

        result.a = first.a & first.b;
        result.b = second.a & second.b;

        return result;
    }

    public static BitString or(BitString first, BitString second) {
        BitString result = new BitString();

        result.a = first.a | first.b;
        result.b = second.a | second.b;

        return result;
    }


    public void read() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        a = scanner.nextInt();

        System.out.print("Enter value of b: ");
        b = scanner.nextInt();
    }

    public static void display(BitString bitString1, BitString bitString2){
        System.out.println("And = " + and(bitString1, bitString2));
        System.out.println("Or = " + or(bitString1, bitString2));
        System.out.println("Not = " + not(bitString1));
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
