package Day11_11052022;

import Reusable_Library.ReusableActions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class T1_WebElements_List {
    WebDriver driver;
    ArrayList<WebElement> totalMenuHeaders, mainMenuHeaders;
    @BeforeSuite
    public void SetChromeDriver() {
        driver = ReusableActions.setUpDriver();
        //navigate to usps.com home page
        driver.navigate().to("https://www.usps.com/");
        //store all the elements of the menu header into an arraylist of webelements
        totalMenuHeaders = new ArrayList<>(driver.findElements(By.xpath("//*[@class = 'nav-list']/li")));
    }//end of set driver method
    @AfterSuite
    public void quitTheSession() {
        driver.quit();
    }//end of after suite

    @Test(priority = 1)
        public void verifyTotalNumberOfTabs(){
            System.out.println("The total number of menu headers is: " + totalMenuHeaders.size());

    }//end of test 1

    @Test(priority = 2)
    public void clickOnFirstDropDown() {
        totalMenuHeaders.get(0).click();
    }//end of test 2

    @Test(priority = 3)
    public void verifyCountOfMainheader() {
        mainMenuHeaders = new ArrayList<>(driver.findElements(By.xpath("//*[@class = 'menuheader']")));
        System.out.println("The total number of menu headers is: " + mainMenuHeaders.size());

    }//end of test 3
}//end of main
