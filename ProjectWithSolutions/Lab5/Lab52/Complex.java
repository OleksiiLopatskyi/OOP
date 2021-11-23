package ProjectWithSolutions.Lab5.Lab52;

import java.util.Scanner;
public class Complex {
    private double a;
    private double b;
    public Complex() {
    }
    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public void display(){
        System.out.println(this);
    }
    public void read(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        a = scanner.nextInt();
        System.out.print("Enter value of b: ");
        b = scanner.nextInt();
    }
    public void read1 () throws  Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        a = scanner.nextInt();
        if (a == 0) {
            throw new Exception("Imaginary part of second number cannot be null!");
        }
        System.out.print("Enter value of b: ");
        b = scanner.nextInt();
        if (b == 0) {
            throw new Exception("The real of second number part cannot be null!");
        }
    }
    public void read2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        a = scanner.nextInt();
        if (a == 0) {
            throw new NumberFormatException("Imaginary part of second number cannot be null!");
        }
        System.out.print("Enter value of b: ");
        b = scanner.nextInt();
        if (b == 0) {
            throw new NumberFormatException("The real of second number part cannot be null!");
        }
    }
    public void read3() throws ExptionNullFirst {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        a = scanner.nextInt();
        if (a == 0) {
            throw new ExptionNullFirst();
        }
        System.out.print("Enter value of b: ");
        b = scanner.nextInt();
        if (b == 0) {
            throw new ExptionNullFirst();
        }
    }
    public void read4() throws ExptionNullSecond {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        a = scanner.nextInt();
        if (a == 0) {
            throw new ExptionNullSecond("Number format exception: ", "imaginary part of second number cannot be null!");
        }
        System.out.print("Enter value of b: ");
        b = scanner.nextInt();
        if (b == 0) {
            throw new ExptionNullSecond("Number format exception: ","the real of second number part cannot be null!");
        }
    }
    public void read5() throws ExptionNullThird {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        a = scanner.nextInt();
        if (a == 0) {
            throw new ExptionNullThird("Imaginary part of second number cannot be null!");
        }
        System.out.print("Enter value of b: ");
        b = scanner.nextInt();
        if (b == 0) {
            throw new ExptionNullThird("The real of second number part cannot be null!");
        }
    }
    public Complex add(Complex complex) {
        Complex res = new Complex();
        res.a = a + complex.a;
        res.b = b + complex.b;
        return res;
    }
    public Complex sub(Complex complex) {
        Complex res = new Complex();
        res.a = a - complex.a;
        res.b = b - complex.b;
        return res;
    }
    public Complex mul(Complex complex) {
        Complex res = new Complex();
        res.a = a * complex.a - b * complex.b;
        res.b = a * complex.b + complex.a * b;
        return res;
    }
    public Complex div(Complex complex) {
        Complex res = new Complex();
        res.a = (a * complex.a) + (b * complex.b) / (complex.a * complex.a) + (complex.b * complex.b);
        res.b = (complex.a * b) - (a * complex.b) / (complex.a * complex.a) + (complex.b * complex.b);
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
    public double value() {
        return 0;
    }
    @Override
    public String toString() {
        return "Complex{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
        if(a == 0){
            System.out.println("Used imaginary part 1");
            this.a = 1;
        }
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
        if(b == 0){
            System.out.println("Used the real part 1");
            this.b = 1;
        }
    }
}


