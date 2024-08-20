package Graphs;
import java.util.*;

public class Graph<T> {
    private Map<T, List<T> > map = new HashMap<>();

    public void addVertex(T vertex) {
        map.put(vertex, new LinkedList<T>());
    }

    public void addEdge(T source, T destination, boolean bidirectional) {

        if (!map.containsKey(source))
            addVertex(source);

        if (!map.containsKey(destination))
            addVertex(destination);

        map.get(source).add(destination);
        if (bidirectional)
            map.get(destination).add(source);
    }

    public void getVertexCount() {
        System.out.println("The graph has " + map.keySet().size() + " vertex");
    }

    public void getEdgesCount(boolean bidirection) {
        int count = 0;
        for (T v : map.keySet())
            count += map.get(v).size();

        if (bidirection)
            count = count / 2;

        System.out.println("The graph has " + count + " edges.");
    }
    public void hasVertex(T v) {
        if (map.containsKey(v))
            System.out.println("The graph contains " + v);
        else
            System.out.println("The graph does not contain " + v);
    }
    public void hasEdge(T v1, T v2) {
        if (map.get(v1).contains(v2))
            System.out.println("The graph has an edge between " + v1 + " and " + v2 + ".");
        else
            System.out.println("The graph has no edge between " + v1 + " and " + v2 + ".");
    }
    public void neighbours(T v) {
        if(!map.containsKey(v))
            return;
        System.out.println("The neighbours of " + v + " are");
        for(T w : map.get(v))
            System.out.print(w + ",");
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (T v : map.keySet()) {
            builder.append(v.toString() + ": ");
            for (T w : map.get(v)) {
                builder.append(w.toString() + " ");
            }
            builder.append("\n");
        }

        return (builder.toString());
    }
}
