package ProjectWithSolutions.Lab1.Lab16;

public class Lab1_6 {
    public static void main(String[] args) {
        RightAngled rightAngled = new RightAngled();
        RightAngled.Pair pair = rightAngled.new Pair();
        pair.init(3, 4);
        rightAngled.setKatets(pair);
        rightAngled.display();
        System.out.println();
        System.out.println();
        pair.read();
        rightAngled.display();
    }
}
