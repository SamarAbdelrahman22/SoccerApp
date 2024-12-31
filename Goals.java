public class Goals implements GameEvent {
    int team1Score = 0;
    int team2Score = 0;
    String team1 = "liverpool";
    String team2 = "manchestercity";

    @Override
    public void matchStart() {
        System.out.println("The match will start now!");

    }

    @Override
    public void kickOff(String team) {
        System.out.println("kicks off match");
    }

    @Override
    public void goalScored(String team, String player, int minute) {
        if (team.equals(team1)) {
            team1Score++;
        } else if (team.equals(team2)) {
            team2Score++;
        }
        System.out.println(player + " :scored goal for  " + team + " in minute:" + minute);

    }

    @Override
    public void possession(String team, int minute) {
        System.out.println("Possession changed to " + team + " at minute " + minute);
    }

    @Override
    public void card(String player, String cardType, int minute) {
        System.out.println(player + "have a yellow card :" + "in minute" + minute);


    }

    @Override
    public void changingTime(String team, String inPlayer, String outPlayerr, int minute) {
        System.out.println(team + "will make change:" + inPlayer + "with" + outPlayerr + "in minute" + minute);

    }

    @Override
    public void extraTimeAdded(int minutes) {
        System.out.println("Extra time added: " + minutes + " minutes");

    }

    @Override
    public void matchEnd() {
        System.out.println("The team  won :");

    }

    @Override
    public void getWinnerTeam() {


        if (team1Score > team2Score) {
            System.out.println(team1);
        } else if (team2Score > team1Score) {
            System.out.println(team2);
        } else {
            System.out.println("Draw");
        }


    }

}


