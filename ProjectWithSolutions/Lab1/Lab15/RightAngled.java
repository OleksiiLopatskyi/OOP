package ProjectWithSolutions.Lab1.Lab15;

public class RightAngled {
    private Pair katets;

    public void display() {
        if (katets.getFirst() <= 0 || katets.getSecond() <= 0) {
            return;
        } else {
            System.out.println("Hypotenuse = " + hypotenuse());
        }
        if (katets.getFirst() <= 0 || katets.getSecond() <= 0) {
            return;
        } else {
            System.out.println("Area = " + area());
        }
    }

    public RightAngled(Pair katets) {
        this.katets = katets;
    }

    public double hypotenuse() {
        return Math.sqrt(katets.getFirst() * katets.getFirst() + katets.getSecond() * katets.getSecond());
    }

    public int area() {
        return katets.getFirst() * katets.getSecond() / 2;
    }

    public Pair getKatets() {
        return katets;
    }

    public void setKatets(Pair katets) {
        this.katets = katets;
    }
}
