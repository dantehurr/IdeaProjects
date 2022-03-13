 /*
    Make an empty stack.
    Read characters until end of file.
    If the character is an opening symbol, push it onto the stack.
    If it is a closing symbol, then if the stack is empty report an error.
    Otherwise, pop the stack.
    If the symbol popped is not the corresponding opening symbol, then report an error.
    At end of file, if the stack is not empty report an error.
     */

    public class Stack {

        Node head;

        public Stack(){

            head = null;
        }

        public void push(String text){

            Node n = new Node(text);

            n.next = head;
            head = n;
        }

        public String pop(){

            if(head == null){
                return null;
            }
            Node n = head;

            head = head.next;

            return head.toString();
        }

        public boolean isEmpty(){

            if(head == null){
                return true;
            }

            return false;
        }
    }

