public class LinkedList<T> {
    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;

    public T first() {
        if (isEmpty())
            return null;
        return head.getElement();
    }

    public T last() {
        if (isEmpty())
            return null;
        return tail.getElement();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(T element) {
        head = new Node<>(element, head);
        if (size == 0) {
            tail = head;
        }
        size++;
    }

    public void addLast(T element) {
        Node<T> newest = new Node<>(element, null);
        if (isEmpty()) {
            head = newest;
        } else {
            tail.setNext(newest);
        }
        tail = newest;
        size++;
    }

    public T removeFirst() {
        if (isEmpty()) return null;
        T output = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0)
            tail = null;
        return output;
    }

    public static class Node<T> {
        private final T element;
        private Node<T> next;

        public Node(T elem, Node<T> nex) {
            this.element = elem;
            this.next = nex;
        }

        public T getElement() {
            return this.element;
        }

        public Node<T> getNext() {
            return this.next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
}
