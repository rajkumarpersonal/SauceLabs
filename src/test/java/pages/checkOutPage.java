package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static pages.elementLocators.*;

public class checkOutPage {
    static WebDriver driver;

    public checkOutPage(WebDriver driver) {
    }

    public static void details(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(250));
        wait.until(ExpectedConditions.elementToBeClickable(firstname)).sendKeys("rajkumar");
        wait.until(ExpectedConditions.elementToBeClickable(lastname)).sendKeys("kuppusamy");
        wait.until(ExpectedConditions.elementToBeClickable(postalcode)).sendKeys("560078");
    }

    public static void continueButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(250));
        wait.until(ExpectedConditions.elementToBeClickable(continueButton)).click();
    }

    public static void verifyAmount(){
        String initialvalue = driver.findElement(initialAmount).getText();
        String finalvalue = driver.findElement(finalAmount).getText();
        Assert.assertEquals(initialvalue, finalvalue);
        System.out.println("amount is verified");

    }




}
