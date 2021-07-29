package SimpleBalancedParentheses;

import java.util.ArrayList;

public class StackImplementation<T extends Comparable<T>> {
    ArrayList<T> arrayList = new ArrayList<>();
    T[] elements;
    int top;
    int capacity;

    public StackImplementation(int size) {
        elements = (T[]) new Comparable[size];
        this.top = -1;
        this.capacity = size;
    }

    public ArrayList<T> push(T x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
        System.out.println("Inserting in Stack " + x);
        elements[++top] = x;
        arrayList.add(elements[top]);

        return arrayList;
    }

    public void pop(ArrayList<T> arrayList) {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            System.exit(1);
        }
        System.out.println();
        for(int k = arrayList.size() - 1; k >= 0; k--) {
            System.out.println("Removing from Stack " + elements[top--]);
            arrayList.remove(k);
        }
        System.out.println();
    }

    public int size() {
        return top + 1;
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public Boolean isFull() {
        return top == capacity - 1;
    }
}

