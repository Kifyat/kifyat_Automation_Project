package Day6_10162022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Action_Item_3 {
    public static void main(String[] args) throws InterruptedException {

        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //initialize chrome options
        ChromeOptions options = new ChromeOptions();
        //add options for maximizing the chrome window
        options.addArguments("start-maximized", "incognito");

//Create zipcode arraylist
        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("10467");
        zipCode.add("12202");
        zipCode.add("12222");

        //define the webdriver and pass the options into the method
        WebDriver driver = new ChromeDriver(options);

        for (int i = 0; i < zipCode.size(); i++) {
            //navigate to the weightwatchers site

            //go to mortgage calc site
            driver.navigate().to("https://www.weightwatchers.com/us/find-a-workshop/");
//wait 2 secs
            Thread.sleep(2000);

//clear the field and enter your zipcode
//id="location-search"
            WebElement myZipcode = driver.findElement(By.xpath("//*[@id='location-search']"));

            //  Thread.sleep(2000);
            // class=rightArrow-daPRP for search location button
            driver.findElement(By.xpath("//*[contains(@class,'rightArrow-daPRP')]")).click();


            myZipcode.click();
            myZipcode.sendKeys(zipCode.get(i));

            Thread.sleep(2000);

// click search //*[@class='ww button primary cta-1JqRp']
            WebElement submitSearch = driver.findElement(By.xpath("//*[@class='ww button primary cta-1JqRp']"));

            submitSearch.click();

            Thread.sleep(1000);

            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("scroll(0,650)");

            ArrayList<WebElement> studioLinks = new ArrayList<>(driver.findElements(By.xpath("//*[@class='container-3SE46']")));


            if (i == 0) {
                studioLinks.get(0).click();
            } else if (i == 1) {
                studioLinks.get(1).click();
            } else if (i == 2) {
                studioLinks.get(2).click();
                Thread.sleep(2000);

            }//end of if else

            //capturing address //*[@class='address-2PZwW']
            String studioAddy = driver.findElement(By.xpath("//*[@class='address-2PZwW']")).getText();
            String[] splitStudioAddy = studioAddy.split("Studio");
            System.out.println("The Address is: " + splitStudioAddy[0]);


            jse.executeScript("scroll(0,450)");
            Thread.sleep(3000);
            //capturing address class="scheduleContainerMobile-1RfmF"
            String studioSchedule = driver.findElement(By.xpath("//*[@class='scheduleContainerMobile-1RfmF']")).getText();
            System.out.println("Schedule is: " + studioSchedule);


        }//end of loop
        //quit chrome

        driver.quit();
    }//end of main
}//end of java class

