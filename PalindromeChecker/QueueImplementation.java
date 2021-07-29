package PalindromeChecker;

import java.util.ArrayList;

public class QueueImplementation<T extends Comparable<T>> {
    ArrayList<T> arrayList = new ArrayList<>();
    int front, rear;
    int count, capacity;
    T[] array;

    public QueueImplementation(int size) {
        array = (T[]) new Comparable[size];
        this.front = 0;
        this.rear = -1;
        this.count = 0;
        this.capacity = size;
    }

    public void enqueue(T item) {
        if(isFull()) {
            System.out.println("Queue is overflowing!");
            System.exit(1);
        }
        System.out.println("Inserting in the queue " + item);
        rear = (rear + 1) ;
        array[rear] = item;
        count++;
    }

    public T peek() {
        if(isEmpty()) {
            System.out.println("Queue is underflowing!");
            System.exit(1);
        }
        return array[front];
    }

    public ArrayList<T> dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is underflowing!");
            System.exit(1);
        }
        System.out.println("Removing " +array[front]);
        arrayList.add(array[front]);
        front = (front + 1) ;
        count--;

        return arrayList;
    }

    public int size() {
        return count;
    }

    public Boolean isEmpty() {
        return (size() == 0);
    }

    public Boolean isFull() {
        return (size() == capacity);
    }
}

