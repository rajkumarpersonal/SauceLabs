package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class homePage {
   static WebDriver driver;

   public homePage(WebDriver driver) {
      super();
   }

   public static void alert() {

      Alert alert = new Alert() {


         @Override
         public void dismiss() {

         }

         @Override
         public void accept() {
            driver.switchTo().alert().accept();
         }

         @Override
         public String getText() {
            return null;
         }

         @Override
         public void sendKeys(String keysToSend) {

         }
      };

   }
}
