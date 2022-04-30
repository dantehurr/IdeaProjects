import java.util.ArrayList;

public class Node implements Comparable<Node> {
    String name;
    ArrayList<Edge> neighbors;

    int distance;
    Node prev;

    public Node(String name) {
        this.name = name;
        this.neighbors = new ArrayList<Edge>();
        this.distance = Integer.MAX_VALUE;
        this.prev = null;
    }

    public void addNeighbor(int distance, Node n) {
        neighbors.add(new Edge(distance, n));
        n.neighbors.add(new Edge(distance, this));
    }

    public int compareTo(Node other) {
        return Integer.compare(distance, other.distance);
    }


}