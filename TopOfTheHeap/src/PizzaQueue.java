/*
Create a class called PizzaQueue that will use a heap. You must use a heap! Also use a regular array internally.
Start with a capacity to have 5 Pizzas. Higher order numbers should go first!

PizzaQueue should have the following methods:

*   Insert puts an order into the PizzaQueue. If your array is full, you’ll need some way to grow the internal array.
public void insert(Pizza p)

*   Delete take the next Order off of the PizzaQueue.
public Pizza delete()

*   isEmpty returns true if the PizzaQueue is empty or false if it is not.
public boolean isEmpty()

*   Debug should print the contents of the internal array. Used for your testing and mine.
public void debug()

PizzaQueue Class Combine (5%)
The other location has a problem and now this one place needs to handle orders from the other location.
*   Create another method inside PizzaQueue which takes a PizzaQueue and adds the orders to this PizzaQueue.
public void combine(PizzaQueue pq)

*   Inside of PizzaQueue, write a method which returns an array of all the orders left for the day.
This array should be the exact size as the number of orders.
For instance, if there are 10 orders left, the size of this array should be 10. Your heap would be empty after using this method.
public Pizza[] purge()
 */
public class PizzaQueue {

    Pizza head;

/*    int[] list;
    int size = 0;

    public PizzaQueue(int capacity){ // CLASS EXAMPLE
        list = new int[capacity];
    }*/

    public PizzaQueue(){
        head = null;
    }

/*    public void insert(int x){ // CLASS EXAMPLE
        size++;
        int hole = size;

        while(true){
            if(hole == 1){
                break;
            }
            int parent = hole / 2;

            if(x > list[parent]){ // MIN HEAP
                break;
            }
            list[hole] = list[parent];
            hole = parent;

        }
        list[hole] = x;
    }*/

    public void insert(Pizza p){
        if(head == null){
            head = p;
            return;
        }

        if(p.priority > head.priority){ // Priority
            p.next = head;
            return;
        }

        Pizza current = head;

        while(current.next != null){
            if(p.priority > current.next.priority){ // Priority
                p.next = current.next;
                current.next = p;
                return;
            }
            current = current.next;
        }
        current.next = p;
    }

    public Pizza delete(){
        if(head == null){
            return null;
        }
        Pizza result = head;
        head = head.next;

        return result;
    }

    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }

    public void debug(){
        if(head == null){
            System.out.println("There are no current orders!");
        }

        Pizza current = head;

        while(current.next != null){
            System.out.println(current.myPizza);
            current = current.next;
        }
    }

    public void combine(PizzaQueue pq){

    }

    public Pizza[] purge(){

    }

}
