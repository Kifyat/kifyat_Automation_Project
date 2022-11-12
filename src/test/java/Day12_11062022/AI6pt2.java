package Day12_11062022;

import Reusable_Library.Reusable_Actions_Loggers;
import Reusable_Library.Reusable_Annotations;
import org.testng.annotations.Test;

public class AI6pt2 extends Reusable_Annotations {

    @Test(priority = 1)
    public void tc001_followInstagram() throws InterruptedException {
        //make sure you are logged into your social media account respective to what you want to follow
        //first navigate to td bank personal banking page
        driver.navigate().to("https://www.td.com/us/en/personal-banking");
        //click on instagram icon
        Reusable_Actions_Loggers.clickAction(driver,"//*[@class = 'cmp-footer__social-icon']", logger,"Instagram");
        //store the tabs in arraylist
        //ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //open new tab (go to second tab)
        //driver.switchTo().window(tabs.get(1));
        //click on follow on the instagram tab
        Reusable_Actions_Loggers.clickAction(driver,"//*[@class = '_aacl _aaco _aacw _aad6 _aade']", logger,"follow");
    }//end of test 1


    @Test(priority = 2)
    public void tc002_followTwitter() throws InterruptedException {
        //make sure you are logged into your social media account respective to what you want to follow
        //first navigate to td bank personal banking page
        driver.navigate().to("https://www.td.com/us/en/personal-banking");
        //click on twitter icon
        Reusable_Actions_Loggers.clickAction(driver,"//*[@class = 'td-icon td-icon-twitter']", logger,"Twitter");
        //store the tabs in arraylist
        //ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //open new tab (go to second tab)
        //driver.switchTo().window(tabs.get(1));
        //click on follow on the instagram tab
        Reusable_Actions_Loggers.clickAction(driver,"//*[@class = 'css-901oao css-16my406 r-poiln3 r-bcqeeo r-qvutc0']", logger,"follow");
    }//end of test 2

    @Test(priority = 3)
    public void tc003_subscribeYoutube() throws InterruptedException {
        //make sure you are logged into your social media account respective to what you want to subsribe
        //first navigate to td bank personal banking page
        driver.navigate().to("https://www.td.com/us/en/personal-banking");
        //click on twitter icon
        Reusable_Actions_Loggers.clickAction(driver,"//*[@class = 'td-icon td-icon-youtube']", logger,"Youtube");
        //store the tabs in arraylist
        //ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //open new tab (go to second tab)
        //driver.switchTo().window(tabs.get(1));
        //click on follow on the instagram tab
        Reusable_Actions_Loggers.clickAction(driver,"//*[@class = 'yt-spec-touch-feedback-shape__fill']", logger,"subscribe");
    }//end of test 3

}//end of class
