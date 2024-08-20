package PositionalList;

public class LinkedPositionList<T> implements PositionalLists<T> {
    private final Node<T> header;
    private final Node<T> trailer;
    private int size = 0;

    public LinkedPositionList() {
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
    }

    private Node<T> validate(Position<T> p) throws IllegalArgumentException {
        if (!(p instanceof Node<T> node)) throw new IllegalArgumentException("Invalid p");
        if (node.getNext() == null)
            throw new IllegalArgumentException("p is no longer in the list");
        return node;
    }

    private Position<T> position(Node<T> node) {
        if (node == header || node == trailer)
            return null;
        return node;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Position<T> first() {
        return position(header.getNext());
    }

    @Override
    public Position<T> last() {
        return position(trailer.getPrev());
    }

    @Override
    public Position<T> before(Position<T> p) throws IllegalArgumentException {
        Node<T> node = validate(p);
        return position(node.getPrev());
    }

    @Override
    public Position<T> after(Position<T> p) throws IllegalArgumentException {
        Node<T> node = validate(p);
        return position(node.getNext());
    }

    private Position<T> addBetween(T e, Node<T> predecessor, Node<T> successor) {
        Node<T> newest = new Node<>(e, predecessor, successor);
        predecessor.setNext(newest);
        successor.setPrev(newest);
        size++;
        return newest;
    }

    @Override
    public Position<T> addFirst(T e) {
        return addBetween(e, header, header.getNext());
    }

    @Override
    public Position<T> addLast(T e) {
        return addBetween(e, trailer.getPrev(), trailer);
    }

    @Override
    public Position<T> addBefore(Position<T> p, T e) throws IllegalArgumentException {
        Node<T> node = validate(p);
        return addBetween(e, node.getPrev(), node);
    }

    @Override
    public Position<T> addAfter(Position<T> p, T e) throws IllegalArgumentException {
        Node<T> node = validate(p);
        return addBetween(e, node, node.getNext());
    }

    @Override
    public T set(Position<T> p, T e) throws IllegalArgumentException {
        Node<T> node = validate(p);
        T answer = node.getElement();
        node.setElement(e);
        return answer;
    }

    @Override
    public T remove(Position<T> p) throws IllegalArgumentException {
        Node<T> node = validate(p);
        Node<T> predecessor = node.getPrev();
        Node<T> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;
        T answer = node.getElement();
        node.setElement(null);
        node.setNext(null);
        node.setPrev(null);
        return answer;
    }


    public static class Node<T> implements Position<T> {
        private T element;
        private Node<T> next;
        private Node<T> previous;

        public Node(T elem, Node<T> previous, Node<T> next) {
            this.element = elem;
            this.previous = previous;
            this.next = next;
        }

        public T getElement() throws IllegalStateException {
            if (next == null)
                throw new IllegalStateException("Position no longer valid");
            return element;
        }

        public void setElement(T e) {
            this.element = e;
        }

        public Node<T> getPrev() {
            return previous;
        }

        public void setPrev(Node<T> p) {
            this.previous = p;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> n) {
            this.next = n;
        }
    }
}
