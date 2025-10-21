package StepDefs;

import com.ecommerce.pages.LoginPage;
import com.ecommerce.utils.TestData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class loginStepdefs {

    WebDriver driver;
    LoginPage  loginpage;

    @Given("user open login page")
    public void userOpenLoginPage() {
        // Write code here that turns the phrase above into concrete actions
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginpage  = new LoginPage(driver);

        loginpage.OpenloginPage();


    }

    @When("user enters valid credentials")
    public void userEntersValidCredentials() {
        loginpage.loginwithCredentials(TestData.registeredUsername, TestData.registeredPassword);
    }

    @Then("user is logged in")
    public void userIsLoggedIn() {
        Assert.assertEquals(loginpage.loggedin().getText(),"Welcome admin!");
        driver.quit();
    }
}
