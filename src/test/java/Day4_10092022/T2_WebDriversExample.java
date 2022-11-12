package Day4_10092022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_WebDriversExample {
    public static void main(String[] args) throws InterruptedException {
        //define the webdriver manager setup for chromedriver
        WebDriverManager.chromedriver().setup();
        //define the chrome driver to use for your test
        //creating an instance for a chrome driver(browser) to use for automation

        WebDriver driver = new ChromeDriver();

        //navigate to to the google site
        driver.navigate().to("https://www.google.com");

        //wait few seconds
        Thread.sleep(3000);
        //quit the chrome session
        driver.quit();

    }//end of main
}//end of java class
