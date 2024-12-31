import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public  class  LiverpoolTeam {
    String name;

    public void printTeam(){
        List<String> players = new ArrayList<>();
        players.add("Caoimhin Kelleher");
        players.add("Alexander-Arnold");
        players.add("Joe Gomez");
        players.add("Virgil van Dijk");
        players.add("Andrew Robertson");
        players.add("Ibrahima Konaté");
        players.add("Dominik Szoboszlai");
        players.add("Allister");
        players.add("Mohamed Salah");
        players.add("Darwin Núñez");
        players.add("Luis Díaz");
        players.add("Andrew Robertson");

        players.add(10,"Harvey Elliott.");
        players.set(7,"Curtis Jones");
        players.remove(9);
        players.set(9,"Diogo Jota");
        Collections.sort(players);

        System.out.println(players);



    }





    }

