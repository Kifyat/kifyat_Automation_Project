package Day3_10082022;

import java.util.ArrayList;

public class T3_Arraylist_Loop_Conditions {
    public static void main(String[] args) {
        //<> refers ro anchor

        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Canada");
        countries.add("Bangladesh");
        countries.add("India");
        countries.add("Australia");

        //using for loop to iterate through countries list and print out only the country is USA or Australia
        for (int i = 0; i < countries.size(); i++) {
            //two equals will compare the values from right and left side
            //whereas one equal use to set a value for a variable
            if (countries.get(i) == "USA") {
                System.out.println("Country is USA");
            } else if (countries.get(i) == "Australia") {
                System.out.println("Country is Australia");


                //using OR(||) operator you can write both/multiple conditions on one if statement
                if (countries.get(i) == "USA" || countries.get(i) == "Australia") {
                    System.out.println("Country is " + countries.get(i) + " And index is i is " + i);
                }//end of conditional


            }//end of loop


        }//end of main
    }
}//end of class