package ProjectWithSolutions.Lab2.Lab28;
import java.util.Scanner;
public class Triangle {
    private Point p1;
    private Point p2;
    private Point p3;
    static int counterOuter;
    static int counterInner;

    public Triangle() {
        counterOuter++;
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        counterOuter++;
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
            counterInner++;
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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Point point = (Point) o;

            if (Double.compare(point.x, x) != 0) return false;
            return Double.compare(point.y, y) == 0;
        }

        @Override
        public int hashCode() {
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
}
