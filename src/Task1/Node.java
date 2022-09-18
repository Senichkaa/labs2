package Task1;

public class Node {
    public int data;
    public Node next;
    public Node previous;

    public Node(final int data) {
        this.data = data;
        this.previous = this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(final int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(final Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(final Node previous) {
        this.previous = previous;
    }
}

