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
    Pizza[] list;
    int size = 0;

    public PizzaQueue() {
        list = new Pizza[6];
    }


    public void insert(Pizza p) {
        size++;
        int hole = size;

        if(list.length == size){
            int capacity = size + 5;
            Pizza[] newList = new Pizza[capacity];

            for(int i = 0; i < capacity; ++i){
                newList[i] = list[i + 1];
            }

            Pizza[] list = new Pizza[capacity];

            for(int i = 0; i < capacity; ++i){
                list[i + 1] = newList[i];
            }
        }

        while (true) {
            if (hole == 1) {
                break;
            }
            int parent = hole / 2;

            if (p.compareTo(list[parent]) < 0) {
                break;
            }
            list[hole] = list[parent];
            hole = parent;

        }
        list[hole] = p;
    }

    public boolean isEmpty() {
        if (list.length <= size) {
            return true;
        }
        return false;
    }

    public Pizza delete() {
        if (isEmpty()) {
            return null;
        }

        Pizza result = list[1];
        Pizza temp = list[size];
        size--;

        int hole = 1;

        while (true) {
            int child = hole * 2;
            if (child > size) {
                break;
            }
            if (child == size) {

            }
            else {
                if (child != size) {
                    if (list[child + 1].compareTo(list[child]) > 0) {
                        child = child + 1;
                    }
                }
                if (temp.compareTo(list[child]) > 0) {
                    break;
                }
                else {
                    list[hole] = list[child];
                }
                hole = child;
            }
        }

        list[hole] = temp;
        return result;
    }

        public void debug() {
            if (isEmpty()) {
                System.out.println("There are no current orders!");
            }
            for(int i = 1; i < size + 1; i++){
                System.out.println((list[i].toString()));
            }
        }

        public void combine(PizzaQueue pq){

            if (pq.isEmpty()){
                System.out.println("empty.");
            }

            while(!pq.isEmpty()){
                this.insert(pq.delete()); // FIXME
            }
        }

        public Pizza[] purge(){
            Pizza[] purgeList = new Pizza[size];

            for(int i = 0; i < purgeList.length; i++){
                purgeList[i] = this.delete(); // FIXME
            }
            return purgeList;
        }

}
