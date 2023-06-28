package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class elementLocators {
    static WebDriver driver;

    static By menu = By.xpath("//*[@id=\"menu_button_container\"]/div/div[1]/div");
    static By about = By.id("about_sidebar_link");
    static By tryit = By.xpath("//*[@id=\"__next\"]/header/div/div/div[2]/div/div[3]/a/button");

    static By dropDown = By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select");

    static By addProduct = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");

    static By cart=By.xpath("//*[@id=\"shopping_cart_container\"]/a");

    static By checkOutButton = By.name("checkout");

    static By firstname = By.id("first-name");
    static By lastname = By.id("last-name");
    static By postalcode = By.id("postal-code");

    static By continueButton = By.id("continue");

    static By initialAmount = By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div");
    static By finalAmount = By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[3]/div[2]/div[2]/div/text()[2]");
    static By finish = By.id("finish");



}
