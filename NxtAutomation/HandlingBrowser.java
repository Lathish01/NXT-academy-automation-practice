package NxtAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBrowser {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String url = "https://nxtgenaiacademy.com/demo-site/";
        driver.get(url);
        //checking title is verified
        String actualtitle = "Demo Site – Registration Form – NxtGen A.I Academy";
        String expectedtitle = "emo Site – Registration Form – NxtGen A.I Academy";
        if (actualtitle==expectedtitle){
            System.out.println(actualtitle);
        }else {
            System.out.println(false);
        }
    }
}
