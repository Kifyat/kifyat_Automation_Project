package Practice_Codes_Week_1;

public class Practice_4_WhileLoop_LinearArray {

    public static void main(String[] args) {
        //declare and define linear array for jordans
        int[] jordan = new int[]{1, 2, 3, 4, 5, 6, 7};
        //iterate through all jordans by while loo[
        //set the initializer
        int i = 0;
        //now set the conditions for the while loop
        //Linear array gets the count by using .length command
        while (i < jordan.length) {
            System.out.println("Jordan " + jordan[i]);
            //incrementation goes at the end of the while loop
            i++;
        }//end of while loop
    }//end of main
}//end of Practice 4
