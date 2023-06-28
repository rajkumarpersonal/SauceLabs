package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class stepDef  {
    static WebDriver driver=null;



    @Given("I open the browser")
    public void OpenTheBrowser() {
        String systemPath = System.setProperty("use.dir","");
        System.setProperty("webdriver.chrome.driver", systemPath+"/src/test/resources/drivers/chromedriver");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @When("I open the saucelabs page")
    public void OpenTheSaucelabsPage() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.navigate().to("https://www.saucedemo.com/");

    }

    @Then("login into the page with below credentials")
    public void LoginPage(io.cucumber.datatable.DataTable userCredentials) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(250));

        List<Map<String, String>> userdata = userCredentials.asMaps(String.class, String.class);
        driver.findElement(By.id("user-name")).sendKeys(userdata.get(0).get("userName"));
        driver.findElement(By.id("password")).sendKeys(userdata.get(0).get("passWord"));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button"))).click();

    }

    @Then("Handle the popup window")
    public void handle_the_popup_window() {
        homePage home=new homePage(driver);
        home.alert();

    }

    @Then("Click on the Menu Option")
    public void click_on_the_menu_option() {
        aboutPage aboutpage=new aboutPage(driver);
        aboutpage.menu();

    }

    @Then("Select the About option")
    public void select_the_about_option() {
        aboutPage aboutpage=new aboutPage(driver);
        aboutpage.about();
    }

    @Then("Verify the launched page SauceLabs TryItFree")
    public void verify_the_launched_page_sauce_labs_try_it_free() {
        aboutPage aboutpage=new aboutPage(driver);
        aboutpage.verify();
    }

    @Then("Go to the products page")
    public void go_to_the_products_page() {
        productPage product=new productPage(driver);
        product.back();
        product.verifyPage();

    }

    @Then("Select Price High to Low option")
    public void select_price_high_to_low_option() {
        productPage product=new productPage(driver);
        product.productPage();
    }

    @Then("Click the product to add the cart")
    public void click_the_product_to_add_the_cart() {
        productPage product=new productPage(driver);
        product.addProduct();
    }

    @Then("Verify the cart Page")
    public void verify_the_cart_page() {
        cartPage cart=new cartPage(driver);
        cart.cart();
        cart.verifyCartPage();

    }

    @Then("Click the Checkout page")
    public void click_the_checkout_page() {
        cartPage cart=new cartPage(driver);
        cart.checkout();
    }

    @Then("Enter the details")
    public void enter_the_details() {
        checkOutPage checkOut=new checkOutPage(driver);
        checkOut.details();
        checkOut.continueButton();
    }

    @Then("Verify the amount and checkout")
    public void verify_the_amount_and_checkout() {
        checkOutPage checkOut=new checkOutPage(driver);
        checkOut.verifyAmount();
    }
}
