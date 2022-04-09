import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BucketList {

    ArrayList list;

    public BucketList(){
        list = new ArrayList();
    }

    public int compare(String obj1, String obj2){

        return obj1.compareToIgnoreCase(obj2);
    }

    public String toString(){

        return list.toString(); //determines what prints
    }


    public void add(String data){
//CALL ARRAYLIST ADD
        list.add(data);
    }

    public void sort(){
//MERGE SORT
        mergeSort(list, 0, list.size() - 1); // FIXME: Stack Overflow
    }

    public void mergeSort(ArrayList list, int start, int end){
        if(start >= end){
            return;
        }

        int mid = start + end / 2;

        mergeSort(list, start, mid); // FIXME: Stack Overflow
        mergeSort(list, mid + 1, end);
        merge(list, start, mid, end);
    }

    public void merge(ArrayList list, int start, int mid, int end){

        ArrayList temp = new ArrayList();

        int i = start;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= end){
            if(compare(list.get(i).toString(), list.get(j).toString()) < 0){
                temp.set(k, list.get(i));
                i++;
                k++;
            }
            else{
                temp.set(k, list.get(j));
                j++;
                k++;
            }
        }
        while(i <= mid){
            temp.set(k, list.get(i));
            i++;
            k++;
        }
        while(j <= end){
            temp.set(k, list.get(j));
            j++;
            k++;
        }

        for(int p = 0; i < temp.size(); p++){
            list.set(p + start, temp.get(p));
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
