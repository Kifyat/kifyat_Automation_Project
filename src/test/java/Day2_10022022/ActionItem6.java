package Day2_10022022;

import java.util.ArrayList;

public class ActionItem6 {
    public static void main(String[] args) {
        //declare and define the arraylist for the country
        ArrayList<String> country = new ArrayList<>();
        //add values of countries
        country.add("USA");
        country.add("Mexico");
        country.add("Brazil");
        country.add("Peru");
        country.add("Russia");
        //declare and define country codes
        ArrayList<Integer> countryCode = new ArrayList<>();
        countryCode.add(1);
        countryCode.add(52);
        countryCode.add(55);
        countryCode.add(51);
        countryCode.add(7);
        //call for loop
        for(int i = 0; i < countryCode.size(); i++){
            System.out.println("My country is " + country.get(i) + " and my country code is " + countryCode.get(i));
        }//end of loop

        }//end of main

}//end of Java Class
