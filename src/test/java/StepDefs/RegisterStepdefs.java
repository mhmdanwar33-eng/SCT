package StepDefs;

import com.ecommerce.pages.SignUp;
import com.ecommerce.utils.DriverFactory;
import com.ecommerce.utils.TestData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RegisterStepdefs {

    private WebDriver driver;

    //WebDriver driver = utils.DriverFactory.getDriver();

    SignUp signUp;
    public  RegisterStepdefs(){
        this.driver = DriverFactory.getDriver();
        signUp = new SignUp(driver);
    }

    @Given("user on registration page")
    public void userOnRegistrationPage() {
        //driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver = DriverFactory.getDriver();
        //signUp = new SignUp(driver);
        signUp.openPage();

    }

    @When("user enters new user details")
    public void userEntersNewUserDetails() {
        String username = "user" + System.currentTimeMillis();
        String password = "test123";
        TestData.registeredUsername = username;
        TestData.registeredPassword = password;
        signUp.openPage();
        signUp.filluserData(username, "test123");
        signUp.addAccountDetails();
        signUp.fillProfileInfo();
        signUp.submit();
    }

    @Then("user is Registered")
    public void userIsRegistered() {
        System.out.println("✅ Submit button clicked successfully!");
        Assert.assertNotNull(signUp.aftersubmit(),"Signed UP");
    }
}
