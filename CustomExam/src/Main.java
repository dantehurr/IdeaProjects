/*
  Your Name:  Dante Hurr
  Pace Email: dh51481n@pace.edu

 Q: Given your implementation, what is the runtime of the sum and count methods and
why?

    A: The runtime of my sum and count methods are both O(1) because the program
    is only handling through one element at a time.

*/
class Main {


    public static void main(String[] args) {

        EventList list = new EventList();

        list.addToFront("paul", 14);
        list.addToFront("kacey", 12);

        list.addToEnd("jacob", 33);//
        list.addToEnd("tyler", 41);//

        System.out.println("List: ");
        list.print();

        System.out.println("\n");

        System.out.println("Count: "+ list.count());

        list.sum();


    }
}