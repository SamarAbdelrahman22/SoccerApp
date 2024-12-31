import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ManchesterCity {
    String name;
    //stores objects only so we canot use int, use wrappr class
    //key==Integer(num)    value==String(name)


    public void printManchesterCityPlayer() {

        HashMap<Integer, String> manchesterCity = new HashMap<>();
        manchesterCity.put(31, "Ederson");
        manchesterCity.put(2, "Kyle Walker");
        manchesterCity.put(25, "Manuel Akanji");
        manchesterCity.put(3, "Ruben Dias");
        manchesterCity.put(6, "Nathan Ake");
        manchesterCity.put(16, "Rodri");
        manchesterCity.put(8, "Ilkay Gundogan");
        manchesterCity .put(20, "Bernardo Silva");
        manchesterCity .put(47, "Phil Foden");
        manchesterCity.put(9, "Erling Haaland");
        manchesterCity.put(19, "Julian Alvarez");

        System.out.println("Manchester City Players:");
        for (Integer number : manchesterCity.keySet()) {
            System.out.println( number + ", Player: " + manchesterCity.get(number));


        } Scanner scan=new Scanner(System.in);
        try {
            System.out.println("Enter the shirt number to search for:" );
            int searchNumber = scan.nextInt();

            if (manchesterCity.containsKey(searchNumber)) {
                System.out.println("Player with shirt number " + searchNumber + ": " + manchesterCity.get(searchNumber));
            } else {
                System.out.println("No player found with shirt number " + searchNumber);
            }
        } catch (Exception e) {

            System.out.print("Invalid input! Please enter a valid shirt number.");
        }


    }
}