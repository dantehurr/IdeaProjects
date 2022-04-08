/*
  Your Name:  Dante Hurr
  Pace Email: dh51481n@pace.edu

Merge Sort:
  For Merge Sort, what is the worst case big O and what kind of input would cause
that? Given your implementation of Merge Sort, what is the best case big O and
what kind of input would cause that?

*/
class Main {
    public static void main(String[] args) {
        BucketManager bm = new BucketManager();
        bm.add("Be the very best. Like no one ever was.");
        bm.add("Finish watching the Squid Game.");
        bm.add("Make sourdough bread.");
        bm.add("Complete a masters in Computer Science.");
        bm.add("Learn an instrument.");
        bm.add("Complete a bachelors in Computer Science.");
        bm.add("Complete a PhD in Computer Science.");
        bm.add("Apply to college.");
        bm.add("Become a starship captain.");
        bm.print();
        System.out.println("----");
        //bm.sort();
        bm.print();
    } }