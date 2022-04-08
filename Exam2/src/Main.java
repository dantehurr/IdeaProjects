/*
  Your Name:  Dante Hurr
  Pace Email: dh51481n@pace.edu
  Given your implementation, what is the runtime of:

  find and why?

            -Because I elected to search each side of the tree separately, the runtime of my find method is O(log2n)

  count and why?

            -Because of my list being counted with first all of the full left nodes and all of the full right nodes
             being traversed and then 1 is added to that total, my runtime in O(n).

*/
class Main {
    public static void main(String[] args) {
        StudentTree st = new StudentTree();
        st.insert("Carmine Guida");
        st.insert("Judd Nelson");
        st.insert("Emilio Estevez");
        st.insert("Ally Sheedy");
        st.insert("Molly Ringwald");
        st.insert("Anthony Michael Hall");
        System.out.println("\nFind:");
        Student s1 = st.find("Ally Sheedy");
        Student s2 = st.find("Harry Potter");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("\nCount: " + st.count());
        System.out.println("\nPrint in order:");
        st.print();
        System.out.println("\nPrint in pre-order:");
        st.printPreOrder();
    }
}