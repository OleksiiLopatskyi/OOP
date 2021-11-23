package ProjectWithSolutions.Lab3.Lab33;

public class Or extends BitString {
    public static BitString or(BitString first, BitString second) {
        BitString result = new BitString();

        result.setA(first.getA() | first.getB());
        result.setB(second.getA() | second.getB());

        return result;
    }
    public static BitString or() {
        BitString result=new BitString();
        BitString first = new BitString();
        BitString second = new BitString();
        result.setA(first.getA() | first.getB());
        result.setB(second.getA() | second.getB());

        return result;
    }

    public void display(BitString bitString,BitString bitString2){
        System.out.println("Not = " + or(bitString,bitString2).getA());
    }
}

