
/*
  Your Name:  Dante Hurr
  Pace Email: dh51481n@pace.edu

  Bubble Sort:
  What is the worst case big O and what kind of input would cause that?
  What is the best case big O and what kind of input would cause that?

  Insertion Sort:
  What is the worst case big O and what kind of input would cause that?
  What is the best case big O and what kind of input would cause that?

  Selection Sort:
  What is the worst case big O and what kind of input would cause that?
  What is the best case big O and what kind of input would cause that?
*/

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void print(ArrayList<Course> a){
/*
Inside of Main.java, write a method called print that takes an ArrayList<Course> and prints the list.
This will come in handy in your testing.
For instance, you can test if your comparable works by using Collections.sort and then printing the result.
 */
        for(Course c : a){

        System.out.println(c);

        }
    }
    public static void bubbleSort(ArrayList<Course> a){
/*
Write a method called bubbleSort that takes an ArrayList<Course> and performs the bubble sort.
You may refer to the book, your notes or this Wikipedia article: https://en.wikipedia.org/wiki/Bubble_sort
 */

        int n = a.size();

        for(int i = 0; i < n - 1; i++){ //loop through the list
            for(int j = 0; j < n - i - 1; j++){ //keep track of the placement
                if(a.get(j).compareTo(a.get(j + 1)) > 0){ //FIXME: //0 = equal, -1 = less, 1 = more
                    Collections.swap(a, j, j + 1);
                }
            }
        }
    }

    public static void insertionSort(ArrayList<Course> a){
/*
Write a method called insertionSort that takes an ArrayList<Course> and performs the insertion sort. You may refer to the book, your notes or this Wikipedia article: https://en.wikipedia.org/wiki/Insertion_sort
 */

        int j;

        for(int n = 1; n < a.size() - 1; n++){
            for(j = n; j > 0 && a.get(n).compareTo(a.get(j + 1)) < 0; j--){//FIXME: //0 = equal, -1 = less, 1 = more
                Collections.swap(a, j, j + 1);
            }
            Collections.swap(a, j, n);
        }
    }

    public static void selectionSort(ArrayList<Course> a){
/*
Write a method called selectionSort that takes an ArrayList<Course> and performs the selection sort. You may refer to the book, your notes or this Wikipedia article: https://en.wikipedia.org/wiki/Selection_sort
 */

        int n = a.size();

        for(int i = 0; i < n - 1; i++){
            int minIndex = i;

            for(int j = i + 1; j < n; j++){
                if(a.get(j).compareTo(a.get(minIndex)) < 0){//FIXME: //0 = equal, -1 = less, 1 = more
                    minIndex = j;
                }
            }

            Collections.swap(a, minIndex, i);
        }
    }

    public static void main(String[] args) {

        ArrayList<Course> list = new ArrayList<Course>();

        Course c1 = new Course("CS", 241, "Data Structures and Algorithms");
        Course c2 = new Course("CS", 232, "Computer Organization");
        Course c3 = new Course("ENG", 120, "Critical Writing");
        Course c4 = new Course("CS", 271, "Fundamentals of UNIX and C Programming");

        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);

        System.out.println("\nAlpha:\n");
        print(list);

        /*System.out.println("\nBubble Sort:\n");
        bubbleSort(list);
        print(list);*/

        System.out.println("\nInsertion Sort:\n");
        insertionSort(list);
        print(list);

        /*System.out.println("\nSelection Sort:\n");
        selectionSort(list);
        print(list);*/


    }
}
