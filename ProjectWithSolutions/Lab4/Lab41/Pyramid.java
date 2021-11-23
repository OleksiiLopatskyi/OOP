package ProjectWithSolutions.Lab4.Lab41;

public class Pyramid extends Figure {
    private int x;
    private int y;
    private int h;

    public Pyramid(int x, int y, int h) {
        this.x = x;
        this.y = y;
        this.h = h;
    }

    public double volume() {
        return x * y * h;
    }
}
