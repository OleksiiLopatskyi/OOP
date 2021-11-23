package ProjectWithSolutions.Lab1.Lab13;

public class Lab1_3 {
    public static void main(String[] args) {
        BitString bitString1 = new BitString();
        BitString bitString2 = new BitString();
        System.out.println("For init: ");
        bitString1.init(1, 0);
        bitString2.init(1, 0);
        System.out.println("a = " + bitString1.getA());
        System.out.println("b = " + bitString2.getB());
        System.out.println();
        BitString.display(bitString1, bitString2);
        System.out.println();
        System.out.println();
        bitString1.read();
        bitString2.read();
        System.out.println();
        BitString.display(bitString1, bitString2);
        System.out.println();
        System.out.println(bitString1.toString());
    }
}
