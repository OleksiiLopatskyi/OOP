package ProjectWithSolutions.Lab1.Lab12;

import java.util.Scanner;

public class Vector {
    private int[] vector;
    private int i;
    private int state;

    public void init(int size) {
        if (size <= 0) {
            System.out.println("Incorrect size value. Size must be >= 1. Used default size = 10.");
            size = 10;
        }
        this.i = size;
        this.state = 200;
        this.vector = new int[this.i];
    }

    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter vector 1: ");
        for (int j = 0;
             j < vector.length;
             ++j) {
            vector[j] = scanner.nextInt();
        }
    }

    public void display() {
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public void allocateMemory(int size) {
        this.i = size;
        this.vector = new int[this.i];
    }

    public void setValue(int index, int value) {
        if (i < index + 1) {
            state = 400;
            return;
        }
        vector[index] = value;
    }

    public void printVector() {
        for (int x : vector) {
            System.out.println(x);
        }
    }

    public int getValue(int index) {
        if (i < index + 1) {
            state = 400;
            return -1;
        }
        return vector[index];
    }

    public double euclideanNorm() {
        double S = 0;
        for (int d : vector) {
            S += d * d;
        }
        return Math.sqrt(S);
    }

    public int[] getVector() {
        return vector;
    }

    public int getI() {
        return i;
    }

    public int getState() {
        return state;
    }
}
