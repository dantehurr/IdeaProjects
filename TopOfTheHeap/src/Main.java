/*
  Your Name:  Dante Hurr
  Pace Email: dh51481n@pace.edu
  Based on your implementation, what is the big O for the following methods: insert(): delete(): isEmpty():
    *-
    *-
    *-
  Based on your implementation, what is the big O for combine() and why?:
    -
  Based on your implementation, what is the big O for purge() and why?:
    -
*/

import java.util.PriorityQueue;

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
        //pq.combine(paceEvent);
        System.out.println("Purging......\n");
        Pizza[] finalList = pq.purge();
        for (Pizza p : finalList) {
            System.out.println(p);
        } }
}
/*
If you run the above example, the output would look like the following:
--- DEBUG ---
100: Super Duper Pizza
25: Chicken Pizza
10: Pepperoni Pizza
5: Mushroom Pizza
100: Super Duper Pizza
--- DEBUG ---
25: Chicken Pizza
5: Mushroom Pizza
10: Pepperoni Pizza
--- DEBUG ---
12: Sausage Pizza
1: Plain Pizza
3: Salad Pizza
25: Chicken Pizza
12: Sausage Pizza
10: Pepperoni Pizza
5: Mushroom Pizza
3: Salad Pizza
1: Plain Pizza
 */