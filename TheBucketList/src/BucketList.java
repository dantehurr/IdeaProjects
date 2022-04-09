import java.util.ArrayList;
import java.util.Collections;

public class BucketList{

    ArrayList list;

    public BucketList(){
        list = new ArrayList();


    }
    public void add(String data){
//CALL ARRAYLIST ADD
        list.add(data);
    }

    public void sort(){
//MERGE SORT

    }

    public int compareToIgnoreCase(String data1, String data2){
        int i = 0;
        int size = data1.length();

        char c1 = data1.charAt(i);
        char c2 = data2.charAt(i);
        int b1 = (int)c1;
        int b2 = (int)c2;

        if(b1 < b2){
            return -1;
        }
        else if(b2 > b1){
            return 1;
        }
        else{
            return 0;
        }

    }

    public static void mergeSort(BucketList[] list, int start, int end){
        if(start > end){
            return;
        }

        int mid = start + end / 2;

        mergeSort(list, start, mid);
        mergeSort(list, mid + 1, end);
        merge(list, start, mid, end);
    }

    public static void merge(BucketList[] list, int start, int mid, int end){

        ArrayList temp = new ArrayList();

        int i = start;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= end){
            if(list.get(i).compareToIgnoreCase(list.get(j)) < 0){
                temp.get(k) = list.get(i);
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
