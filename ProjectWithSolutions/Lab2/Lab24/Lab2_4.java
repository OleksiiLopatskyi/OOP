package ProjectWithSolutions.Lab2.Lab24;

public class Lab2_4 {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.read();
        System.out.println();
        matrix.display();
        System.out.println();
        System.out.println("Sum of matrix: ");
        matrix.sum(matrix).display();
        System.out.println();
        System.out.println("Equals of matrix: " + matrix.equals(matrix));
        System.out.println();
        System.out.println("Norm of matrix: " + matrix.normsOfMatrix());
    }
}
