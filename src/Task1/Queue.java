package Task1;

import java.util.Iterator;

public class Queue implements Iterable {
    Node front;
    Node rear;
    int Size;

    Queue() {
        front = rear = null;
        Size = 0;
    }

    boolean isEmpty() {
        return (front == null);
    }

    int size() {
        return Size;
    }

    void insertFront(int data) {
        Node newNode = new Node(data);

        if (newNode == null)
            System.out.print("OverFlow\n");
        else {

            if (front == null)
                rear = front = newNode;

            else {
                newNode.next = front;
                front.previous = newNode;
                front = newNode;
            }

            Size++;
        }
    }

    void insertRear(int data) {
        Node newNode = new Node(data);

        if (newNode == null)
            System.out.print("OverFlow\n");
        else {
            if (rear == null)
                front = rear = newNode;

            else {
                newNode.previous = rear;
                rear.next = newNode;
                rear = newNode;
            }
            Size++;
        }
    }

    void deleteFront() {

        if (isEmpty())
            System.out.print("UnderFlow\n");

        else {
            Node temp = front;
            front = front.next;

            if (front == null)
                rear = null;
            else
                front.previous = null;

            Size--;
        }
    }

    void deleteRear() {

        if (isEmpty())
            System.out.print("UnderFlow\n");

        else {
            Node temp = rear;
            rear = rear.previous;

            if (rear == null)
                front = null;
            else
                rear.next = null;

            Size--;
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
        rear = null;
        while (front != null) {
            Node temp = front;
            front = front.next;
        }
        Size = 0;
    }
    public int getDataByIndex(final int index) {
        if (!(index >= 0 && index < Size)) {
            throw new IndexOutOfBoundsException();
        }
        Node x = front;
        for (int i = 0; i < index; i++)
            x = x.next;
        return x.data;
    }
    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }
}

