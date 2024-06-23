
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> link = new LinkedList<>();
        link.addFirst(1);
        link.addFirst(2);
        link.addFirst(3);
        link.addFirst(4);
        link.addFirst(5);
        System.out.println(link.size());

        DoublyLinkedList<Integer> dlink = new DoublyLinkedList<>();
        dlink.addLast(1);
        dlink.addFirst(1142);
        dlink.addLast(321);
        dlink.addLast(51);
        dlink.addLast(145);
        dlink.removeFirst();
        dlink.removeLast();
        System.out.println(dlink.first());
        System.out.println(dlink.last());
    }
}