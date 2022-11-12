package Day12_11062022;

import Reusable_Library.Reusable_Actions_Loggers;
import Reusable_Library.Reusable_Annotations;
import org.testng.annotations.Test;

public class AI6 extends Reusable_Annotations {

    @Test(priority = 1)
    public void tc001_accessingLogIn() throws InterruptedException {
        //first navigate to td bank personal banking page
        driver.navigate().to("https://www.td.com/us/en/personal-banking");
        //click on sign in
        Thread.sleep(3000);
        //hovermouse
        //Reusable_Actions_Loggers.mouseHover(driver, "//*[contains(@class,'td-button-clear')]", "Cancel");
        //input username and password
        Reusable_Actions_Loggers.clickAction(driver, "//*[contains(@class,'td-button-clear')]", logger, "Sign In");
    }//end of test 1

    @Test(priority = 2)
    public void tc002_accessingSignUp() throws InterruptedException {
        //first navigate to td bank personal banking page
        driver.navigate().to("https://www.td.com/us/en/personal-banking");
        //click on sign up
        Reusable_Actions_Loggers.clickAction(driver, "//*[@class = 'cmp-text']", logger, "Sign In");
//click "I am account holder for all accounts on pop-up"
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id = 'formElement_9']", logger, "I am AH");
//click continue
        Reusable_Actions_Loggers.clickAction(driver, "//*[@type = 'submit']", logger, "continue");
        //click accept and continue
        Reusable_Actions_Loggers.clickAction(driver, "//*[@class = 'ng-scope form-control ng-touched ng-dirty ng-valid-parse ng-empty ng-invalid ng-invalid-required']", logger, "Accept");
        Reusable_Actions_Loggers.clickAction(driver, "//*[@class = 'ng-binding ng-scope ng-isolate-scope td-button td-button-large td-copy-button td-button-primary']", logger, "continue");
    }//end of test 2

    @Test(priority = 3)
    public void tc003_findingApplication() throws InterruptedException {
        //first navigate to td bank personal banking page
        driver.navigate().to("https://www.td.com/us/en/personal-banking");
        //click on checking account
        Reusable_Actions_Loggers.clickAction(driver, "//*[@class = 'td-icon icon-link td-icon-chequeing']", logger, "Sign In");
        //click on open a new account
        Reusable_Actions_Loggers.clickAction(driver, "//*[@class = 'cmp-button']", logger, "Sign In");
//click on get started on application
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id = 'productSelectionForm']", logger, "Sign In");
//pop up will come so click no
        Reusable_Actions_Loggers.clickAction(driver, "//*[@id = 'customerProfile.customerWelcomeSelection.no']", logger, "Sign In");
    }//end of test 3

}//end of class
