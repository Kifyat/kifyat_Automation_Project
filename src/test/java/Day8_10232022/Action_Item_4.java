package Day8_10232022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class Action_Item_4 {
    public static void main(String[] args) throws InterruptedException {


        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //initialize chrome options
        ChromeOptions options = new ChromeOptions();
        //add options for maximizing the chrome window
        options.addArguments("start-maximized", "incognito");

//Create city arraylist
        ArrayList<String> myCity = new ArrayList<>();
        myCity.add("New York");
        myCity.add("Boston");
        myCity.add("Miami");
//Create # of adults
        ArrayList<Integer> adultList = new ArrayList<>();
        adultList.add(2);
        adultList.add(3);
        adultList.add(4);

        //define the webdriver and pass the options into the method
        WebDriver driver = new ChromeDriver(options);

        for (int i = 0; i < myCity.size(); i++) {
            //navigate to the hotel.com site
            try {
                driver.navigate().to("https://www.hotels.com/");
            } catch (Exception e) {
                System.out.println("Unable to go to hotels.com" + e);
            }
            //wait 3 secs
            Thread.sleep(3000);
            //enter location
            try{
                ArrayList<WebElement> goingToBar = new ArrayList<>(driver.findElements(By.xpath("//*[contains@class,'uitk-fake-input')}")));
                goingToBar.get(0).sendKeys(myCity.get(i));
                goingToBar.get(0).submit(); //change to click on result from dropdown
            }catch (Exception e) {
                System.out.println("Unable to send my city to search field" + e);
            }
            //click the travelers
            try{
                ArrayList<WebElement> travelerOption = new ArrayList<>(driver.findElements(By.xpath("//*[contains@class,'uitk-fake-input')]")));
                travelerOption.get(1).click();
            }catch (Exception e) {
                System.out.println("Unable to click on travelers option" + e);
            }

            for (int j = 0; j < adultList.get(j); j++) {
                try{
                    //click on plus sign to change the number of adult travelers
                    driver.findElement(By.xpath("//*[@aria-label='Increase the number of adults in room 1']")).click();
                    //wait 2 seconds
                    Thread.sleep(2000);
                }catch (Exception e) {
                    System.out.println("Unable to change # of adults" + e);
                }
            }//end of second loop

            //add child travelers
            try{
                driver.findElement(By.xpath("//*@aria-label='Increase the number of children in room 1']")).click();
                //wait 2 secs
                Thread.sleep(2000);
            }catch (Exception e) {
                System.out.println("Unable to choose number of children error " + e);
            }
            try{
                //use select command to change child age
                WebElement age = driver.findElement(By.xpath("//*[@id='age-traveler_selector_children_age_selector_0-0']"));
                //wait 2 secs
                Thread.sleep(2000);
                Select dropDownChildAge = new Select(age);
                //select by index
                dropDownChildAge.selectByIndex(1);
            }catch (Exception e) {
                System.out.println("Child age error " + e);
            }
            try{
                //click done
                driver.findElement(By.xpath("//*[@id='traveler_selector_done_button']")).click();
                //wait 2 secs
                Thread.sleep(2000);
            }catch (Exception e) {
                System.out.println("Cannot click done error" + e);
            }
            try{
                //click search button
                driver.findElement(By.xpath("//*[@id='submit_button']")).click();
                //wait for 3 secs
                Thread.sleep(3000);
            }catch (Exception e) {
                System.out.println("Cannot search error" + e);
            }

            //hotel link
            try{
                ArrayList<WebElement> hotelLink = new ArrayList<>(driver.findElements(By.xpath("//*[@class='uitk-card-link']")));
                if (i == 0) {
                    hotelLink.get(0).click();
                    //wait 3 seconds
                    Thread.sleep(3000);
                }
                if (i == 1) {
                    hotelLink.get(2).click();
                    //wait 3 seconds
                    Thread.sleep(3000);
                }
                if (i == 2) {
                    hotelLink.get(1).click();
                    //wait 3 seconds
                    Thread.sleep(3000);
                }//end of if else

            }catch (Exception e) {
                System.out.println("Link does not work" + e);
            }

            //declare an array list for all tabs
            ArrayList<String> hotelTabs = new ArrayList<>(driver.getWindowHandles());
            //switch tabs for hotel.com
            driver.switchTo().window(hotelTabs.get(1));
            //wait 3 secs
            Thread.sleep(3000);


            try{
                //capture hotel names
                String name = driver.findElement(By.xpath("//*[@class = 'uitk-spacing uitk-spacing-padding-small-blockend-four uitk-spacing-padding-large-blockstart-three']")).getText();
               //wait 3 secs
                Thread.sleep(3000);
                //split by line to capture the first line where hotel name is
                String[] hotelName = name.split("\\R");
                //print hotel names
                System.out.println(hotelName[0]);
            }catch (Exception e) {
                System.out.println("Hotel name error" + e);
            }
            try{
                //click on reserve now
                driver.findElement(By.xpath("//*[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary']")).click();
                //wait 2 secs
                Thread.sleep(2000);
            }catch (Exception e) {
                System.out.println("Reserve a room error: " + e);
            }
            try{
                //capture first price
                ArrayList<WebElement> price = new ArrayList<>(driver.findElements(By.xpath("//*[@class = 'uitk-text uitk-type-600 uitk-type-bold uitk-text-emphasis-theme']")));
                //wait 3 seconds
                Thread.sleep(3000);
                String hotelPrice = price.get(0).getText();
                System.out.println(hotelPrice);
            }catch (Exception e) {
                    System.out.println("Hotel price error: " + e);
                }

                try{
                    //wait 3 seconds
                    Thread.sleep(3000);
                //click reserve
                driver.findElement(By.xpath("//*[@class='is-visually-hidden']")).click();
                //wait 2 secs
                Thread.sleep(2000);
            }catch (Exception e) {
                System.out.println("Reserve error" + e);
            }


            try{
                //capture the check in and out dates
                String dateInfo = driver.findElement(By.xpath("//*[@class = 'booking-details-travel-details-wrapper fs-base clear pb-mouse bottom-separator travel-details-bottom null']")).getText();
                //wait 3 secs
                Thread.sleep(3000);
                //capture check in and out info
                String[] checkInCheckOut = dateInfo.split("\\R");
                System.out.println(checkInCheckOut[0]);
                System.out.println(checkInCheckOut[1]);
            }catch (Exception e) {
                System.out.println("Info is wrong" + e);
            }
            //close current tab
            driver.close();
            //wait 3 seconds
            Thread.sleep(3000);

            //switch to first tab
            driver.switchTo().window(hotelTabs.get(0));
            //wait 3 secs
            Thread.sleep(3000);

        }//end of first loop
        //quit driver
        driver.quit();

    }//end of main

}//end of java class
