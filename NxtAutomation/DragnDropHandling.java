package NxtAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDropHandling {
    public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();
            String url = "https://nxtgenaiacademy.com/mouseevent/";
            driver.get(url);

            //creating instance for locators
        WebElement drag = driver.findElement(By.id("draggableElement"));
        WebElement drop = driver.findElement(By.id("droppableElement"));

        //creating instnace for drag and drop
        Actions dragme = new Actions(driver);
        dragme.dragAndDrop(drag,drop).perform();
    }
}
