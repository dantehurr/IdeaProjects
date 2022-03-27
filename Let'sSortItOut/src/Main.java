
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

        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(a.get(j).compareTo(a.get(j + 1)) == 1){ //FIXME: try using 0 if this doesn't work
                    Collections.swap(a, j, j + 1);
                }
            }
        }
/*
+++++++++Simple Bubble Sort+++++++++

void bubbleSort(int arr[]){

        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1]){
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
 */

    }
    public static void insertionSort(ArrayList<Course> a){
/*
Write a method called insertionSort that takes an ArrayList<Course> and performs the insertion sort. You may refer to the book, your notes or this Wikipedia article: https://en.wikipedia.org/wiki/Insertion_sort
 */

        int j;

        for(int n = 1; n < a.size(); n++){
            Course temp = a.get(n);
            for(j = n; j > 0 && temp.compareTo(a.get(j -1)) < 0; j--){
                Collections.swap(a, j, j + 1);
            }
            Collections.swap(a, j, n);
        }

        /*
        +++++++++Simple Insertion Sort+++++++++
        @param a an array of Comparable items.

        public static <AnyType extends Comparable<? super AnyType>> void insertionSort(AnyType [] a){
            int j;
            for(int p = 1; p < a.length; p++){
                AnyType tmp = a[p];
                for(j = p; j > 0 && tmp.compareTo(a[j - 1]) < 0; j--){
                    a[j] = a[j - 1];
                }
            a[j] =  tmp;
            }
        }
         */
    }
    public static void selectionSort(ArrayList<Course> a){
/*
Write a method called selectionSort that takes an ArrayList<Course> and performs the selection sort. You may refer to the book, your notes or this Wikipedia article: https://en.wikipedia.org/wiki/Selection_sort
 */
/*
+++++++++Simple Selection Sort+++++++++
void sort(int arr[]){
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++){
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
 */
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

        Collections.sort(list);

        System.out.println("Alpha Sort:");
        print(list);

        System.out.println("Bubble Sort:");
        bubbleSort(list); //FIXME: not sorting
        print(list);

        System.out.println("Insertion Sort:");
        insertionSort(list); //FIXME: not sorting
        print(list);


    }
}
