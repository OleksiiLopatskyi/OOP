package ProjectWithSolutions.Lab6.Lab63;

public class Lab6_3 {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        list1.read();
        list2.read();
        System.out.println();
        System.out.println("First array: ");
        list1.display();
        System.out.println();
        System.out.println("Second array: ");
        list2.display();
        System.out.println();
        System.out.println();
        System.out.println("Operation and: ");
        LinkedList.and(list1, list2).display();
        System.out.println();
        System.out.println("Operation or: ");
        LinkedList.or(list1, list2).display();
        System.out.println();
        System.out.println("Get by index");
        System.out.println(list1.getByIndex(1));
        System.out.println(list2.getByIndex(3));
    }
}
