import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class BucketList implements Comparator{

    ArrayList list;

    public BucketList(){
        list = new ArrayList();


    }

    public int compare(String obj1, String obj2){

        return obj1.compareToIgnoreCase(obj2);
    }




    public void add(String data){
//CALL ARRAYLIST ADD
        list.add(data);
    }

    public void sort(){
//MERGE SORT
        mergeSort(list, 0, list.size());
    }

    public static void mergeSort(ArrayList list, int start, int end){
        if(start > end){
            return;
        }

        int mid = start + end / 2;

        mergeSort(list, start, mid);
        mergeSort(list, mid + 1, end);
        merge(list, start, mid, end);
    }

    public static void merge(ArrayList list, int start, int mid, int end){

        ArrayList temp = new ArrayList();

        int i = start;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= end){
            if(list.get(i).compare(list.get(i), list.get(j)) < 0){ //FIXME: I want to implement Comparable to use here but not sure
                temp.get(k) = list.get(i);//FIXME: all of these variable assignments need to be fixed(46, 51, 57, 62, 68)
                i++;
                k++;
            }
            else{
                temp.get(k) = list.get(j);
                j++;
                k++;
            }
        }
        while(i <= mid){
            temp.get(k) = list.get(i);
            i++;
            k++;
        }
        while(j <= end){
            temp.get(k) = list.get(j);
            j++;
            k++;
        }

        for(int p = 0; i < temp.size(); p++){
            list.get(p + start) = temp.get(p);
        }
    }

    public void print(){
//PRINT ARRAY LIST
        int i = 0;
        while(list != null && i < list.size()){
            System.out.println(list.get(i));
            i++;
        }
    }


}
