package ProjectWithSolutions.Lab3.Lab32;
import java.util.Scanner;
public class Liquid {
    private String name;
    private double density;
    public Liquid(String name, double density) {
        this.name = name;
        this.density = density;
    }
    public Liquid() {
    }
    @Override    protected void finalize() throws Throwable {
        System.out.println("Object will be destroyed");
        super.finalize();
    }
    public void display(){
        System.out.println();
    }
    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of hours: ");
        density = scanner.nextInt();
        if (density <= 0) {
            System.out.println("Density cannot be minus or null!");
            return;
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getDensity() {
        return density;
    }
    public void setDensity(double density) {
        this.density = density;
    }
    @Override
    public String toString() {
        return "Liquid{" +
                "name='" + name + '\'' +
                ", density=" + density +
                '}';
    }
}
