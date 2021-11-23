package ProjectWithSolutions.Lab6.Lab63;

public class Node {
    private char value;
    private Node next;
    private Node previous;

    public Node(char value, Node next, Node previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    public Node() {
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
