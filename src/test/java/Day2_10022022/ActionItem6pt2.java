package Day2_10022022;

import javax.swing.plaf.synth.Region;

public class ActionItem6pt2 {
    public static void main(String[] args) {
        //declare and define linear array for region
        String[] region;
        region = new String[]{"NY", "NJ", "CA", "FL"};
        //declare and define linear array for areaCode
        int[] areaCode = new int[]{718, 201, 530, 321};
        //iterate through all area code by while loop
        //set the initializer
        int i = 0;
        while (i < areaCode.length) {

            System.out.println("My region is " + region[i] + " and my area code is " + areaCode[i]);

            i++;
        }
    }//end of main


}//end of java class
