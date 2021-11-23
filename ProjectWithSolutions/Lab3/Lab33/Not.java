package ProjectWithSolutions.Lab3.Lab33;

public class Not extends BitString {
    public static BitString not(BitString first) {
        BitString result = new BitString();
        result.setA(~first.getA());

        return result;
    }

    public void display(BitString bitString){
        System.out.println("Not = " + not(bitString));
    }
}

