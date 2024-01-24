package NxtAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractise {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        //URl
        String Url = "https://nxtgenaiacademy.com/demo-site/";
        //calling url
        driver.get(Url);

        //maximize the window
        driver.manage().window().maximize();

        //id locator - enter first name
        driver.findElement(By.id("vfb-5")).sendKeys("Lathish", Keys.TAB);

        //id locator - enter last name
        driver.findElement(By.id("vfb-7")).sendKeys("Kannan");

        //id Locator - enter address
        driver.findElement(By.name("vfb-13[address]")).sendKeys("LK");

        //id locator - partial LinkText
        driver.findElement(By.partialLinkText("Python")).click();

        //id locator - link text
        driver.findElement(By.linkText("Home")).click();

        //getting url of Home Page
        String link = driver.getCurrentUrl();
        System.out.println(link);

    }
}
