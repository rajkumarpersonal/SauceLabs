package pages;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class aboutPage extends  elementLocators{
    public aboutPage(WebDriver driver) {
        super();
    }

    public static void menu(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(250));
        wait.until(ExpectedConditions.elementToBeClickable(menu)).click();
    }
    public static void about(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(250));
        wait.until(ExpectedConditions.elementToBeClickable(about)).click();
    }

    public static void verify() {

        try{
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(250));
            String text= wait.until(ExpectedConditions.elementToBeClickable(tryit)).getText();
            if (text=="Try it free"){
                System.out.println("Landed on the correct page");
            }
            else System.out.println("wrong page");
        } catch (Exception e){

        }
    }


    }
