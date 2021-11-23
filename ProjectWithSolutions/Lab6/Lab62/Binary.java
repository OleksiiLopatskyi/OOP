package ProjectWithSolutions.Lab6.Lab62;
import java.util.Scanner;
public class Binary {
    private char[] a;
    private int k;

    public Binary() {
    }

    public Binary(int k) {
        this.k = k;
        this.a = new char[k];
    }

    public Binary(char[] a, int k) {
        this.a = a;
        this.k = k;
    }

    public Binary(Binary binary) {
        this.a = a;
        this.k = k;
    }

    public void init(int k) {
        this.k = k;
        this.a = new char[k];
    }


    public void read() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value of size array: ");
        k = scanner.nextInt();
        if (k <= 0) {
            System.out.println("Size cannot be minus or null!");
            return;
        }

        this.a = new char[k];

        for (int i = 0; i < k; i++) {
            this.a[i] = (char) ((Math.random() * 3) - 1);
        }
    }

    public void display() {
        for (int i = 0; i < k; i++) {
            System.out.print((int) (a[i]) + " ");
        }
    }

    public char getByIndex(int index){
        if(index <= k - 1 && index > 0){
            return a[index];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int getK() {
        return k;
    }
    public char[] getA() {
        return a;
    }
    public void setA(char[] symbol){
        a=symbol;
    }

    public static Binary and(Binary first, Binary second){
        if(first.k != second.k){
            throw new RuntimeException("Both arrays must have the same size!");
        }

        Binary result = new Binary(first.getK());

        for (int i = 0; i < first.k; i++) {
            result.a [i] = (char) (first.a [i] & second.a [i]);
        }
        return result;
    }

    public static Binary or(Binary first, Binary second){
        if(first.k != second.k){
            throw new RuntimeException("Both arrays must have the same size!");
        }

        Binary result = new Binary(first.getK());

        for (int i = 0; i < first.k; i++) {
            result.a [i] = (char) (first.a [i] | second.a [i]);
        }
        return result;
    }

    }

