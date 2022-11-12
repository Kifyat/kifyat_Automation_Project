package Day6_10162022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class T3_mlcalc_forloop {

    public static void main(String[] args) throws InterruptedException {

//define the webdriver manager setup for chromedriver
        WebDriverManager.chromedriver().setup();

        //initialize the chrome options
        ChromeOptions options = new ChromeOptions();

        //add options fir maximizing Chrome window
        options.addArguments("start-maximized", "incognito");
        options.addArguments("headless");
        //create sets of array list

        ArrayList<String> purchasePrice, downPayment, interestRate;

        purchasePrice = new ArrayList<>();
        purchasePrice.add("350000");
        purchasePrice.add("370000");
        purchasePrice.add("380000");

        //down payment arrayList
        downPayment = new ArrayList<>();
        downPayment.add("25");
        downPayment.add("30");
        downPayment.add("35");

        //interest rate arrayList
        interestRate = new ArrayList<>();
        interestRate.add("3.4");
        interestRate.add("4.1");
        interestRate.add("2.8");

        WebDriver driver = new ChromeDriver(options);

        for (int i=0; i < interestRate.size(); i++) {
            //navigate to the google site

        //go to mlcalc page
        driver.navigate().to("https://www.mlcalc.com");

        //wait few secs
        Thread.sleep(2000);

            WebElement pPrice = driver.findElement(By.xpath("//*[@name='ma']"));


            //clear the purchase price
            pPrice.clear();
            //type new value on the purchase price
            pPrice.sendKeys(purchasePrice.get(i));

            //clear and enter a new value on down payment field
            WebElement dPayment = driver.findElement(By.xpath("//*[@name='dp']"));
            //clear the down payment
            dPayment.clear();
            //type new value on the down payment
            dPayment.sendKeys(downPayment.get(i));

            //clear and enter a new value on interest rate field
            WebElement intRate = driver.findElement(By.xpath("//*[@name='ir']"));
            //clear the down payment
            intRate.clear();
            //type new value on the down payment
            intRate.sendKeys(interestRate.get(i));


            Thread.sleep(2000);

            //capture and print monthly payment value
            String mntPayment = driver.findElements(By.xpath("//*[@style='font-size: 32px']")).get(0).getText();
            System.out.println("Monthly payment: " + mntPayment);
        }//end of for loop

    }//end of main
}//end of java class
