package NxtAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //URl
        String url ="https://nxtgenaiacademy.com/demo-site/";
        driver.get(url);
        //large size window
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //click on python linktext
        driver.findElement(By.linkText("Python for Automation")).click();
        Thread.sleep(3000);
        //navigate backPage
        driver.navigate().back();
        Thread.sleep(3000);
        //navigate forward
        driver.navigate().forward();
        Thread.sleep(3000);
        //naviagting HomePage
        driver.navigate().to(url);
        Thread.sleep(3000);
        //refresh
        driver.navigate().refresh();
    }
}
