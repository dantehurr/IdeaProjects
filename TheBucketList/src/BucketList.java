import java.util.ArrayList;

public class BucketList {

    ArrayList<String> list;

    public BucketList(){
        list = new ArrayList<String>();
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
        mergeSort(list, 0, list.size() - 1);
    }

    public void mergeSort(ArrayList<String> list, int start, int end){
        if(start >= end){
            return;
        }

        int mid = start + end / 2;

        mergeSort(list, start, mid);
        mergeSort(list, mid + 1, end);
        merge(list, start, mid, end);
    }

    public void merge(ArrayList<String> list, int start, int mid, int end){

        ArrayList<String> temp = new ArrayList<String>();

        int i = start;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= end){
            if(list.get(i).compareToIgnoreCase(list.get(j)) < 0){
                temp.add(list.get(i));
                i++;
                k++;
            }
            else{
                temp.add(list.get(j));
                j++;
                k++;
            }
        }
        while(i <= mid){
            temp.add(list.get(i));
            i++;
            k++;
        }
        while(j <= end){
            temp.add(list.get(j));
            j++;
            k++;
        }

        for(int p = 0; p < temp.size(); p++){
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
