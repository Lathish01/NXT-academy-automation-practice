package NxtAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingErrorMsg {
    public static void main(String[] args) {
        //Webdriver Instance
        WebDriver driver = new ChromeDriver();
        //URl
        String Url ="https://nxtgenaiacademy.com/demo-site/";
        //Getting Url
        driver.get(Url);
        driver.manage().window().maximize();
        //verify registration title is displayed
        WebElement TitleText = driver.findElement(By.xpath("//h3[text()='Register For Demo']"));
        System.out.println(TitleText.getText());
        //validating the Registration Title
        String actualtitle = "Register For Demo";
        String expectitle  = TitleText.getText();
        if (expectitle.equals(actualtitle)){
            System.out.println("Both are same");
        }else {
            System.out.println("not same");
        }
        //click submit button for error msg appearing
        driver.findElement(By.id("vfb-4")).click();

        //error message validation
        WebElement Errormsg = driver.findElement(By.xpath("//label[text()='This field is required.']"));
        System.out.println(Errormsg.getText());
        String actualErrMsg = "This field is required.";
        String expectErrMsg  = Errormsg.getText();
        if (actualErrMsg.equals(expectErrMsg)){
            System.out.println("Both error msg are same");
        }else {
            System.out.println("Both error msg are not same");
    }
        //closing the window
        driver.close();
    }
}
