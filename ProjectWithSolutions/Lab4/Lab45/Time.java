package ProjectWithSolutions.Lab4.Lab45;
import java.util.Scanner;

public class Time {
    private int first;
    private int second;

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
        if(first < 0 || second < 0){
            return;
        }else{
            System.out.println("Hours in minutes = " + minutes());
        }
    }

    public void init(int first, int second) {
        this.first = first;
        System.out.println("Hours = " + getFirst());
        if (first < 0) {
            System.out.println("Hours cannot be minus!");
            return;
        }

        this.second = second;
        System.out.println("Minutes = " + getSecond());
        if (second < 0) {
            System.out.println("Minutes cannot be minus!");
            return;
        }
    }

    public int minutes() {
        return first * 60 + second;
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
