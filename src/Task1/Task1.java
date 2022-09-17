package Task1;

public class Task1 {
    public static void main(String[] args) {
        Queue dq = new Queue();

        dq.insertRear(2);
        dq.insertRear(3);
        dq.insertRear(4);
        dq.insertRear(5);
        dq.insertRear(6);

        System.out.print("Rear element: " + dq.getRear() + "\n");
        dq.deleteRear();
        System.out.print("Delete rear element" + "\n");
        System.out.print("New rear element after deleting:" + dq.getRear() + "\n");

        dq.insertFront(1);
        System.out.print("Front element: " + dq.getFront() + "\n");
        System.out.print("Number of elements in queue: " + dq.size() + "\n");

        dq.deleteFront();
        System.out.print("Delete front element " + "\n");
        System.out.print("New front element after deleting: " + dq.getFront() + "\n");
    }
}
