package ProjectWithSolutions.Lab2.Lab21;

public class Lab2_1 {
    public static void main(String[] args) {
        Time firstTime = new Time(1, 30);
        firstTime.display();
        System.out.println();
        Time secondTime = new Time();
        secondTime.read();
        secondTime.display();
        System.out.println();
        Time anotherTime = new Time(firstTime);
        anotherTime.display();
        System.out.println();
        firstTime.prefixIncrement();
        firstTime.prefixDiscrement();
        firstTime.postfixDiscrement();
        firstTime.postfixIncrement();
    }
}
