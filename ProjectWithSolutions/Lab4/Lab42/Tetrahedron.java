package ProjectWithSolutions.Lab4.Lab42;
public class Tetrahedron implements Figure {
    private int a;
    public Tetrahedron(int a) {
        this.a = a;
    }
    public double volume() {
        return (a*a*a * Math.sqrt(2)) / 12;
    }
}

