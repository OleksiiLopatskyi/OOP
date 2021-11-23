package ProjectWithSolutions.Lab1.Lab17;

public class Triangle {
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle init(Point p1, Point p2, Point p3) {
        return new Triangle(p1, p2, p3);
    }

    public Triangle() {
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public void display() {
        if (get_a() < get_b() + get_c() && get_b() < get_a() + get_c() && get_c() < get_a() + get_b()) {
            System.out.println();
            getTriangle();
            System.out.println();
        } else {
            System.out.println("Such a triangle does not exist!");
            return;
        }
        System.out.println("Area = " + area());
        System.out.println("Perimeter = " + perimeter());
        System.out.println();
        System.out.println("Height of a = " + getHeight_a());
        System.out.println("Height of b = " + getHeight_b());
        System.out.println("Height of c = " + getHeight_c());
        System.out.println();
        System.out.println("Value of side a = " + get_a());
        System.out.println("Value of side b = " + get_b());
        System.out.println("Value of side c = " + get_c());
        System.out.println();
        System.out.println("Value of angle A = " + get_A());
        System.out.println("Value of angle B = " + get_B());
        System.out.println("Value of angle C = " + get_C());
    }

    public double perimeter() {
        double P = 0;
        P = get_a() + get_b() + get_c();
        return P;
    }

    public double halfPerimeter() {
        double p = 0;
        p = perimeter() / 2;
        return p;
    }

    public double area() {
        double S = 0;
        S = halfPerimeter() * (halfPerimeter() - get_a()) * (halfPerimeter() - get_b()) * (halfPerimeter() - get_c());
        return Math.sqrt(S);
    }

    public double getHeight_a() {
        double h = 0;
        h = 2 * area() / get_a();
        return h;
    }

    public double getHeight_b() {
        double h = 0;
        h = 2 * area() / get_b();
        return h;
    }

    public double getHeight_c() {
        double h = 0;
        h = 2 * area() / get_c();
        return h;
    }

    public double get_a() {
        double S = (p2.getX() - p1.getX()) * (p2.getX() - p1.getX()) + (p2.getY() - p1.getY()) * (p2.getY() - p1.getY());
        return Math.sqrt(S);
    }

    public double get_b() {
        double S = (p3.getX() - p1.getX()) * (p3.getX() - p1.getX()) + (p3.getY() - p1.getY()) * (p3.getY() - p1.getY());
        return Math.sqrt(S);
    }

    public double get_c() {
        double S = (p3.getX() - p2.getX()) * (p3.getX() - p2.getX()) + (p3.getY() - p2.getY()) * (p3.getY() - p2.getY());
        return Math.sqrt(S);
    }

    public void getTriangle() {
        if (get_a() == get_b() && get_b() == get_c()) {
            System.out.println("Triangle is equilateral");
        } else if (get_a() == get_b() || get_b() == get_c() || get_a() == get_c()) {
            System.out.println("Triangle is isosceles");
        } else if (get_A() == 90.0 || get_B() == 90.0 || get_C() == 90.0) {
            System.out.println("Triangle is rectangular");
        }
    }

    public double get_A() {
        double A = 0;
        A = Math.acos(((get_b() * get_b()) + (get_c() * get_c()) - (get_a() * get_a())) / (2 * get_b() * get_c()));
        return Math.toDegrees(A);
    }

    public double get_B() {
        double B = 0;
        B = Math.acos(((get_a() * get_a()) + (get_c() * get_c()) - (get_b() * get_b())) / (2 * get_a() * get_c()));
        return Math.toDegrees(B);
    }

    public double get_C() {
        double C = 0;
        C = Math.acos(((get_a() * get_a()) + (get_b() * get_b()) - (get_c() * get_c())) / (2 * get_a() * get_b()));
        return Math.toDegrees(C);
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }
}
