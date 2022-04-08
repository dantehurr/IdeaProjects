public class StudentTree {
    Student root;
    public void insert(String name) {
        Student s = new Student(name);
        if (root == null) {
            root = s;
            return;
        }

        Student current = root;

        while (true) {
            if (s.name.compareTo(current.name) < 0) {
                if (current.left == null) {
                    current.left = s;
                    return;
                } else {
                    current = current.left;
                }
            }
            else {
                if(current.right == null){
                    current.right = s;
                    return;
                }
                current = current.right;
            } }
    }
    public Student find(String search) {
        return find(root, search);
    }
    public Student find(Student s, String search){
        if (s == null){
            return null;
        }
        if(s.name == search){
            return s;
        }
        if(search.compareTo(s.name) < 0){
            return find(s.left, search);
        }
        return find(s.right, search);
    }
    public int count() {
        return count(root);
    }
    public int count(Student s){
        int total = 0;
        if(s == null){
            return total;
        }

        return count(s.left) + count(s.right) + 1;
    }
    public void print() {
        print(root);
    }
    public void print(Student s){
        if(s == null){
            return;
        }
        print(s.left);
        System.out.println(s.name);
        print(s.right);
    }
    public void printPreOrder() {
        printPreOrder(root);
    }
    public void printPreOrder(Student s){
        if(s == null){
            return;
        }
        System.out.println(s.name);
        printPreOrder(s.left);
        printPreOrder(s.right);
    }
}