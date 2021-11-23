package ProjectWithSolutions.Lab4.Lab41;

public class Parallelepiped extends Figure {
    private int x;
    private int y;
    private int z;

    public Parallelepiped(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double volume() {
        return x * y * z;
    }
}
