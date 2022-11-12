package Day4_10092022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class T4_GoogleSearch_DataDrivenException {
    public static void main(String[] args) throws InterruptedException {



//Arraylist for cars
            ArrayList<String> cars = new ArrayList<>();
            cars.add("BMW");
            cars.add("Audi");
            cars.add("Mercedes");


            //define the webdriver manager setup for chromedriver
            WebDriverManager.chromedriver().setup();
            //define the chrome driver to use for your test
            //creating an instance for a chrome driver(browser) to use for automation

            WebDriver driver = new ChromeDriver();


            for(int i=0; i<cars.size();i++) {

                //navigate to to the google site
                driver.navigate().to("https://www.google.com");

                //maximize my windows
                //for windows
                //driver.manage().window().maximize();
                //for mac
                //driver.manage().window().fullscreen;

                //sleep statement
                Thread.sleep(3000);

                //search a keyword on the search field
                //relative xpath to locate the element
                driver.findElement(By.xpath("//*[@name='q']")).sendKeys(cars.get(i));

        }//end of for loop



        //quit the driver to end the session
        driver.quit();








    }//end of main
}//end of java class
