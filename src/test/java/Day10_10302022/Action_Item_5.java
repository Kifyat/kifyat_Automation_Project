package Day10_10302022;

import Reusable_Library.ReusableActions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Action_Item_5 {

    WebDriver driver;
    @BeforeSuite
    public void SetChromeDriver(){
        driver = ReusableActions.setUpDriver();
    }//end of set driver method


    @Test(priority = 1)
    public void SearchForDentist(){
        driver.navigate().to("https://www.uhc.com/");
        //click on find a doctor
        ReusableActions.clickAction(driver,"//*[@class='position-relative bg-blueDark color-white display-block width-100 lg-bg-white p-4 size-17 talign-center']","Click Doctors");
        //scroll to find a dentist
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //scroll down to 1100 pixels
        jse.executeScript("scroll(0,1100)");
        ReusableActions.clickAction(driver,"//*[@aria-label='Find a dentist Opens a new window']","Find dentist");
        //store the tabs in arraylist
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //switch to the new tab
        driver.switchTo().window(tabs.get(1));
        ReusableActions.clickAction(driver,"//*[@class='imgBox']","Employer and Individual Plan");
    }//end of test 1

    @Test(priority = 2)
    public void SearchForLocation() throws InterruptedException {
        //enter 10467 on search field
        ReusableActions.sendKeysAction(driver,"//*[@id='location']","10467 ","Search Field");
        ReusableActions.clickAction(driver, "//*[@id='locationTypeaheadResults']", "Zip Code Link");
        //click on continue
        ReusableActions.submitAction(driver,"//*[@cs-id='locationSubmit']","Continue");
        Thread.sleep(3000);
        //click on National options ppo 30
        ReusableActions.clickAction(driver,"//*[@class='sc-jomqko TEkcT']","National Options PPO 30");
        //click on general dentist
        driver.navigate().refresh();
        Thread.sleep(3000);
        ReusableActions.clickAction(driver,"//*[@data-test-id=GeneralDentists']","General Dentist");
    }//end of test 2

    @Test(priority = 3)
    public void CaptureInfo() throws InterruptedException {
//select from miles dropdown 'Within 5 Miles'
        //use select command for miles dropdown
        ReusableActions.selectByText(driver,"//*[contains(@class,'radiusMiles ng-pristine')]","Within 5 Miles","Miles");
        //refresh the page
        driver.navigate().refresh();
        //wait few seconds
        Thread.sleep(3000);
        //click first doctor you see
        ReusableActions.clickActionByIndex(driver,"//*[@class='ally-focus-within']",0,"First Doctor");
        //click on save button
        ReusableActions.clickAction(driver,"//*[@class='cta-header-button action-btn saved-provider-button negative ally-focus-within']","First Doctor");
//grab text info of address, miles and in or out network
        String addressValue = ReusableActions.getTextAction(driver, "//*[@class='undefined adr']", "Address");
        String milesValue = ReusableActions.getTextAction(driver, "//*[@id='distance-away']", "Miles");
        String networkValue = ReusableActions.getTextAction(driver, "//*[@class='status-label']", "Network");
        //print statement
        System.out.println("Address: " + addressValue + "Miles: " + milesValue + "Network: " + networkValue);
    }//end of test 3

        @Test(priority = 4)
        public void CaptureResults() {
     //store the tabs in arraylist
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            //switch back to the first tab
            driver.switchTo().window(tabs.get(0));
            //enter doctor in search bar
            ReusableActions.sendKeysAction(driver,"//*[@name='q']","doctor","Search Field");
            //click search
            ReusableActions.clickAction(driver,"//*[@id='search__button-desktop']","search");
            //capture results
            String result = ReusableActions.getTextAction(driver,"//*[@id='search-results-count__header']","Results");
            String[] arrayResult = result.split(" ");
            System.out.println("Result is " + arrayResult[2]);

        }//end of test 4

    @AfterSuite
    public void quitTheSession(){
        driver.quit();
    }//end of after suite



}//end of main class
