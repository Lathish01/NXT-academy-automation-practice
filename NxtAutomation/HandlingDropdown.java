package NxtAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {
    public static void main(String[] args) {
        //Webdriver Instance
        WebDriver driver = new ChromeDriver();


        //URl
        String Url ="https://nxtgenaiacademy.com/demo-site/";
        //Getting Url
        driver.get(Url);
        driver.manage().window().maximize();
        //Dropdown is displayed
        WebElement isdiplay = driver.findElement(By.id("vfb-13-country"));

        //Declaring variables
        String country1 = "India";
        String country2 = "Argentina";


        if (isdiplay.isDisplayed()){
            System.out.println("dropdown is diaplayed");

            //dopdown actions - select by text
            Select select = new Select(isdiplay);
            select.selectByVisibleText(country1);
            System.out.println(country1);

            //dropdown action - select by value
            select.selectByValue(country2);
            System.out.println(country2);

            //dropdown action - select by index
            select.selectByIndex(2);


        }else {
            System.out.println("it is not displayed");
        }
    }
}
