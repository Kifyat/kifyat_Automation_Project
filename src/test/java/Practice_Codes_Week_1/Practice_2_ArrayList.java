package Practice_Codes_Week_1;

import java.util.ArrayList;

public class Practice_2_ArrayList {
    public static void main(String[] args) {

        //declare and define an arraylist of countries
        ArrayList<String> nbaTeams = new ArrayList<>();
        //now add the values for the nba teams
        nbaTeams.add("Celtics");
        nbaTeams.add("Lakers");
        nbaTeams.add("warriors");
        nbaTeams.add("Bulls");

        //print celtics from the nba teams list
        System.out.println("The Boston " + nbaTeams.get(0));
        System.out.println("There are only " + nbaTeams.size() + " great franchises ");


//call an integer array list for the jordan
        ArrayList<Integer> jordan = new ArrayList<>();
        jordan.add(1);
        jordan.add(2);
        jordan.add(3);
        jordan.add(4);
        jordan.add(5);
        jordan.add(6);

        System.out.println("The best sneakers are the jordan " + jordan.get(0));

    }//end of main


}//end if Practice 2
