public class BucketManager {

    BucketList[] buckets;

    final int SIZE = 26;

    public BucketManager(){
        buckets = new BucketList[SIZE];

        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new BucketList();
        }
    }
    public void add(String data){
//FWD ADD TO BUCKET
        char c  = data.charAt(0);
        int b = (int)c - 65;

        buckets[b].add(data);
    }
    public void print(){
//CALL ALL BUCKETS AND PRINT
        for(int i = 0; i < SIZE; i++){
            buckets[i].print();
        }
    }
    public void sort(){
//CALL ALL BUCKETS AND SORT
        for(int i = 0; i < SIZE; i++){
            buckets[i].sort();
        }
    }
}
