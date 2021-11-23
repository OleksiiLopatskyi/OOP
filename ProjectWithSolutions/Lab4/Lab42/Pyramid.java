package ProjectWithSolutions.Lab4.Lab42;

public class Pyramid implements Figure {
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
