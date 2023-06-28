package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class productPage extends elementLocators {
    static WebDriver driver;

    public productPage(WebDriver driver) {
        super();
    }

    public static void back(){
        driver.navigate().back();
    }
    public void verifyPage() {
        String text1 = driver.findElement(By.xpath("//span[@class='title']")).getText();
        System.out.println(text1);
        if (text1.equals("Products")){
            System.out.println("User Landed On Product Page");
        }else {
            System.out.println("User Landed On InCorrect Page");
        }
    }
    public static void productPage(){

        Select dropdown=new Select((WebElement) dropDown);
        dropdown.selectByVisibleText("Price (high to low)");

    }
    public static void addProduct(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(250));
        wait.until(ExpectedConditions.elementToBeClickable(addProduct)).click();
    }
}
