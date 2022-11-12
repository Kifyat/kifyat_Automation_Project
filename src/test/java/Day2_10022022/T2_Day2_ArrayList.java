package Day2_10022022;

import java.util.ArrayList;

public class T2_Day2_ArrayList {
    public static void main(String[] args) {
        //declare and define an arrayList of countries
        ArrayList<String> countries = new ArrayList<>();
        //now add the values for countries array
        countries.add("USA");
        countries.add("Canada");
        countries.add("Bangladesh");
        countries.add("India");


        //print usa frm the countries list
        System.out.println("Countries value: " + countries.get(0));
        //get me all the count of the countries list
        System.out.println("Countries count: " + countries.size());

//call an integer array list for the streetNumber
        ArrayList<Integer> streetNumber = new ArrayList<>();
        streetNumber.add(223);
        streetNumber.add(333);
        System.out.println("First street Number: " + streetNumber.get(0));

    }//end of main





}//end of java class
