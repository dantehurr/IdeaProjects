public class Student {
    public String name;
    public Student left;
    public Student right;
    public Student(String name) {
        this.name = name;
        this.left = null;
        this.right = null;
    }
    public String toString() {
        return name;
    } }