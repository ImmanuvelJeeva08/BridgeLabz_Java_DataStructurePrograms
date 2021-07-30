package Calender;

public class StackImpl<T extends Comparable<T>> {
    private class Node {
        T data;
        Node link;
    }

    Node top;
    int count = 0;

    StackImpl() {
        this.top = null;
    }

    public void push(T x) {
        Node temp = new Node();
        if (temp == null) {
            System.out.println("Stack Overflow");
            return;
        }
        temp.data = x;
        temp.link = top;
        top = temp;
    }

    public void display() {
        if (top == null) {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        else {
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.link;
                count++;
                if(count == 7) {
                    count = 0;
                    System.out.println();
                }
            }
        }
    }
}

