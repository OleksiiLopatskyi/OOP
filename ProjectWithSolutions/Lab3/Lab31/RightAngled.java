package ProjectWithSolutions.Lab3.Lab31;

public class RightAngled extends Pair {
    public void display() {
        if(this.getFirst() <= 0 || this.getSecond() <= 0){
            return;
        }
else{
            System.out.println("Hypotenuse = " + hypotenuse());
        }
        if(this.getFirst() <= 0 || this.getSecond() <= 0){
            return;
        }
else{
            System.out.println("Area = " + area());
        }
    }
    public double hypotenuse() {
        return Math.sqrt(this.getFirst() * this.getFirst() + this.getSecond() * this.getSecond());
    }
    public int area() {
        return this.getFirst() * this.getSecond() / 2;
    }
}


