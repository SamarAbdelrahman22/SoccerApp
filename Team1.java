public class Team1 {
    String name;
    String position;


    public Team1(String name, String positon) {
        this.name = name;
        this.position = position;
    }

    public void playing() {
        System.out.println(name + " is playing in position: " + position);
    }
}

