/*Dante Hurr
dh51481n@pace.edu*/

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args){

        Node MONH = new Node("Museum of Natural History");
        Node TM = new Node("The Met");
        Node TS = new Node("Times Square");
        Node GCS = new Node("Grand Central Station");
        Node CB = new Node("Chrysler Building");
        Node PS = new Node("Penn Station");
        Node ESB = new Node("Empire State Building");
        Node FB = new Node("Flatiron Building");
        Node OPP = new Node("One Pace Plaza");
        Node BB = new Node("Brooklyn Bridge");
        Node WS = new Node("163 William Street");

        MONH.addNeighbor(8, 20, 8, TS);
        TM.addNeighbor(10, 30, 10, GCS);
        TS.addNeighbor(2, 2, 2, GCS);
        TS.addNeighbor(1,4,2, PS);
        TS.addNeighbor(1,4,2, ESB);
        PS.addNeighbor(1,3,1, ESB);
        ESB.addNeighbor(2,3,2, FB);
        FB.addNeighbor(3,5,3, WS);
        GCS.addNeighbor(1,1,1, CB);
        GCS.addNeighbor(7,5,2, OPP);
        OPP.addNeighbor(1,1,1, BB);
        OPP.addNeighbor(1,1,1, WS);
        BB.addNeighbor(1,2,1, WS);

        System.out.println("Distance:");
        path(WS, TS, 0);
        System.out.println("--------------------------");
        System.out.println("Speed:");
        path(WS, TS, 1);
        System.out.println("--------------------------");
        System.out.println("Money:");
        path(WS, TS, 2);
    }

    public static void path(Node start, Node end, int pathType){

        if(pathType == 0){
            distance(start, end);
        }
        else if(pathType == 1){
            speed(start, end);
        }
        else if(pathType == 2){
            money(start, end);
        }
        else{
            System.out.println("Path Type could not be determined.");
        }
    }

    public static void distance(Node start, Node end){

        PriorityQueue<Node> dis = new PriorityQueue<Node>();

        start.distance = 0;
        dis.add(start);

        // While nodes to explore
        while (!dis.isEmpty()) {
            Node current = dis.poll(); // Remove node
            if (current == end) break;

            for (Edge e : current.neighbors) {
                // My distance so far + the edge
                int tempDistance = current.distance + e.distance;
                Node n = e.n;
                // If this distance is longer than what we found already, don't bother
                if (tempDistance > n.distance) continue;

                n.distance = tempDistance;
                n.prev = current;

                dis.remove(n);
                dis.add(n);
            }
        }

        printPath(end);

    }

    public static void speed(Node start, Node end){

        PriorityQueue<Node> spd = new PriorityQueue<Node>();

        start.time = 0;
        spd.add(start);

        // While nodes to explore
        while (!spd.isEmpty()) {
            Node current = spd.poll(); // Remove node
            if (current == end) break;

            for (Edge e : current.neighbors) {
                // My speed so far + the edge
                int tempTime = current.time + e.time;
                Node n = e.n;
                // If this takes longer than what we found already, don't bother
                if (tempTime > n.time) continue;

                n.time = tempTime;
                n.prev = current;

                spd.remove(n);
                spd.add(n);
            }
        }

        printPath(end);

    }

    public static void money(Node start, Node end){

        PriorityQueue<Node> mny = new PriorityQueue<Node>();

        start.money = 0;
        mny.add(start);

        // While nodes to explore
        while (!mny.isEmpty()) {
            Node current = mny.poll(); // Remove node
            if (current == end) break;

            for (Edge e : current.neighbors) {
                // My cost so far + the edge
                int tempMoney = current.money + e.money;
                Node n = e.n;
                // If this costs more than what we found already, don't bother
                if (tempMoney > n.money) continue;

                n.money = tempMoney;
                n.prev = current;

                mny.remove(n);
                mny.add(n);
            }
        }

        printPath(end);

    }

    public static void printPath(Node n) {
        if (n == null) return;
        printPath(n.prev);
        System.out.println(n.name);
    }
}
