import Graphs.Graph;
import LinkedLists.DoublyLinkedList;
import LinkedLists.LinkedList;
import PositionalList.LinkedPositionList;
import PositionalList.Position;
import Queues.ArrayDeque;
import Queues.ArrayQueue;
import Stacks.ArrayStack;
import Stacks.LinkedStack;
import Trees.BinarySearchTree;
import Trees.Heap.MaxHeap;

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

       //The test of Graphs
        System.out.println("__________________________________________________________________\n");
        Graph<String> graph = new Graph<>();
        graph.addEdge("A", "B", true);
        graph.addEdge("B", "D", true);
        graph.addEdge("C", "V", true);
        graph.addEdge("C", "G", true);
        System.out.println("Graph:\n" + graph.toString());
        graph.getVertexCount();
        graph.getEdgesCount(true);
        graph.hasEdge("C", "D");
        graph.hasVertex("F");
        graph.neighbours("C");

        //The test of Binary Search Tree
        System.out.println("__________________________________________________________________\n");
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = tree.insert(tree.root,10);
        tree.insert(tree.root,20);
        tree.insert(tree.root,0);
        tree.insert(tree.root,5);
        tree.insert(tree.root,12);

        int key = 5;

        if (tree.search(tree.root, key) == null)
            System.out.println(key + " not found!");
        else
            System.out.println(key + " found!");

        key = 0;

        if (tree.search(tree.root, key) == null)
            System.out.println(key + " not found!");
        else
            System.out.println(key + " found!");

        //The test of Maximum Heap
        System.out.println("__________________________________________________________________\n");
        MaxHeap maxHeap = new MaxHeap(11);

        maxHeap.insert(1);
        maxHeap.insert(10);
        maxHeap.insert(12);
        maxHeap.insert(21);
        maxHeap.insert(41);
        maxHeap.insert(100);
        maxHeap.insert(11);

        maxHeap.print();

        //The test of Array Deque
        System.out.println("__________________________________________________________________\n");
        ArrayDeque<Integer> arrayDeque= new ArrayDeque<Integer>(5);
        arrayDeque.addFirst(10);
        arrayDeque.addFirst(123);
        arrayDeque.addFirst(5);
        arrayDeque.addLast(1);
        System.out.println(arrayDeque.first());
        System.out.println(arrayDeque.last());

        arrayDeque.removeFirst();
        arrayDeque.removeLast();
        System.out.println("\n" + arrayDeque.first());
        System.out.println(arrayDeque.last());

        //The test of Linked Position List
        System.out.println("__________________________________________________________________\n");
        LinkedPositionList<String> linkedPositionList = new LinkedPositionList<String>();
        Position<String> p1 = linkedPositionList.addFirst("A");
        Position<String> p2 = linkedPositionList.addLast("B");
        Position<String> p3 = linkedPositionList.addAfter(p1, "C");
        System.out.println(linkedPositionList.first().getElement());
        System.out.println(linkedPositionList.after(p1).getElement());
        linkedPositionList.remove(p3);
        System.out.println(linkedPositionList.last().getElement());
        Position<String> p4 = linkedPositionList.addLast("D");
        System.out.println(linkedPositionList.before(linkedPositionList.last()).getElement());
        System.out.println(linkedPositionList.set(p1,"ABC"));
        System.out.println(linkedPositionList.first().getElement());
    }
}