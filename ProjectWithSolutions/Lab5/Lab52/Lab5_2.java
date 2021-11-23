package ProjectWithSolutions.Lab5.Lab52;

public class Lab5_2 {
    public static void main(String[] args) {
        System.out.println("For the first");
        System.out.println();
        Complex a1 = new Complex();
        Complex b1 = new Complex();
        a1.read();
        a1.display();
        System.out.println();
        b1.read();
        b1.display();
        System.out.println();
        Complex complex1 = a1.add(b1);
        System.out.println("Adding: " + complex1);
        Complex complex2 = a1.sub(b1);
        System.out.println("Subtraction: " + complex2);
        Complex complex3 = a1.mul(b1);
        System.out.println("Product: " + complex3);
        Complex complex4 = a1.div(b1);
        System.out.println("Division: " + complex4);
        System.out.println("First number is equal to the second: " + a1.equals(b1));
        System.out.println("Complex conjugate first number : " + a1.conj());
        System.out.println("Complex conjugate second number : " + b1.conj());
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("For the second");
        System.out.println();
        Complex a2 = new Complex();
        Complex b2 = new Complex();
        a2.read();
        a2.display();
        System.out.println();
        try {
            b2.read2();
        } catch (NumberFormatException e) {
            System.out.println("Number format exception occurred: " + e.getMessage());
            System.out.println();
            System.out.println("Used complex number (1,1)");
            b2.setA(1);
            b2.setB(1);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
            System.out.println();
            System.out.println("Used complex number (1,1)");
            b2.setA(1);
            b2.setB(1);
        }
        b2.display();
        System.out.println();
        b2.display();
        System.out.println();
        Complex complex5 = a2.add(b2);
        System.out.println("Adding: " + complex5);
        Complex complex6 = a2.sub(b2);
        System.out.println("Subtraction: " + complex6);
        Complex complex7 = a2.mul(b2);
        System.out.println("Product: " + complex7);
        Complex complex8 = a2.div(b2);
        System.out.println("Division: " + complex8);
        System.out.println("First number is equal to the second: " + a2.equals(b2));
        System.out.println("Complex conjugate first number : " + a2.conj());
        System.out.println("Complex conjugate second number : " + b2.conj());
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("For the third");
        System.out.println();
        Complex a3 = new Complex();
        Complex b3 = new Complex();
        a3.read();
        a3.display();
        System.out.println();
        try {
            b3.read2();
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred: " + e.getLocalizedMessage());
            System.out.println();
            System.out.println("Used complex number (1,1)");
            b3.setA(1);
            b3.setB(1);
        }
        b3.display();
        System.out.println();
        b3.display();
        System.out.println();
        Complex complex9 = a3.add(b3);
        System.out.println("Adding: " + complex9);
        Complex complex10 = a3.sub(b3);
        System.out.println("Subtraction: " + complex10);
        Complex complex11 = a3.mul(b3);
        System.out.println("Product: " + complex11);
        Complex complex12 = a3.div(b3);
        System.out.println("Division: " + complex12);
        System.out.println("First number is equal to the second: " + a3.equals(b3));
        System.out.println("Complex conjugate first number : " + a3.conj());
        System.out.println("Complex conjugate second number : " + b3.conj());
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("For the fourth");
        System.out.println();
        Complex a4 = new Complex();
        Complex b4 = new Complex();
        a4.read();
        a4.display();
        System.out.println();
        try {
            b4.read3();
        } catch (ExptionNullFirst e) {
            System.out.println("The real and imaginary part cannot be null!");
            System.out.println();
            System.out.println("Used complex number (1,1)");
            b4.setA(1);
            b4.setB(1);
        }
        b4.display();
        System.out.println();
        b4.display();
        System.out.println();
        Complex complex13 = a4.add(b4);
        System.out.println("Adding: " + complex13);
        Complex complex14 = a4.sub(b4);
        System.out.println("Subtraction: " + complex14);
        Complex complex15 = a4.mul(b4);
        System.out.println("Product: " + complex15);
        Complex complex16 = a4.div(b4);
        System.out.println("Division: " + complex16);
        System.out.println("First number is equal to the second: " + a4.equals(b4));
        System.out.println("Complex conjugate first number : " + a4.conj());
        System.out.println("Complex conjugate second number : " + b4.conj());
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("For the fifth");
        System.out.println();
        Complex a5 = new Complex();
        Complex b5 = new Complex();
        a5.read();
        a5.display();
        System.out.println();
        try {
            b5.read4();
        } catch (ExptionNullSecond e) {
            System.out.println("Exception occurred: " + e.getMessage() + e.getReason());
            System.out.println();
            System.out.println("Used complex number (1,1)");
            b5.setA(1);
            b5.setB(1);
        }
        b5.display();
        System.out.println();
        b5.display();
        System.out.println();
        Complex complex17 = a5.add(b5);
        System.out.println("Adding: " + complex17);
        Complex complex18 = a5.sub(b5);
        System.out.println("Subtraction: " + complex18);
        Complex complex19 = a5.mul(b5);
        System.out.println("Product: " + complex19);
        Complex complex20 = a5.div(b5);
        System.out.println("Division: " + complex20);
        System.out.println("First number is equal to the second: " + a5.equals(b5));
        System.out.println("Complex conjugate first number : " + a5.conj());
        System.out.println("Complex conjugate second number : " + b5.conj());
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("For the sixth");
        System.out.println();
        Complex a6 = new Complex();
        Complex b6 = new Complex();
        a6.read();
        a6.display();
        System.out.println();
        try {
            b6.read5();
        } catch (ExptionNullThird e) {
            System.out.println("Exception occurred: " + e.getMessage());
            System.out.println();
            System.out.println("Used complex number (1,1)");
            b6.setA(1);
            b6.setB(1);
        }
        b6.display();
        System.out.println();
        b6.display();
        System.out.println();
        Complex complex21 = a6.add(b6);
        System.out.println("Adding: " + complex21);
        Complex complex22 = a6.sub(b6);
        System.out.println("Subtraction: " + complex22);
        Complex complex23 = a6.mul(b6);
        System.out.println("Product: " + complex23);
        Complex complex24 = a6.div(b6);
        System.out.println("Division: " + complex24);
        System.out.println("First number is equal to the second: " + a6.equals(b6));
        System.out.println("Complex conjugate first number : " + a6.conj());
        System.out.println("Complex conjugate second number : " + b6.conj());
    }
}
