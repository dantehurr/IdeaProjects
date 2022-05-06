import java.util.ArrayList;

public class Node implements Comparable<Node> {
    String name;
    ArrayList<Edge> neighbors;

    int distance, time, money, pathType;
    Node prev;

    public Node(String name) {
        this.name = name;
        this.neighbors = new ArrayList<Edge>();
        this.distance = Integer.MAX_VALUE;
        this.time = Integer.MAX_VALUE;
        this.money = Integer.MAX_VALUE;
        this.pathType = Integer.MAX_VALUE;
        this.prev = null;
    }

    public void addNeighbor(int distance, int time, int money, Node n) {
        neighbors.add(new Edge(distance, time, money, n));
        n.neighbors.add(new Edge(distance, time, money, this));
    }

    public int compareTo(Node other) {

        if (pathType == 0){
            return Integer.compare(distance, other.distance);
        }
        else if (pathType == 1){
            return Integer.compare(time, other.time);
        }
        else if (pathType == 2){
            return Integer.compare(money, other.money);
        }

        return -1;
    }

}