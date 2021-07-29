package BankingCashCounter;

public class QueueImpl<T extends Comparable<T>> {
    int front, rear;
    int count, capacity;
    T[] array;

    public QueueImpl(int size) {
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
        System.out.println("Inserting in the queue Account Number " + item);
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

    public void dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is underflowing!");
            System.exit(1);
        }
        System.out.println("Removing from the queue Account number " +array[front]);
        front = (front + 1);
        count--;
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


