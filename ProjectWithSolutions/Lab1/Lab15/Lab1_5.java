package ProjectWithSolutions.Lab1.Lab15;

public class Lab1_5 {
    public static void main(String[] args) {
        Pair pair = new Pair();
        RightAngled rightAngled = new RightAngled(pair);
        pair.init(3, 4);
        rightAngled.display();
        System.out.println();
        System.out.println();
        pair.read();
        rightAngled.display();
    }
}
