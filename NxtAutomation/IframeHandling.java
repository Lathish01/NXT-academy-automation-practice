package NxtAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandling {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String url = "https://nxtgenaiacademy.com/iframe/";
        driver.get(url);

        //switching frame - index
        driver.switchTo().frame(2);
        //inpuit value in First name
        driver.findElement(By.id("vfb-5")).sendKeys("LAthish");

        //baack to default content
        driver.switchTo().defaultContent();
        //swicthing frame
        driver.switchTo().frame(0);
        WebElement title = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/section[2]/div/div/div/div/div/h2"));
        String outputmsg = title.getText();
        System.out.println(outputmsg);



    }

}
