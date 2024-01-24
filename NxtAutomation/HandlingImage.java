package NxtAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingImage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //Url
        String url = "https://nxtgenaiacademy.com/demo-site/";
        driver.get(url);
        //verifying image is displayed
        WebElement image = driver.findElement(By.xpath("//img[contains(@class,'image-4161')]"));
        if (image.isDisplayed()){
            System.out.println("image is displayed");
        }
        else {
            System.out.println("image is not displayed");
        }
        String picture = image.getAttribute("alt");
        System.out.println(picture);
    }
}
