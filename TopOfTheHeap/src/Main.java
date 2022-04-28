/*
  Your Name:  Dante Hurr
  Pace Email: dh51481n@pace.edu
  Based on your implementation, what is the big O for the following methods: insert(): delete(): isEmpty():
    *- insert(): O(log n)
    *- delete(): O(log n)
    *- isEmpty(): O(1)
  Based on your implementation, what is the big O for combine() and why?:
    - I did not finish combine, but the way I was writing it, it looks like O(n) because when the list is not empty,
    it is just running and removing from one and into another.
  Based on your implementation, what is the big O for purge() and why?:
    - I did not finish this either but it would have been O(n) because it is going through one list and adding to the
    other simultaneously.
*/
class Main {
    public static void main(String[] args) {
        // These are just some examples, be sure to test everything!
        PizzaQueue pq = new PizzaQueue();
        pq.insert(new Pizza(10, "Pepperoni Pizza"));
        pq.insert(new Pizza(5, "Mushroom Pizza"));
        pq.insert(new Pizza(100, "Super Duper Pizza"));
        pq.insert(new Pizza(25, "Chicken Pizza"));
        System.out.println("Debugging......\n");
        pq.debug();
        System.out.println(pq.delete());
        System.out.println();
        System.out.println("Debugging......\n");
        pq.debug();
        PizzaQueue paceEvent = new PizzaQueue();
        paceEvent.insert(new Pizza(1, "Plain Pizza"));
        paceEvent.insert(new Pizza(12, "Sausage Pizza"));
        paceEvent.insert(new Pizza(3, "Salad Pizza"));
        System.out.println("Debugging......\n");
        paceEvent.debug();
        System.out.println("Combining......\n");
        pq.combine(paceEvent);
        System.out.println("Purging......\n");
        Pizza[] finalList = pq.purge();
        for (Pizza p : finalList) {
            System.out.println(p);
        } }
}