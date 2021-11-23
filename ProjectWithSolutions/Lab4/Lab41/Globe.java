package ProjectWithSolutions.Lab4.Lab41;

public class Globe extends Figure {
    private int r;

    public Globe(int r) {
        this.r = r;
    }

    public double volume() {
        return (4 * 3.14 * r * r * r) / 3;
    }
}
