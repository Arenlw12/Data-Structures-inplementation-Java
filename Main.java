
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> link = new LinkedList<>();
        link.addFirst(1);
        link.addFirst(2);
        link.addFirst(3);
        link.addFirst(4);
        link.addFirst(5);
        System.out.println(link.size());
        for (int i = 0; i < link.size();  i++){
            System.out.println(link.last());
        }
    }
}