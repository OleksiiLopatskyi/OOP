package ProjectWithSolutions.Lab6.Lab63;

import java.util.Scanner;
public class LinkedList implements List{
    private Node head;
    private Node tail;
    public LinkedList() {
        head = null;
        tail = null;
    }
    @Override    public void add(char c) {
        Node node = new Node();
        node.setValue(c);
        if(head == null && tail == null){
            head = node;
            tail = node;
            return;
        }
        node.setPrevious(tail);
        tail.setNext(node);
        tail = node;
    }
    @Override    public int size() {
        Node tmp = head;
        int counter = 0;
        while (tmp != null){
            counter++;
            tmp = tmp.getNext();
        }
        return counter;
    }
    @Override    public int getByIndex(int index) {
        if(index >= size()){
            throw new ArrayIndexOutOfBoundsException("List index out of bounds!");
        }
        Node tmp = head;
        while (index != 0){
            index--;
            tmp = tmp.getNext();
        }
        return (int) tmp.getValue();
    }
    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of size list: ");
        int k = scanner.nextInt();
        if (k <= 0) {
            System.out.println("Size cannot be minus or null!");
            return;
        }
                for (int i = 0;
 i < k;
 i++) {
            this.add((char) ((Math.random() * 3) - 1));
        }
    }
    public static LinkedList and(LinkedList first, LinkedList second){
        if(first.size() != second.size()){
            throw new RuntimeException("Both arrays must have the same size!");
        }
        LinkedList result = new LinkedList();
        for (int i = 0;
 i < first.size();
 i++) {
            result.add((char) (first.getByIndex(i) & second.getByIndex(i)));
        }
        return result;
    }
    public static LinkedList or(LinkedList first, LinkedList second){
        if(first.size() != second.size()){
            throw new RuntimeException("Both arrays must have the same size!");
        }
        LinkedList result = new LinkedList();
        for (int i = 0; i < first.size(); i++) {
            result.add((char) (first.getByIndex(i) | second.getByIndex(i)));
        }
        return result;
    }
    public void display(){
        for (int i = 0; i < size(); i++) {
            System.out.print((int) (this.getByIndex(i)) + " ");
        }
    }
}

