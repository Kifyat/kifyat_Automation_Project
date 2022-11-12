package Day7_10222022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class T1_Select_Statement {
    public static void main(String[] args) throws InterruptedException {

//define the webdriver manager setup for chromedriver
        WebDriverManager.chromedriver().setup();

        //initialize the chrome options
        ChromeOptions options = new ChromeOptions();

        //add options fir maximizing Chrome window
        options.addArguments("start-maximized", "incognito");

        WebDriver driver = new ChromeDriver(options);

        //go to mlcalc page
        driver.navigate().to("https://www.mlcalc.com");

        //wait few secs
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='Show advanced options']")).click();
        Thread.sleep(2000);

        //use select command for month dropdown
        WebElement strtMonth = driver.findElement(By.xpath("//*[@name='sm'"));
        Select startMothDropDown = new Select(strtMonth);
        //select by visible text
        startMothDropDown.selectByVisibleText("Nov");

        //use select command for year dropdown
        //WebElement startYear = new driver.findElement(By.xpath("//*[@name='sy']"));
        //Select startYearDropDown = new Select(startYear);
        //select visible text
        //startYearDropDown.selectByVisibleText("2023");
        driver.findElement(By.xpath("//*[@name='sy']")).click();
        driver.findElement(By.xpath("//*[text()='2023']")).click();




    }//end of main
}//end of java class



