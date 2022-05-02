import java.util.ArrayList;

public class Node implements Comparable<Node> {
    String name;
    ArrayList<Edge> neighbors;

    int distance, time, money;
    int pathType;
    Node prev;

    public Node(String name) {
        this.name = name;
        this.neighbors = new ArrayList<Edge>();
        this.distance = Integer.MAX_VALUE;
        this.time = Integer.MAX_VALUE;
        this.money = Integer.MAX_VALUE;
        //this.pathType = Integer.MAX_VALUE;
        this.prev = null;
    }

    /*public void addNeighbor(int distance, Node n) {
        neighbors.add(new Edge(distance, n));
        n.neighbors.add(new Edge(distance, this));
    }*/

    public void addNeighbor(int distance, int time, int money, Node n) {
        neighbors.add(new Edge(distance, time, money, n));
        n.neighbors.add(new Edge(distance, time, money, this));
    }

    public int getPathType() {

        this.pathType = Integer.MAX_VALUE;

        return pathType;
    }

/*    public int compareTo(Node other) {

        int i = Integer.compare(time, other.time);
        if (i != 0){
            return i;
        }

        i = Integer.compare(money, other.money);
        if (i != 0){
            return i;
        }

        return Integer.compare(distance, other.distance);
    }*/

    public int compareTo(Node other) { // FIXME: possible case switch?

        if(pathType == 0){
            return Integer.compare(distance, other.distance);
        }
        else if(pathType == 1){
            return Integer.compare(time, other.time);
        }
        else if(pathType == 2){
            return Integer.compare(money, other.money);
        }

        return Integer.compare(distance, other.distance);
    }

}