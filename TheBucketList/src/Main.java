/*
  Your Name:  Dante Hurr
  Pace Email: dh51481n@pace.edu

Merge Sort:
  For Merge Sort, what is the worst case big O and what kind of input would cause
that?

        -Merge Sort has a worst case of O(n log n) which would be achieved in a normal situation where the merge sort has to
        compare each item. Sometimes the bucket can be skipped over if there are no competitive options
        (Ac vs. Aa and the next item is C) but other times the sort is forced to compare Aa vs Ab and then Ba vs Bb and so on
        then it would still have to compare all options netting the resulted complexity.

Given your implementation of Merge Sort, what is the best case big O and
what kind of input would cause that?

        - With my merge sort implementation, the best case would still be O(n log n) because merge sort has the same
        complexity in all cases and any input would net this result.

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
        bm.sort();
        bm.print();
    } }