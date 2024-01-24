package NxtAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioandCheckBox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //Url
        String url = "https://nxtgenaiacademy.com/demo-site/";
        driver.get(url);
        //verifing check is enabled
        WebElement isselect = driver.findElement(By.id("vfb-31-1"));

        WebElement ischecked =driver.findElement(By.id("vfb-20-4"));

        if (isselect.isSelected()){
            System.out.println("the radio button is selected");

        }
        else {
            System.out.println("not selected");
            isselect.click();
        }
            Thread.sleep(3000);


        //verifying check box

            if (ischecked.isSelected()){

                System.out.println("selected");
            }
            else {
                System.out.println("not selected");
                ischecked.click();
                System.out.println("selected again");
            }
            Thread.sleep(3000);
            driver.close();
    }


}




