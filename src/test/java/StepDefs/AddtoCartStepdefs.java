package StepDefs;

import com.ecommerce.pages.CatalogPage;
import com.ecommerce.pages.LoginPage;
import com.ecommerce.utils.DriverFactory;
import com.ecommerce.utils.TestData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class AddtoCartStepdefs {

    private WebDriver driver;
    CatalogPage catalogPage;
    LoginPage loginPage;

    public AddtoCartStepdefs() {
        this.driver = DriverFactory.getDriver();
        this.catalogPage = new CatalogPage(driver);
        this.loginPage = new LoginPage(driver);
    }

    @Given("User is logged in")
    public void userIsLoggedIn() {
        //driver = new ChromeDriver();
        //driver.manage().window().maximize();
//        driver = DriverFactory.getDriver();
//
//        catalogPage = new CatalogPage(driver);
//        loginPage = new LoginPage(driver);
        loginPage.OpenloginPage();
        loginPage.loginwithCredentials(TestData.registeredUsername, TestData.registeredPassword);
        loginPage.loggedin();

    }

    @When("User navigates to the product page")
    public void userNavigatesToTheProductPage() {
        catalogPage.openFishCategory();
        catalogPage.openGoldFish();
        catalogPage.openMaleGoldFish();
        catalogPage.clickAddtoCart();

    }

    @Then("user add product to Cart")
    public void userAddProductToCart() {
        Assert.assertEquals( catalogPage.getCartPageWelcome(),"Shopping Cart");

    }
}
