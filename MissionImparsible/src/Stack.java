public class Stack {

    Node head;
    int size;
    int topOfStack = -1;
    int theArray[];

    /*To push some element x onto the stack, we increment topOfStack and then set theArray[topOfStack] = x.
    To pop, we set the return value to theArray[topOfStack] and then decrement topOfStack.
     */

    /*
    Make an empty stack.
    Read characters until end of file.
    If the character is an opening symbol, push it onto the stack.
    If it is a closing symbol, then if the stack is empty report an error.
    Otherwise, pop the stack.
    If the symbol popped is not the corresponding opening symbol, then report an error.
    At end of file, if the stack is not empty report an error.
     */

    // Make an Empty Stack
    public Stack(){

        head = null;
        this.size = size;

        int theArray[] = new int[size];
    }

    //Push Array elements to Stack
    public void push(String text){

        Node n = new Node(text);

        if(topOfStack + 1 == size){

            System.out.println("No space. Stack Overflow.");
        }
        else{
            topOfStack += 1;

                //push new element
                n.next = head;
                head = n;
        }
    }

    public String pop(){

        if(topOfStack == -1){

            System.out.println("No space. Stack Underflow.");
            return null;
        }
        else{

            //pop node here
            Node n = head;

            head = head.next;
            topOfStack--;

            return head.toString();
        }

       /*if(head == null){
            return null;
        }*/
    }

    public boolean isEmpty(){

        if(head == null || topOfStack == -1){
            return true;
        }

        return false;
    }
}
