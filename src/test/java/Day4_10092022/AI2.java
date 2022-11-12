package Day4_10092022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class AI2 {

    public static void main(String[] args) throws InterruptedException {


        //Arraylist for sports
        ArrayList<String> sports = new ArrayList<>();
        sports.add("NBA");
        sports.add("NFL");
        sports.add("NHL");
        sports.add("MLB");


        //define the webdriver manager setup for chromedriver
        WebDriverManager.chromedriver().setup();
        //define the chrome driver to use for your test
        //creating an instance for a chrome driver(browser) to use for automation

        WebDriver driver = new ChromeDriver();


        for (int i = 0; i < sports.size(); i++) {


            //navigate to to the bing site
            driver.navigate().to("https://www.bing.com");

            //sleep statement
            Thread.sleep(3000);

            //search a keyword on the search field
            //relative xpath to locate the element
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(sports.get(i));


            //hit submit on the bing search button
            driver.findElement(By.xpath("//*[@id='search_icon']")).submit();

            Thread.sleep(3000);

            //capture the search result text
            String result = driver.findElement(By.xpath("//*[@class='sb_count']")).getText();
            //split message to extract out the search number
            String[] splitResult = result.split(" ");
            System.out.println("the search number for " + sports.get(i) + " is " + splitResult[0]);


        }//end of loop

        //quit the driver to end the session
        driver.quit();


    }//end of main


}//end of java class
