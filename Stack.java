public interface Stack<T> {
    int size();

    boolean isEmpty();

    void push(T item);

    T top();

    T pop();
}