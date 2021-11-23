package ProjectWithSolutions.Lab1.Lab17;
import java.util.Scanner;
public class Point {
    private double x;
    private double y;
    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        x = scanner.nextInt();
        System.out.print("y: ");
        y = scanner.nextInt();
    }
    public void display() {
        System.out.println(toString());
    }
    public void movingThePoint_Y(double y) {
        this.y = this.y + y;
    }
    public void movingThePoint_X(double x) {
        this.x = this.x + x;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distanceToOrigin() {
        Point origin = new Point(0, 0);
        return this.distanceBetweenPoints(origin);
    }
    public double distanceBetweenPoints(Point secondPoint) {
        double S = (secondPoint.x - this.x) * (secondPoint.x - this.x) + (secondPoint.y - this.y) * (secondPoint.y - this.y);
        return Math.sqrt(S);
    }
    public double transformationIntoPolarCoordinates() {
        return Math.atan2(x, y);
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    @Override    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        if (Double.compare(point.x, x) != 0) return false;
        return Double.compare(point.y, y) == 0;
    }
    @Override    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}


