package Day2_10022022;

import java.util.ArrayList;

public class T3_ForLoop_ArrayList {
    public static void main(String[] args) {
        //declare and define the arraylist for the zip code
        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("11218");
        zipCode.add("10001");
        zipCode.add("11219");
        zipCode.add("11377");
        zipCode.add("10002");
        zipCode.add("11217");
        zipCode.add("11376");

        //call for loop to print all zip code values from the array List
        for(int i=0; i < zipCode.size(); i++){
            //print out each zip code manually
            System.out.println("zipCode: " + zipCode.get(i));

        }//end of loop



    }//end of main



}//end of java
