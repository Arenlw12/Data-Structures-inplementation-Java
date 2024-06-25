package Queues;

public interface Queue<T> {
    int size();

    boolean isEmpty();

    void enqueue(T e);

    T first();

    T dequeue();
}
