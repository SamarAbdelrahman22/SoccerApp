public class SoccerStadium extends Stadium{
    String grassType;

    public SoccerStadium(String name, String location, long capacity, String grassType) {
        super(name, location, capacity);
        this.grassType = grassType;
    }

    public SoccerStadium(String name, String location, long capacity) {
        super(name, location, capacity);
    }

    @Override
    public void showDetails() {
        System.out.println("Football Stadium: " + name);
        System.out.println("Location: " + location);
        System.out.println("Capacity: " + capacity + " spectators");
        System.out.println("Grass Type: " + grassType);
    }

    @Override
    public void startMatch() {
        super.startMatch();
    }
}
