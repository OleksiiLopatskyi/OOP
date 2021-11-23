package ProjectWithSolutions.Lab4.Lab44;
import java.util.Scanner;
public class Rational extends Pair {
    public Rational() {
    }
    public Rational(double a, double b) {
        super(a, b);
    }
    public void display(){
        System.out.println(this);
    }
    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        a = scanner.nextInt();
        System.out.print("Enter value of b: ");
        b = scanner.nextInt();
        if (b == 0) {
            System.out.println("Denominator cannot be null!");
            return;
        }
    }
    public double value() {
        return reduce(a / b);
    }
    @Override    public Pair add(Pair rational) {
        if (!(rational instanceof Rational)) {
            return null;
        }
        Rational res = new Rational();
        res.a = reduce(a * rational.b + b * rational.a);
        res.b = reduce(b * rational.b);
        return res;
    }
    @Override    public Pair sub(Pair rational) {
        if (!(rational instanceof Rational)) {
            return null;
        }
        Rational res = new Rational();
        res.a = reduce(a * rational.b - b * rational.a);
        res.b = reduce(b * rational.b);
        return res;
    }
    @Override    public Pair mul(Pair rational) {
        if (!(rational instanceof Rational)) {
            return null;
        }
        Rational res = new Rational();
        res.a = reduce(a * rational.a);
        res.b = reduce(b * rational.b);
        return res;
    }
    @Override    public Pair div(Pair rational) {
        if (!(rational instanceof Rational)) {
            return null;
        }
        Rational res = new Rational();
        res.a = reduce(a * rational.b);
        res.b = reduce(rational.a * b);
        return res;
    }
    public boolean great(Rational rational) {
        return a * rational.b - b * rational.a > 0;
    }
    public boolean less(Rational rational) {
        return a * rational.b - b * rational.a < 0;
    }
    public boolean equal(Rational rational) {
        return a * rational.b - b * rational.a == 0;
    }
    private double reduce(double a) {
        return Math.round(a * 100.0) / 100.0;
    }
}