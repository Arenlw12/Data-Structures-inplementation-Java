package LinkedLists;

public class DoublyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public DoublyLinkedList() {
        head = new Node<>(null, null, null);
        tail = new Node<>(null, head, null);
        head.setNext(tail);
    }

    public T first() {
        if (isEmpty())
            return null;
        return head.getNext().getElement();
    }

    public T last() {
        if (isEmpty())
            return null;
        return tail.getPrevious().getElement();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(T element) {
        addBetween(element, head, head.getNext());
    }

    public void addLast(T element) {
        addBetween(element, tail.getPrevious(), tail);
    }

    public T removeFirst() {
        if (isEmpty()) return null;
        return remove(head.getNext());
    }

    public T removeLast() {
        if (isEmpty()) return null;
        return remove(tail.getPrevious());
    }

    private void addBetween(T element, Node<T> predecessor, Node<T> successor) {
        Node<T> newest = new Node<>(element, predecessor, successor);
        predecessor.setNext(newest);
        successor.setPrevious(newest);
        size++;
    }

    private T remove(Node<T> node) {
        Node<T> prev = node.getPrevious();
        Node<T> next = node.getNext();
        prev.setNext(next);
        next.setPrevious(prev);
        size--;
        return node.getElement();
    }

    public static class Node<T> {
        private final T element;
        private Node<T> next;
        private Node<T> previous;

        public Node(T elem, Node<T> previous, Node<T> next) {
            this.element = elem;
            this.previous = previous;
            this.next = next;
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

        public Node<T> getPrevious() {
            return this.previous;
        }

        public void setPrevious(Node<T> previous) {
            this.previous = previous;
        }
    }
}
