public class Event {

    public String name;
    public int minutes;
    public Event next;

    public Event(String name, int minutes) {

        this.name = name;
        this.minutes = minutes;
    }

    public String translateName(){

        return name;
    }

    public int translateMins(){

        return minutes;
    }
}