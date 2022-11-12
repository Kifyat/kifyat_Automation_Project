package Day13_11122022;

import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class T1_screenshot_yahoo extends Reusable_Annotations {

    @Test(priority = 1)
    public void tc001_verifyYahooPageTitle() throws InterruptedException {
        //first navigate to yahoo homepage
        driver.navigate().to("https://www.yahoo.com/");
        //define our expected string variable
        String expectedTitle = "Yahoo..";
        //get page title
        String actualTitle = driver.getTitle();

//        System.out.println("My actual title is: " + actualTitle);
//
//        System.out.println("My expected title is: " + expectedTitle);

        if (actualTitle.equals(expectedTitle)){
            logger.log(LogStatus.PASS, "Expected Result matches with Actual Result");

        }
        else {
            logger.log(LogStatus.FAIL, "Expected ResultS does not match with Actual Result");
        }


    }//end of test 1


    public static void compareExpectedAndActualText(String expectedText, String actualText, ExtentTest logger) {
        if (actualText.equals(expectedText)){
            logger.log(LogStatus.PASS, "Expected Text: " + expectedText + "and Actual Text: " + actualText + " match");

        }
        else {
            logger.log(LogStatus.FAIL, "Expected Text: " + expectedText + "and Actual Text: " + actualText + " does not match");
        }
    }

}//end of class
