package ProjectWithSolutions.Lab5.Lab51;

public class Lab5_1A {
    public static void main(String[] args) {
        Time firstTime = new Time(1, 30);
        firstTime.display();
        System.out.println();
        Time secondTime = new Time();
        try {
            secondTime.read();
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getLocalizedMessage());
            System.out.println("Used hours 1 and minutes 1");
            secondTime.setFirst(1);
            secondTime.setSecond(1);
        }
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
