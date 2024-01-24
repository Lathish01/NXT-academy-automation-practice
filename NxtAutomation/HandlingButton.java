package NxtAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingButton {
    public static void main(String[] args) throws InterruptedException {

        //Webdriver Instance
        WebDriver driver = new ChromeDriver();
        //URl
        String Url ="https://nxtgenaiacademy.com/demo-site/";
        //Getting Url
        driver.get(Url);
        driver.manage().window().maximize();
        //is button displayed
        WebElement isdisplay = driver.findElement(By.id("vfb-4"));
        if (isdisplay.isDisplayed()){
            System.out.println("Button is displayed");

        }
        else {
            System.out.println("Button is not displayed");
        }
        //is button enabled
        WebElement isenable = driver.findElement(By.id("vfb-4"));
        if (isenable.isEnabled()){
            System.out.println("button is enabled");
            isenable.click();

        }else{
            System.out.println("not enabled");

        }
        Thread.sleep(3000);

        //closing the browser
        driver.close();
    }
}
