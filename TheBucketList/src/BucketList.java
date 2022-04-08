import java.util.ArrayList;

public class BucketList {

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

    public void print(){
//PRINT ARRAY LIST
        int i = 0;
        while(list != null && i < list.size()){
            System.out.println(list.get(i));
            i++;
        }
    }


}
