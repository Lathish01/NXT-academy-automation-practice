package NxtAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsconditionHandling {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //Assign URl
        String Url = "https://nxtgenaiacademy.com/demo-site/";
        driver.get(Url);
        //checking th input box isenabled
        Boolean isenable = driver.findElement(By.id("vfb-5")).isEnabled();
        System.out.println(isenable);
        //checking input box isdisplayed
        Boolean isdisplayed = driver.findElement(By.xpath("//label[text()='Last Name  ']")).isDisplayed();
        System.out.println(isdisplayed);

    }
}
