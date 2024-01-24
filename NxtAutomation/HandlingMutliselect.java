package NxtAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMutliselect {
    public static void main(String[] args) throws InterruptedException {


    WebDriver driver = new ChromeDriver();
        {
            //Launch URL
            String url = "https://nxtgenaiacademy.com/webtable/";
            //calling URL
            driver.get(url);
            //maximizing the window
            driver.manage().window().maximize();

            //Multi-select Dropdown
            WebElement Multiselect = driver.findElement(By.name("programming"));

            if (Multiselect.isDisplayed()){
                System.out.println("multi is displayed");

                //selecting multi language
                Select select = new Select(Multiselect);
                //select by text
                select.selectByVisibleText("Java");
                //select by index
                select.selectByIndex(2);
                Thread.sleep(3000);
                //deselect all
                select.deselectAll();
            }else {
                System.out.println("not displayed");
            }

        }


    }
}
