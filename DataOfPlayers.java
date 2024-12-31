import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public  class DataOfPlayers {

    private String name;
    private String team;
    private int number;
    private String nationality;
    //non-primitive type
    private LocalDate birthDate;
    private String position;
    private String joinDate;
    private int contractDuration;
    private long contractValue;
    private String nationTeam;
    private  double height;
    private double weight;
    private  int goals;
    //using non-primitive (reference) type
    private List<String> internationalAwards;
    private int nationalGoals;
    private boolean isCaptain;
    private int totalGoals;
    private  int totalAssist;
    private int  totalRedCard;
    private int  totalYellowCard;


    public DataOfPlayers(String name, String team, int number, String nationality, LocalDate birthDate, String position, String joinDate, int contractDuration, long contractValue, String nationTeam, double height, double weight, int goals, List<String> internationalAwards, int nationalGoals, boolean isCaptain, int totalGoals, int totalAssist, int totalRedCard, int totalYellowCard) {
        this.name = name;
        this.team = team;
        this.number = number;
        this.nationality = nationality;
        this.birthDate = birthDate;
        this.position = position;
        this.joinDate = joinDate;
        this.contractDuration = contractDuration;
        this.contractValue = contractValue;
        this.nationTeam = nationTeam;
        this.height = height;
        this.weight = weight;
        this.goals = goals;
        this.internationalAwards = internationalAwards;
        this.nationalGoals = nationalGoals;
        this.isCaptain = isCaptain;
        this.totalGoals = totalGoals;
        this.totalAssist = totalAssist;
        this.totalRedCard = totalRedCard;
        this.totalYellowCard = totalYellowCard;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public LocalDate getBrithDate() {
        return birthDate;
    }

    public void setBrithDate(LocalDate brithDate) {
        this.birthDate = brithDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public int getContractDuration() {
        return contractDuration;
    }

    public void setContractDuration(int contractDuration) {
        this.contractDuration = contractDuration;
    }

    public long getContractValue() {
        return contractValue;
    }

    public void setContractValue(long contractValue) {
        this.contractValue = contractValue;
    }

    public String getNationTeam() {
        return nationTeam;
    }

    public void setNationTeam(String nationTeam) {
        this.nationTeam = nationTeam;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public List<String> getInternationalAwards() {
        return internationalAwards;
    }

    public void setInternationalAwards(List<String> internationalAwards) {
        this.internationalAwards = internationalAwards;
    }

    public int getNationalGoals() {
        return nationalGoals;
    }

    public void setNationalGoals(int nationalGoals) {
        this.nationalGoals = nationalGoals;
    }

    public boolean isCaptain() {
        return isCaptain;
    }

    public void setCaptain(boolean captain) {
        isCaptain = captain;
    }

    public int getTotalGoals() {
        return totalGoals;
    }

    public void setTotalGoals(int totalGoals) {
        this.totalGoals = totalGoals;
    }

    public int getTotalAssist() {
        return totalAssist;
    }

    public void setTotalAssist(int totalAssist) {
        this.totalAssist = totalAssist;
    }

    public int getTotalRedCard() {
        return totalRedCard;
    }

    public void setTotalRedCard(int totalRedCard) {
        this.totalRedCard = totalRedCard;
    }

    public int getTotalYellowCard() {
        return totalYellowCard;
    }

    public void setTotalYellowCard(int totalYellowCard) {
        this.totalYellowCard = totalYellowCard;
    }
    


    @Override
    public String toString() {
        return "DataOfPlayers{" +
                "name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", number=" + number +
                ", nationality='" + nationality + '\'' +
                ", birthDate=" + birthDate +
                ", position='" + position + '\'' +
                ", joinDate='" + joinDate + '\'' +
                ", contractDuration=" + contractDuration +
                ", contractValue=" + contractValue +
                ", nationTeam='" + nationTeam + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", goals=" + goals +
                ", internationalAwards=" + internationalAwards +
                ", nationalGoals=" + nationalGoals +
                ", isCaptain=" + isCaptain +
                ", totalGoals=" + totalGoals +
                ", totalAssist=" + totalAssist +
                ", totalRedCard=" + totalRedCard +
                ", totalYellowCard=" + totalYellowCard +
                '}';}

        public int calculateAge() {
            return Period.between(birthDate, LocalDate.now()).getYears();
    }




    }