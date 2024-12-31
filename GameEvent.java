public interface GameEvent  {
    void matchStart();
    void kickOff(String team);


    void goalScored(String team, String player, int minute);
    void card(String player, String cardType, int minute);
    void changingTime(String team, String inPlayer, String outPlayer, int minute);
    void extraTimeAdded(int minutes);
    void possession(String team, int minute);


    void matchEnd();
     void
     getWinnerTeam();




}
