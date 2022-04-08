
/*
  Your Name:  Dante Hurr
  Pace Email: dh51481n@pace.edu

  Bubble Sort:
  What is the worst case big O and what kind of input would cause that?
    -Worst case would be O(n^2) if the list required n * n passes to be in the sorted order.
  What is the best case big O and what kind of input would cause that?
    -Best case would be O(n) if the list was already in the sorted order.

  Insertion Sort:
  What is the worst case big O and what kind of input would cause that?
    -Worse case would be O(n^2) if the algorithm needed to reverse every item before being sorted.
  What is the best case big O and what kind of input would cause that?
    -Best case would still be O(n) because the list could already be in the sorted order.

  Selection Sort:
  What is the worst case big O and what kind of input would cause that?
    -Worst case is also O(n^2) because the only option for this type of sort is to pass over each item 'n'
        once every time the list is iterated through resulting in n * n passes.
  What is the best case big O and what kind of input would cause that?
    -Best case would be O(n^2) to sort the list after only n passes over n items.
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
        int i = 1;
        while(i < a.size()){
            Course x = a.get(i);
            int j = i - 1;
            while(j >= 0 && x.compareTo(a.get(j)) < 0){
                a.set(j + 1, a.get(j));
                j--;
            }
            a.set(j + 1, x);
            i++;
        }
}



    public static void selectionSort(ArrayList<Course> a) {
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

        ArrayList<Course> list1 = new ArrayList<Course>();
        ArrayList<Course> list2 = new ArrayList<Course>();
        ArrayList<Course> list3 = new ArrayList<Course>();

        Course c1 = new Course("CS", 241, "Data Structures and Algorithms");
        Course c2 = new Course("ART", 240, "Sculpture I");
        Course c3 = new Course("CS", 232, "Computer Organization");
        Course c4 = new Course("MAT", 131, "Calculus I");
        Course c5 = new Course("ART", 122, "Painting I");
        Course c6 = new Course("MAT", 234, "Statistics and Probability");
        Course c7 = new Course("BIO", 101, "General Biology I");
        Course c8 = new Course("PHY", 101, "General Physics I");
        Course c9 = new Course("SPA", 101, "Elementary Spanish");
        Course c10 = new Course("ENG", 120, "Critical Writing");
        Course c11 = new Course("MAT", 132, "Calculus II");
        Course c12 = new Course("CS", 271, "Fundamentals of UNIX and C Programming");


        list1.add(c1);
        list2.add(c2);
        list3.add(c3);
        list1.add(c4);
        list2.add(c5);
        list3.add(c6);
        list1.add(c7);
        list2.add(c8);
        list3.add(c9);
        list1.add(c10);
        list2.add(c11);
        list3.add(c12);


        System.out.println("\nAlpha:\n");
        print(list1);

        System.out.println("\nBubble Sort:\n");
        bubbleSort(list1);
        print(list1);

        System.out.println("\nAlpha:\n");
        print(list2);

        System.out.println("\nInsertion Sort:\n");
        insertionSort(list2);
        print(list2);

        System.out.println("\nAlpha:\n");
        print(list3);

        System.out.println("\nSelection Sort:\n");
        selectionSort(list3);
        print(list3);


    }
}
