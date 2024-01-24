package NxtAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuthentication {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String url = "https://admin:admin@the-internet.herokuapp.com/basic_auth";
        driver.get(url);

        //verifying successfull message
        WebElement SuccessMsg = driver.findElement(By.xpath("//p"));
        String msg = SuccessMsg.getText();
        System.out.println(msg);

    }
}
