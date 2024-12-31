public abstract class Stadium {
    String name;
    String location;
    long capacity;

    public Stadium(String name, String location, long capacity) {
        this.name = name;
        this.location = location;
        this.capacity = capacity;
    }

    public abstract void showDetails();

    public void startMatch() {
        System.out.println("The match will be at! " + name + " in " + location);

}}
