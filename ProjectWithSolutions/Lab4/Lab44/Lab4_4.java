package ProjectWithSolutions.Lab4.Lab44;

public class Lab4_4 {
    public static void main(String[] args) {
        Rational a = new Rational();
        Rational b = new Rational();
        System.out.println("For rational numbers");
        System.out.println();
        a.read();
        a.display();
        System.out.println();
        b.read();
        b.display();
        System.out.println();
        display(a, b);
        System.out.println();
        System.out.println("Value of rational number a: " + a.value());
        System.out.println("Value of rational number b: " + b.value());
        Pair rational1 = a.add(b);
        System.out.println("Adding: " + rational1);
        Pair rational2 = a.sub(b);
        System.out.println("Subtraction: " + rational2);
        Pair rational3 = a.mul(b);
        System.out.println("Product: " + rational3);
        Pair rational4 = a.div(b);
        System.out.println("Division: " + rational4);
        System.out.println("First number is lesser then second: " + a.less(b));
        System.out.println("First number is greater then second: " + a.great(b));
        System.out.println("First number is equal to the second: " + a.equal(b));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("For complex numbers");
        System.out.println();
        Complex a1 = new Complex();
        Complex b1 = new Complex();
        a1.read();
        a1.display();
        System.out.println();
        b1.read();
        b1.display();
        System.out.println();
        Pair complex1 = a1.add(b1);
        System.out.println("Adding: " + complex1);
        Pair complex2 = a1.sub(b1);
        System.out.println("Subtraction: " + complex2);
        Pair complex3 = a1.mul(b1);
        System.out.println("Product: " + complex3);
        Pair complex4 = a1.div(b1);
        System.out.println("Division: " + complex4);
        System.out.println("First number is equal to the second: " + a1.equals(b1));
        System.out.println("Complex conjugate number: " + a1.conj());
    }

    public static void display(Pair a, Pair b) {
        Pair c = a.add(b);
        System.out.println("Value of rational number c: " + c);
        Pair d = a.mul(b);
        System.out.println("Value of rational number d: " + d);
    }
}
