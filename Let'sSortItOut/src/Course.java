/*
* Create a class called Course which stores a department, course number and course name.
For instance “CS”, 241, “Data Structures and Algorithms”.
* This class must implement comparable to compare it to another Course
so they can be sorted: CS 121 would go before CS 241, however CIS 151 would go before CS 121 because CIS
is earlier in the alphabet than CS. MAT 100 would come after CS 241 because MAT is later in the alphabet than CS.
* This class should also include a ToString method which will return a String in this
example format: CS 241: Data Structures and Algorithms.
 */


public class Course implements Comparable<Course>{

    String type, name, myClass;
    int num;

    Course(String course, int number, String title){

        this.type = course;
        this.num = number;
        this.name = title;

        this.myClass = course + " " + number + " " + title;
    }

    public int compareTo(Course aCourse){


        //return Integer.compare(this.num, aCourse.num);
        //return name.compareTo(aCourse.name);
        return myClass.compareTo(aCourse.myClass);
    }

    public String toString(){

        return myClass; //determines what prints
    }

}