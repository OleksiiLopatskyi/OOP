package ProjectWithSolutions.Lab4.Lab42;

public class Globe implements Figure {
    private int r;

    public Globe(int r) {
        this.r = r;
    }

    public double volume() {
        return (4 * 3.14 * r * r * r) / 3;
    }
}
