package ProjectWithSolutions.Lab4.Lab42;

public class Parallelepiped implements Figure {
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
