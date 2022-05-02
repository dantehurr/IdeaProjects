public class Edge {
    int distance, time, money;
    Node n;

/*    public Edge(int distance, Node n) {
        this.distance = distance;
        this.n = n;
    }*/

    public Edge(int distance, int time, int money, Node n){
        this.distance = distance;
        this.time = time;
        this.money = money;
        this.n = n;
    }
}
