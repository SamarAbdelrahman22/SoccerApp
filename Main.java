import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;


public class Main {
    public static void main(String[] args) {
        //Welcome button
        String _name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showInputDialog("null", "Hello" + _name);
        String favTeam = JOptionPane.showInputDialog("Enter your fav team");
        JOptionPane.showInputDialog("null", "Oh!" + favTeam);
        JOptionPane.showInputDialog("null", "let's go!");

        SoccerStadium stadiumm = new SoccerStadium("Anfield", "Liverpool", 54000, "natural");
        stadiumm.showDetails();
        stadiumm.startMatch();


        //Liverpool players
        System.out.println("******************");
        System.out.println("we will show Liverpool players: ");
        LiverpoolTeam liverpoolTeam = new LiverpoolTeam();
        liverpoolTeam.printTeam();
        System.out.println("******************");

        // print Manchester city Players
        ManchesterCity manchesterCityPlayers = new ManchesterCity();
        manchesterCityPlayers.printManchesterCityPlayer();
        System.out.println("******************");

        //info of liverpool time
        DataOfPlayers player1 = new DataOfPlayers("Kelleher", "Liverpool", 62, "Irish", LocalDate.of(1998, 11, 23), "Goalkeeper",
                "2015-07-01", 5, 2000000, "Ireland", 1.88, 75, 0,
                Arrays.asList(), 0, false, 0, 0, 0, 1);
        System.out.println(player1.toString());
        System.out.println("----------------------------");

        DataOfPlayers player2 = new DataOfPlayers("Arnold", "Liverpool", 66, "English", LocalDate.of(1998, 10, 7), "Right Back",
                "2016-07-01", 6, 3000000, "England", 1.75, 69, 15,
                Arrays.asList("UEFA Champions League 2019"), 2, false, 17, 50, 1, 10);
        System.out.println(player2.getName() + player2.calculateAge());


        DataOfPlayers player3 = new DataOfPlayers("Joe Gomez", "Liverpool", 2, "English", LocalDate.of(1997, 5, 23), "Center Back",
                "2015-06-20", 5, 0, "England", 1.88, 77, 2,
                Arrays.asList("UEFA Champions League 2019"), 0, false, 2, 5, 0, 8);
        System.out.println(player3.getName() + player3.getNumber() + player3.calculateAge());

        DataOfPlayers player4 = new DataOfPlayers("Virgil van Dijk", "Liverpool", 4, "Dutch", LocalDate.of(1991, 7, 8), "Center Back",
                "2018-01-01", 6, 75000000, "Netherlands", 1.93, 92, 20,
                Arrays.asList("UEFA Champions League 2019"), 6, true, 26, 5, 1, 15);
        System.out.println(player4.getName() + player4.getNationTeam() + player4.calculateAge());

        DataOfPlayers player5 = new DataOfPlayers("Andrew Robertson", "Liverpool", 26, "Scottish", LocalDate.of(1994, 3, 11), "Left Back",
                "2017-07-21", 5, 0, "Scotland", 1.78, 64, 7,
                Arrays.asList("UEFA Champions League 2019"), 3, false, 10, 55, 1, 12);
        System.out.println(player5.getName() + player5.getInternationalAwards());

        DataOfPlayers player6 = new DataOfPlayers("IbrahimaKonate", "Liverpool", 5, "French", LocalDate.of(1999, 5, 25), "Center Back",
                "2021-07-01", 5, 40000000, "France", 1.94, 95, 3,
                Arrays.asList("FIFA World Cup Runner-Up 2022"), 1, false, 4, 2, 0, 7);
        System.out.println(player6.getName() + player6.getNationalGoals());

        DataOfPlayers player7 = new DataOfPlayers("Dominik ", "Liverpool", 8, "Hungarian", LocalDate.of(2000, 10, 25), "Midfielder",
                "2023-07-01", 5, 60000000, "Hungary", 1.86, 74, 25,
                Arrays.asList(), 10, true, 35, 40, 1, 5);
        System.out.println(player7.getName() + player7.getHeight());

        DataOfPlayers player8 = new DataOfPlayers(" Allister", "Liverpool", 10, "Argentine", LocalDate.of(1998, 12, 24), "Midfielder",
                "2023-06-08", 5, 42000000, "Argentina", 1.76, 68, 30,
                Arrays.asList("FIFA World Cup Winner 2022"), 2, false, 32, 28, 0, 8);
        System.out.println(player8.getName() + player8.getContractDuration());
        System.out.println("------------------------");

        DataOfPlayers player9 = new DataOfPlayers("Mohamed Salah", "Liverpool", 11, "Egyptian", LocalDate.of(1992, 6, 15), "Forward",
                "2017-06-22", 5, 100000000, "Egypt", 1.75, 71, 250,
                Arrays.asList("CAF Best Player 2017", "CAF Best Player 2018,FIFA Club World Cup Golden Ball"), 49, true, 299, 100, 0, 12);
        System.out.println(player9.toString());
        System.out.println(player9.getInternationalAwards());
        System.out.println(player9.calculateAge());
        System.out.println("----------------------");

        DataOfPlayers player10 = new DataOfPlayers(" Nunez", "Liverpool", 9, "Uruguayan", LocalDate.of(1999, 6, 24), "Forward",
                "2022-06-13", 6, 80000000, "Uruguay", 1.87, 79, 60,
                Arrays.asList("Copa América Winner 2021"), 15, false, 75, 20, 1, 9);
        System.out.println(player10.getName() + player10.isCaptain());

        DataOfPlayers player11 = new DataOfPlayers(" Diaz", "Liverpool", 7, "Colombian", LocalDate.of(1997, 1, 13), "Forward",
                "2022-01-30", 5, 60000000, "Colombia", 1.78, 70, 50,
                Arrays.asList("Copa America Top Scorer 2021"), 10, false, 60, 15, 0, 7);
        System.out.println(player11.getName() + player11.calculateAge());
        System.out.println("--------------------------------------------");

        Goals gameEvent = new Goals();

        gameEvent.matchStart();
        gameEvent.kickOff("liverpool");
        gameEvent.kickOff("liverpool");
        gameEvent.goalScored("liverpool", "moSalah", 15);
        gameEvent.possession("manchesterCity", 25);
        gameEvent.card("Luis Diaz", "yellow card", 40);
        Defender defender = new Defender("van Dijk", "Center Back");
        gameEvent.changingTime("liverpool", "Darwin Nunez", "Diogo Jota", 50);
        gameEvent.possession("liverpool", 55);
        gameEvent.goalScored("liverpool", "Konate", 72);
        gameEvent.extraTimeAdded(10);
        gameEvent.matchEnd();
        gameEvent.getWinnerTeam();

        LeagueTable leagueTable=new LeagueTable();
        leagueTable.leagueTable();
        System.out.println("                 ");

        LocalDate today = LocalDate.now();
        LocalDate date = LocalDate.of(2025,1,25);
        // ChronoUnit use primitive type long

        long countDays = ChronoUnit.DAYS.between(today, date);
        System.out.println(countDays);

        QuizGame _quizGame=new QuizGame();
        _quizGame.quizGame();

        Photo photo=new Photo();
        photo.showPhoto();
        
        









    }

































    }





