package ProjectWithSolutions.Lab1.Lab17;

public class Lab1_7 {
    public static void main(String[] args) {
        Point p1 = new Point(1, 4);
        Point p2 = new Point(1, 4);
        Point p3 = new Point(1, 4);
        Triangle triangle = new Triangle();
        triangle.setP1(p1);
        triangle.setP2(p2);
        triangle.setP3(p3);
        p1.movingThePoint_X(2);
        p2.movingThePoint_Y(3);
        p1.display();
        p2.display();
        System.out.println("Determining the distance to the origin = " + p1.distanceToOrigin());
        System.out.println("The distance between two points = " + p2.distanceBetweenPoints(p3));
        System.out.println("Transformation into polar coordinates = " + p3.transformationIntoPolarCoordinates());
        System.out.println("Comparison for equality and inequality = " + p1.equals(p3));
        System.out.println();
        System.out.println("Enter value of first point: ");
        p1.read();
        System.out.println("Enter value of second point: ");
        p2.read();
        System.out.println("Enter value of third point: ");
        p3.read();
        triangle.display();
    }
}
