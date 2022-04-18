/*
*   Create a class called Pizza which stores someone’s order for the pizza place.
*   Each order has a priority and a description. For instance: 10 and “Pepperoni Pizza”.
*   This class should have a ToString method which returns something such as: “10: Pepperoni Pizza”.
*   This class should also implement comparable with a compareTo function.
 */
public class Pizza implements Comparable<Pizza>{

    String type, myPizza;
    int number;

    Pizza(int priority, String desc){

        this.type = desc;
        this.number = priority;

        this.myPizza = priority + ": " + desc;
    }

    public int compareTo(Pizza aPizza){

        return myPizza.compareTo(aPizza.myPizza);
    }

    public String toString(){

        return myPizza; //determines what prints
    }

}