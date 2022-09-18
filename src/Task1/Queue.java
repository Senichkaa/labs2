package Task1;

import java.util.Iterator;

public class Queue implements Iterable<Integer> {
    private Node front;
    private Node rear;
    private int size;

    Queue() {
        front = rear = null;
        size = 0;
    }

    boolean isEmpty() {
        return (front == null);
    }

    int size() {
        return size;
    }

    void insertFront(final int data) {
       final Node newNode = new Node(data);
            if (front == null) {
                rear = front = newNode;
            }
            else {
                newNode.next = front;
                front.previous = newNode;
                front = newNode;
            }
            size++;
    }

    void insertRear(final int data) {
       final Node newNode = new Node(data);
            if (rear == null)
                front = rear = newNode;
            else {
                newNode.previous = rear;
                rear.next = newNode;
                rear = newNode;
            }
            size++;
        }

    void deleteFront() {

        if (isEmpty())
            System.out.print("UnderFlow\n");

        else {
          final Node temp = front;
            front = front.next;

            if (front == null)
                rear = null;
            else
                front.previous = null;

            size--;
        }
    }

    void deleteRear() {

        if (isEmpty())
            System.out.print("UnderFlow\n");

        else {
           final Node temp = rear;
            rear = rear.previous;

            if (rear == null)
                front = null;
            else
                rear.next = null;

            size--;
        }
    }

    int getFront() {

        if (isEmpty())
            return -1;
        return front.data;
    }

    int getRear() {

        if (isEmpty())
            return -1;
        return rear.data;
    }
    void erase() {
        front = rear = null;
        size = 0;
    }

    public int getDataByIndex(final int index) {
        if (!(index >= 0 && index < size)) {
            throw new IndexOutOfBoundsException();
        }
        Node x = front;
        for (int i = 0; i < index; i++)
            x = x.next;
        return x.data;
    }
    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator(this);
    }
}

