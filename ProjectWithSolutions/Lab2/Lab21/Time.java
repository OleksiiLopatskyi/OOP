package ProjectWithSolutions.Lab2.Lab21;
import java.util.Scanner;

public class Time {
    private int first;
    private int second;
    public void prefixIncrement(){
        System.out.println("Prefix increment: " + ++first);
    }
    public void prefixDiscrement(){
        System.out.println("Prefix discrement: " + --first);
    }
    public void postfixIncrement(){
        System.out.println("Postfix increment: " + second++);
    }
    public void postfixDiscrement(){
        System.out.println("Postfix discrement: " + second--);
    }
    public Time(int first, int second) {
        this.first = first;
        if (first < 0) {
            System.out.println("Hours cannot be minus!");
            return;
        }
        this.second = second;
        if (second < 0) {
            System.out.println("Minutes cannot be minus!");
            return;
        }
    }
    public Time() {
    }
    public Time(Time time) {
        this.first = time.getFirst();
        if (first < 0) {
            System.out.println("Hours cannot be minus!");
            return;
        }
        this.second = time.getSecond();
        if (second < 0) {
            System.out.println("Minutes cannot be minus!");
            return;
        }
    }
    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of hours: ");
        first = scanner.nextInt();
        if (first < 0) {
            System.out.println("Hours cannot be minus!");
            return;
        }
        System.out.print("Enter value of minutes: ");
        second = scanner.nextInt();
        if (second < 0) {
            System.out.println("Minutes cannot be minus!");
            return;
        }
    }
    public void display() {
        System.out.println("Hours = " + getFirst());
        System.out.println("Minutes = " + getSecond());
        if (first < 0 || second < 0) {
            return;
        }
 else {
            System.out.println("Hours in minutes = " + minutes());
        }
    }
    public void init(int first, int second) {
        this.first = first;
        if (first < 0) {
            System.out.println("Hours cannot be minus!");
            return;
        }
        this.second = second;
        if (second < 0) {
            System.out.println("Minutes cannot be minus!");
            return;
        }
    }
    public int minutes() {
        return first * 60 + second;
    }

    @Override
    public String toString() {
        return "Time{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public int getFirst() {
        return first;
    }
    public void setFirst(int first) {
        this.first = first;
    }
    public int getSecond() {
        return second;
    }
    public void setSecond(int second) {
        this.second = second;
    }
}


