package Queues;

public interface Deque<T> {
    int size();
    boolean isEmpty();
    T first();
    T last();
    void addFirst(T t);
    void addLast(T t);
    T removeFirst();
    T removeLast();
}
