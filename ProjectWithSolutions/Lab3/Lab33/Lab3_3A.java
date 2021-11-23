package ProjectWithSolutions.Lab3.Lab33;

public class Lab3_3A {
    public static void main(String[] args) {
        Or or = new Or();
        And and = new And();
        Not not = new Not();
        BitString bitString1 = new BitString();
        BitString bitString2 = new BitString();
        System.out.println("For init: ");
        and.init(1, 0);
        or.init(1, 0);
        not.init(1, 0);
        System.out.println("a = " + and.getA());
        System.out.println("b = " + and.getB());
        System.out.println();
        and.display(bitString1, bitString2);
        or.display(bitString1, bitString2);
        not.display(bitString1);
        System.out.println();
        System.out.println();
        bitString1.read();
        bitString2.read();
        System.out.println();
        System.out.println();
        System.out.println(bitString1.toString());
        System.out.println(bitString2.toString());
    }
}
