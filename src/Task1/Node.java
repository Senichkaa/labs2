package Task1;

public class Node {
    public int data;
    public Node next;
    public Node previous;

    public Node(int data, Node previous)
    {
        this.data = data;
        this.next = null;
        this.previous = previous;
    }

    public Node(int data) {
        this.data = data;
        this.previous = this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
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

