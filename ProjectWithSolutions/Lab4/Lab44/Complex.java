package ProjectWithSolutions.Lab4.Lab44;

import java.util.Scanner;

public class Complex extends Pair {
    public Complex() {
    }

    public Complex(double a, double b) {
        super(a, b);
    }

    public void display() {
        System.out.println(this);
    }

    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        a = scanner.nextInt();
        System.out.print("Enter value of b: ");
        b = scanner.nextInt();
    }

    @Override
    public Pair add(Pair complex) {
        if (!(complex instanceof Complex)) {
            return null;
        }
        Complex res = new Complex();
        res.a = reduce(a + complex.a);
        res.b = reduce(b + complex.b);
        return res;
    }

    @Override
    public Pair sub(Pair complex) {
        if (!(complex instanceof Complex)) {
            return null;
        }
        Complex res = new Complex();
        res.a = reduce(a - complex.a);
        res.b = reduce(b - complex.b);
        return res;
    }

    @Override
    public Pair mul(Pair complex) {
        if (!(complex instanceof Complex)) {
            return null;
        }
        Complex res = new Complex();
        res.a = reduce(a * complex.a - b * complex.b);
        res.b = reduce(a * complex.b + complex.a * b);
        return res;
    }

    @Override
    public Pair div(Pair complex) {
        if (!(complex instanceof Complex)) {
            return null;
        }
        Complex res = new Complex();
        res.a = reduce((a * complex.a) + (b * complex.b) / (complex.a * complex.a) + (complex.b * complex.b));
        res.b = reduce((complex.a * b) - (a * complex.b) / (complex.a * complex.a) + (complex.b * complex.b));
        return res;
    }

    public Complex conj() {
        Complex res = new Complex();
        res.a = a;
        res.b = -b;
        return res;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complex complex = (Complex) o;
        if (Double.compare(complex.a, a) != 0) return false;
        return Double.compare(complex.b, b) == 0;
    }

    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(a);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(b);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    private double reduce(double a) {
        return Math.round(a * 100.0) / 100.0;
    }

    @Override
    public double value() {
        return 0;
    }
}
