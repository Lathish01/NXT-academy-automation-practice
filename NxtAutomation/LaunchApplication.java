package NxtAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        //Launching URL
        String url = "https://nxtgenaiacademy.com/demo-site/";
        //calling URL
        driver.get(url);
        //maximizing the window
        driver.manage().window().maximize();
        //closing the browser
        driver.quit();

    }
}
