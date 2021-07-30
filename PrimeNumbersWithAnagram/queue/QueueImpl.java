package PrimeNumbersWithAnagram.queue;

public class QueueImpl<T extends Comparable<T>> {
    Node front, rear;

    private class Node {
        T data1;
        T data2;
        Node next;

        public Node(T data1, T data2) {
            this.data1 = data1;
            this.data2 = data2;
            this.next = null;
        }
    }

    public QueueImpl() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(T data1, T data2) {
        Node temp = new Node(data1, data2);
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;
    }

    public void display() {
        if (this.rear == null) {
            System.out.println("Queue Underflow");
            System.exit(1);
        }
        else {
            Node temp = front;
            while (temp != null) {
                System.out.println(temp.data1 + " " + temp.data2);
                temp = temp.next;
            }
        }
    }
}

