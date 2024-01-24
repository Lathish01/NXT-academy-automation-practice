package NxtAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingActionKeys {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String url = "https://www.google.com/";
        driver.get(url);

        //search bar
        WebElement google = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));

        //action method
        Actions action = new Actions(driver);
        action.moveToElement(google).perform();
        Thread.sleep(3000);

        String exptxt = google.getAttribute("title");
        String acttxt = "Search";
        if (acttxt.equals(exptxt)){
            System.out.println("same");
        }else{
            System.out.println("not same");
            System.out.println(" expectedText is " + exptxt);
        }
    }
}
