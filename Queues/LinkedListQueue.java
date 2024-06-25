package Queues;

import LinkedLists.LinkedList;

public class LinkedListQueue<T> implements Queue<T> {
    private final LinkedList<T> data = new LinkedList<>();

    public int size() {
        return data.size();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public void enqueue(T e) {
        data.addLast(e);
    }

    public T first() {
        return data.first();
    }

    public T dequeue() {
        return data.removeFirst();
    }
}
