package Day3_10082022;

public class ReusableClass {
public static void addTwoNumbers(int a, int b){
    int result = a+b;
    System.out.println("The result is " + result);

    }//end of addTwoNumbers

    public static void multiply(int e, int f){

    int result = e*f;

        System.out.println("The result is " + result);
    }

    //create a return method that will add two numbers and return the result from the print statement
    public static int returnTwoAddNumbers(int a, int b){
        int result = a+b;
        System.out.println("The return result is " + result);
        return result;

    }//end of returnTwoAddNumbers

}//end of java class
