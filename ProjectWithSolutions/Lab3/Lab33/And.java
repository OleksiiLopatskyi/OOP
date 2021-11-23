package ProjectWithSolutions.Lab3.Lab33;

public class And extends BitString{

    public static BitString and(BitString first, BitString second) {
        BitString result = new BitString();

        result.setA(first.getA() & first.getB());
        result.setB(second.getA() & second.getB());

        return result;
    }

    public void display(BitString bitString1, BitString bitString2){
        System.out.println("And = " + and(bitString1, bitString2));
    }
}
