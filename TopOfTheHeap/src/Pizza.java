/*
*   Create a class called Pizza which stores someone’s order for the pizza place.
*   Each order has a priority and a description. For instance: 10 and “Pepperoni Pizza”.
*   This class should have a ToString method which returns something such as: “10: Pepperoni Pizza”.
*   This class should also implement comparable with a compareTo function.
 */
public class Pizza implements Comparable<Pizza>{

    public String desc, myPizza;
    public int priority;

    Pizza(int priority, String desc){

        this.desc = desc;
        this.priority = priority;

        //this.myPizza = priority + ": " + desc;

    }

    public int compareTo(Pizza aPizza){

        if(this.priority < aPizza.priority){
            return -1;
        }
        return 1;
    }

    public String toString(){

        //return myPizza; //determines what prints
        return "[" + priority + "] " + desc;
    }

}