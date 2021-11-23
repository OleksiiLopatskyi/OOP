package ProjectWithSolutions.Lab2.Lab24;
import java.util.Arrays;
import java.util.Scanner;
public class Matrix {
    private int k;
    private int n;
    private int[][] m;
    public Matrix sum(Matrix a) {
        if (this.k != a.k || this.n != a.n) {
            System.out.println("Matrix should be the same size");
            return null;
        }
        Matrix result = new Matrix(k, n);
        for (int i = 0;
 i < k;
 i++) {
            for (int j = 0;
 j < n;
 j++) {
                result.m[i][j] = m[i][j] + a.m[i][j];
            }
        }
        return result;
    }
    public double normsOfMatrix() {
        int[][] result = new int[k][n];
        double S = 0;
        for (int i = 0;
 i < k;
 i++) {
            for (int j = 0;
 j < n;
 j++) {
                result[i][j] = m[i][j] * m[i][j];
                S += result[i][j];
            }
        }
        return Math.sqrt(S);
    }
    public Matrix(int[][] m) {
        this.m = m;
        this.k = m.length;
        this.n = m[0].length;
    }
    public Matrix(int k, int n) {
        this.k = k;
        if (k <= 0) {
            System.out.println("Size cannot be minus or null!");
            return;
        }
        this.n = n;
        if (n <= 0) {
            System.out.println("Size cannot be minus or null!");
            return;
        }
        m = new int[k][n];
    }
    public Matrix() {
        this(10,10);
    }
    public Matrix(Matrix matrix) {
        this.k = matrix.getK();
        this.n = matrix.getN();
        this.m = new int[k][n];
        for (int i = 0;
 i < k;
 i++) {
            for (int j = 0;
 j < n;
 j++) {
                this.m[i][j] = matrix.m[i][j];
            }
        }
    }
    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of size K: ");
        k = scanner.nextInt();
        if (k <= 0) {
            System.out.println("Size cannot be minus or null!");
            return;
        }
        System.out.print("Enter value of size N: ");
        n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Size cannot be minus or null!");
            return;
        }
        for (int i = 0;
 i < k;
 i++) {
            for (int j = 0;
 j < n;
 j++) {
                this.m[i][j] = (int) (Math.random() * 10);
            }
        }
    }
    public void display() {
        System.out.println("Matrix: ");
        for (int i = 0;
 i < k;
 i++) {
            for (int j = 0;
 j < k;
 j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public int getK() {
        return k;
    }
    public void setK(int k) {
        k = k;
    }
    public int getN() {
        return n;
    }
    public void setN(int n) {
        n = n;
    }
    public int[][] getM() {
        return m;
    }
    public void setM(int[][] m) {
        this.m = m;
    }
    @Override    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix = (Matrix) o;
        return Arrays.deepEquals(m, matrix.m);
    }
    @Override    public int hashCode() {
        return Arrays.deepHashCode(m);
    }
    @Override
    public String toString() {
        return "Matrix{" +
                "k=" + k +
                ", n=" + n +
                ", m=" + Arrays.toString(m) +
                '}';
    }

}