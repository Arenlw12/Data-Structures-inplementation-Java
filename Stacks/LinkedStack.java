package Stacks;
import LinkedLists.LinkedList;
public class LinkedStack<T> implements Stack<T> {

    private final LinkedList<T> list = new LinkedList<>();

    public LinkedStack() {
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(T item) {
        list.addFirst(item);
    }

    @Override
    public T top() {
        return list.first();
    }

    @Override
    public T pop() {
        return list.removeFirst();
    }
}
