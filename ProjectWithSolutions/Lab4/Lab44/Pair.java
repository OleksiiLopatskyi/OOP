package ProjectWithSolutions.Lab4.Lab44;

public abstract class Pair {
    protected double a;
    protected double b;

    public Pair() {
    }

    public Pair(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public abstract void display();

    public abstract void read();

    public abstract double value();

    public abstract Pair add(Pair pair);

    public abstract Pair sub(Pair pair);

    public abstract Pair mul(Pair pair);

    public abstract Pair div(Pair pair);

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

}
