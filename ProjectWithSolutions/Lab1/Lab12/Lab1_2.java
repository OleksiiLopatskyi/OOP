package ProjectWithSolutions.Lab1.Lab12;
import java.util.Scanner;
public class Lab1_2 {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.allocateMemory(3);
        vector.read();
        vector.setValue(1, 5);
        System.out.println("Entered vector :");
        vector.printVector();
        System.out.println();
        System.out.println("The obtained value = " + vector.getValue(1));
        vector.display();
        Vector vector1 = new Vector();
        System.out.println("For init vector: ");
        vector1.init(6);
        vector1.setValue(1, 4);
        vector1.printVector();
        System.out.println();
        System.out.println("The obtained value = " + vector1.getValue(1));
        System.out.println();
        System.out.println();
        Vector vector2 = new Vector();
        vector2.init(-6);
        System.out.println("State " + vector2.getState());
        vector2.setValue(1, 4);
        vector2.printVector();
        System.out.println();
        System.out.print("Euclidean norm : " + vector.euclideanNorm());
    }
}
