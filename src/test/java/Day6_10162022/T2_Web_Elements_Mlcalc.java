package Day6_10162022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T2_Web_Elements_Mlcalc {
    public static void main(String[] args) throws InterruptedException {

        //define the webdriver manager setup for chromedriver
        WebDriverManager.chromedriver().setup();

        //initialize the chrome options
        ChromeOptions options = new ChromeOptions();

        //add options fir maximizing chrome window
        options.addArguments("start-maximized", "incognito");

        WebDriver driver = new ChromeDriver(options);
        //go to mlcalc page

        driver.navigate().to("https://www.mlcalc.com");

        //wait few secs
        Thread.sleep(3000);

        //clear and enter a new value on purchase price field
        WebElement pPrice = driver.findElement(By.xpath("//*[@name='ma']"));

        //clear the purchase field
        pPrice.clear();
        //type new value on the purchase price
        pPrice.sendKeys("45000");

        //clear and enter a new value on purchase price field
        WebElement dPayment = driver.findElement(By.xpath("//*[@name='dp']"));

        //clear the purchase field
        dPayment.clear();
        //type new value on the purchase price
        dPayment.sendKeys("25");


    }//end of main
}//end of java class
