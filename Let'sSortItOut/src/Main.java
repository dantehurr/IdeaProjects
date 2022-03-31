
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
/*    int i = 1;
            while(i < a.size() - 1){
                Course x = a.get(i);
                int j = i - 1;
                while(j >= 0 && a.get(j).compareTo(x) > 0){
                    Collections.swap(a, j, j + 1);
                    j--;
                }
                Collections.swap(a, j + 1, i);
                i++;
            }
    }*/
        int j;

        for(int n = 1; n < a.size() - 1; n++) {
            for (j = n; j > 0 && a.get(j + 1).compareTo(a.get(j)) < 0; j--) {//FIXME: //0 = equal, -1 = less, 1 = more
                for (j = n; j > 0 && a.get(n).compareTo(a.get(j + 1)) < 0; j--) {//FIXME: //0 = equal, -1 = less, 1 = more
                    Collections.swap(a, j, j + 1);
                }
                Collections.swap(a, j, n);
            }
        }

/*    int i = 1;

        while(i < a.size() - 1){
        Course x = a.get(i);
        int j = i + 1;
        while(j >= 0 && a.get(j).compareTo(x) > 0 && j < a.size() - 1){
            System.out.println("Comparing: "+ a.get(j) + " vs. " + x + "\n");
            Collections.swap(a,j + 1, j);
            print(a);
            System.out.println("------------------------------------------");
            j++;
        }
        Course c = a.get(j + 1);
        System.out.println("Swapping: " + a.get(j + 1) + " && " + a.get(i) + "\n");
        Collections.swap(a, j + 1, i);
        print(a);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        //c = x;
        i++;
    }*/
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

        ArrayList<Course> list = new ArrayList<Course>();

        Course c1 = new Course("CS", 241, "Data Structures and Algorithms");
        Course c2 = new Course("ART", 240, "Sculpture I");
        Course c3 = new Course("CS", 232, "Computer Organization");
        Course c4 = new Course("ENG", 120, "Critical Writing");
        Course c5 = new Course("ART", 122, "Painting I");
        Course c6 = new Course("CS", 271, "Fundamentals of UNIX and C Programming");

        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);
        list.add(c6);

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
