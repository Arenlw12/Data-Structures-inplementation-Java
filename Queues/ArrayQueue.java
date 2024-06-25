package Queues;

public class ArrayQueue<T> implements Queue<T> {
    private final T[] data;
    private int front;
    private int size;

    public ArrayQueue(int capacity) {
        data = (T[]) new Object[capacity];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void enqueue(T e) throws IllegalStateException {
        if (size == data.length)
            throw new IllegalStateException("Queue is full!");
        int available = (front + size) % data.length;
        data[available] = e;
        size++;
    }

    public T first() {
        if (isEmpty())
            return null;
        return data[front];
    }

    public T dequeue() {
        if (isEmpty())
            return null;
        T output = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        return output;
    }
}
