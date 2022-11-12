package Day6_10162022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T1_Find_Elements {
    public static void main(String[] args) throws InterruptedException {

//define the webdriver manager setup for chromedriver
        WebDriverManager.chromedriver().setup();

        //initialize the chrome options
        ChromeOptions options = new ChromeOptions();

        //add options fir maxzimizing chrome window
        options.addArguments("start-maximized", "incognito");

        WebDriver driver = new ChromeDriver(options);
        //go to yahoo page

        driver.navigate().to("https://www.yahoo.com");

        //wait few secs
        Thread.sleep(3000);

        //using find element I want to click on second click within the group which is News
        driver.findElements(By.xpath("//*[contains(@class,'_yb_sc88r')]")).get(1).click();


    }//end of main
}//end of class
