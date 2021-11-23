package ProjectWithSolutions.Lab5.Lab51;
import java.util.Scanner;
public class Time {
    private int first;
    private int second;
    public void prefixIncrement() {
        System.out.println("Prefix increment: " + ++first);
    }
    public void prefixDiscrement() {
        System.out.println("Prefix discrement: " + --first);
    }
    public void postfixIncrement() {
        System.out.println("Postfix increment: " + second++);
    }
    public void postfixDiscrement() {
        System.out.println("Postfix discrement: " + second--);
    }
    public Time(int first, int second) {
        this.first = first;
        if (first < 0) {
            System.out.println("Used hours 1");
            this.first = 1;
        }
        this.second = second;
        if (second < 0) {
            System.out.println("Used minutes 1");
            this.second = 1;
        }
    }
    public Time() {
    }
    public Time(Time time) {
        this.first = time.getFirst();
        this.second = time.getSecond();
    }
    public void read() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of hours: ");
        first = scanner.nextInt();
        if (first < 0) {
            throw new Exception("Hours cannot be minus!");
        }
        System.out.print("Enter value of minutes: ");
        second = scanner.nextInt();
        if (second < 0) {
            throw new Exception("Minutes cannot be minus!");
        }
    }
    public void display() {
        System.out.println("Hours = " + getFirst());
        System.out.println("Minutes = " + getSecond());
        System.out.println("Hours in minutes = " + minutes());
    }
    public void init(int first, int second) throws Exception{
        this.first = first;
        if (first < 0) {
            throw new Exception("Hours cannot be minus!");
        }
        this.second = second;
        if (second < 0) {
            throw new Exception("Minutes cannot be minus!");
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
        if(first < 0){
            System.out.println("Used hours 1");
            this.first = 1;
        }
    }
    public int getSecond() {
        return second;
    }
    public void setSecond(int second) {
        this.second = second;
        if(second < 0){
            System.out.println("Used minutes 1");
            this.second = 1;
        }
    }
}




