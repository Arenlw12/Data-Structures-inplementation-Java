package Queues;

public class ArrayDeque<T> implements Deque<T> {
    private static final int CAPACITY = 10;
    private T[] data;
    private int front;
    private int last;
    private int size;

    public ArrayDeque() {
        data = (T[]) new Object[CAPACITY];
        front = 0;
        last = 0;
        size = 0;
    }
    public ArrayDeque(int capacity) {
        data = (T[]) new Object[capacity];
        front = 0;
        last = 0;
        size = 0;
    }
    public void addFirst(T element) {
        if (size == data.length) {
            throw new IllegalStateException("Deque is full");
        }
        front = (front - 1 + data.length) % data.length;
        data[front] = element;
        size++;
    }

    public void addLast(T element) {
        if (size == data.length) {
            throw new IllegalStateException("Deque is full");
        }
        data[last] = element;
        last = (last + 1) % data.length;
        size++;
    }

    public T removeFirst() {
        if (isEmpty()) {
            return null;
        }
        T element = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        return element;
    }

    public T removeLast() {
        if (isEmpty()) {
            return null;
        }
        last = (last - 1 + data.length) % data.length;
        T element = data[last];
        data[last] = null;
        size--;
        return element;
    }

    public T first() {
        if (isEmpty()) {
            return null;
        }
        return data[front];
    }

    public T last() {
        if (isEmpty()) {
            return null;
        }
        return data[(last - 1 + data.length) % data.length];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}