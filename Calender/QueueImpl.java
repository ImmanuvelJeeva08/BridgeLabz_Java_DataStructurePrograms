package Calender;

public class QueueImpl<T extends Comparable<T>> {
    Node front, rear;

    private class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public QueueImpl() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(T data) {
        Node temp = new Node(data);
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;
    }

    public void display() {
        int count = 0;
        if (this.rear == null) {
            System.out.println("Queue Underflow");
            System.exit(1);
        }
        else {
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
                count++;
                if(count == 7) {
                    count = 0;
                    System.out.println();
                }
            }
        }
    }
}

