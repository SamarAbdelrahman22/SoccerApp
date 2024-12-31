public class Defender extends Team1{
    public Defender(String name, String positon) {
        super(name, positon);
    }


    public void play() {
        System.out.println(name + " is defending!");
    }
}
