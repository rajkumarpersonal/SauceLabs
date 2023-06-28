package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class cartPage extends elementLocators{

    public cartPage(WebDriver driver) {
        super();
    }

    public static void cart(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(250));
        wait.until(ExpectedConditions.elementToBeClickable(cart)).click();
    }
    public void verifyCartPage() {
        String title = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        System.out.println(title);
        if (title.equals("Your Cart")){
            System.out.println("User Landed On Cart Page");
        }else {
            System.out.println("User Landed On InCorrect Page");
        }
    }
    public static void checkout(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(250));
        wait.until(ExpectedConditions.elementToBeClickable(checkOutButton)).click();
    }

}

