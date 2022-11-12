package Practice_Codes_Week_1;

import java.util.ArrayList;

public class Practice_3_ForLoop_ArrayList {
    public static void main(String[] args) {

        //declare and define the arraylist for jordan
        ArrayList<String> jordan = new ArrayList<>();
        jordan.add("1s");
        jordan.add("2s");
        jordan.add("3s");
        jordan.add("4s");
        jordan.add("5s");
        jordan.add("6s");

        //call for loop to print all jordan values from the array list
        for (int i = 0; i < jordan.size(); i++) {
            //print out each zip code manually
            System.out.println("jordan: " + jordan.get(i));


        }//end of loop


    }//end of main
}//end of Practice 3

