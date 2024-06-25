import LinkedLists.DoublyLinkedList;
import LinkedLists.LinkedList;
import Queues.ArrayQueue;
import Queues.Queue;
import Stacks.ArrayStack;
import Stacks.LinkedStack;

public class Main {
    public static void main(String[] args) {
        //The test of Singly Linked List
        System.out.println("__________________________________________________________________\n");
        LinkedList<Integer> link = new LinkedList<>();
        link.addFirst(1);
        link.addFirst(2);
        link.addFirst(3);
        link.addFirst(4);
        link.addFirst(5);
        System.out.println(link.size());

        //The test of Doubly Linked List
        System.out.println("__________________________________________________________________\n");
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

        //The test of Array based Stack
        System.out.println("__________________________________________________________________\n");
        ArrayStack<String> arrayStack = new ArrayStack<>(10);
        arrayStack.push("this");
        arrayStack.push("is");
        System.out.println(arrayStack.top());
        arrayStack.push("test");
        System.out.println(arrayStack.pop());
        arrayStack.push("of");
        arrayStack.push("stack");
        for (int i = 0; i < 4; i++) {
            System.out.println(arrayStack.pop());
        }

        //The test of Singly Linked List based Stack
        System.out.println("__________________________________________________________________\n");
        LinkedStack<String> linkedStack = new LinkedStack<>();
        linkedStack.push("this");
        linkedStack.push("is");
        System.out.println(linkedStack.top());
        linkedStack.push("test");
        System.out.println(linkedStack.pop());

        //The test of Array based Queue
        System.out.println("__________________________________________________________________\n");
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>(4);
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);
        arrayQueue.enqueue(4);
        System.out.println(arrayQueue.first());
        arrayQueue.dequeue();
        System.out.println(arrayQueue.first());
    }
}