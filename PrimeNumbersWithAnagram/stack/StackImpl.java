package PrimeNumbersWithAnagram.stack;

public class StackImpl<T extends Comparable<T>> {
    private class Node {
        T data1;
        T data2;
        Node link;
    }

    Node top;

    StackImpl() {
        this.top = null;
    }

    public void push(T x, T y) {
        Node temp = new Node();
        if (temp == null) {
            System.out.println("Stack Overflow");
            return;
        }
        temp.data1 = x;
        temp.data2 = y;
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
                System.out.println(temp.data1 + " " + temp.data2);
                temp = temp.link;
            }
        }
    }
}

