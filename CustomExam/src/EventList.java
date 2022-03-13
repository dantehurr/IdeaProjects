public class EventList {

    Event head;
    Event tail;

    public EventList() {

        head = null;
        tail = null;
    }

    public void addToFront(String name, int minutes) {

        Event m = new Event(name, minutes);
        m.next = head;
        head = m;

        if(head.next == null){

            head.next = tail;
            tail = head;
        }

    }

    public void addToEnd(String name, int minutes){

        Event m = new Event(name, minutes);

        if(head == null){

            m.next = head;
            head = m;

            m.next = tail;
            tail = m;
        }
        else{

            tail.next = m;
            tail = m;
        }
    }

    public void print(){

        if (head == null)
            System.out.println("There is no list to print.");

        Event current = head;

        while (current != null){

            System.out.println(current.name + ": " + current.minutes + " minutes");
            current = current.next;
        }

    }

    public int count(){

        if(head == null){
            return 0;
        }

        Event current = head;

        int count = 0;

        while(current != null){

            count++;
            current = current.next;
        }
        return count;
    }

    public int add(Event m){

        int total = 0;
        int index = 0;

        Event current = head;

        while(head != null && tail != null && index < count()){

            total += current.minutes;

            current = current.next;
            index++;
        }

        System.out.println("Total: " + total);
        return total;
    }

    public int sum(){

        return add(head);
    }
}