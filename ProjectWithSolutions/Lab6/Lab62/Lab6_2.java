package ProjectWithSolutions.Lab6.Lab62;

public class Lab6_2 {
    public static void main(String[] args) {
        Binary binary1 = new Binary();
        Binary binary2 = new Binary();
        binary1.read();
        binary2.read();
        System.out.println();
        System.out.println("First array: ");
        binary1.display();
        System.out.println();
        System.out.println("Second array: ");
        binary2.display();
        System.out.println();
        System.out.println();
        System.out.println("Operation and: ");
        Binary.and(binary1, binary2).display();
        System.out.println();
        System.out.println("Operation or: ");
        Binary.or(binary1, binary2).display();
        System.out.println();
        System.out.println("Get by index");
        System.out.println(binary1.getByIndex(5));
    }
}
