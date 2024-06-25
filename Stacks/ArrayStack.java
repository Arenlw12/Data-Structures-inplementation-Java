package Stacks;

public class ArrayStack<T> implements Stack<T> {
    private final T[] data;
    private int topElement = -1;

    public ArrayStack(int capacity) {
        data = (T[]) new Object[capacity];
    }

    public int size() {
        return topElement + 1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void push(T item) throws IllegalStateException {
        if (size() == data.length) throw new IllegalStateException("Stacks.Stack is full!");
        data[++topElement] = item;
    }

    public T top() {
        if (isEmpty()) return null;
        return data[topElement];
    }

    public T pop() {
        if (isEmpty()) return null;
        T output = data[topElement];
        data[topElement] = null;
        topElement--;
        return output;
    }
    public static <T> void reverse(T[] array) {
        Stack<T> buffer = new ArrayStack<>(array.length);
        for (int i = 0; i < array.length; i++)
            buffer.push(array[i]);
        for (int i = 0; i < array.length; i++)
            array[i] = buffer.pop();
    }
}
