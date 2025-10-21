package org;

import com.ecommerce.pages.CatalogPage;
import com.ecommerce.pages.LoginPage;
import com.ecommerce.pages.SignUp;
import com.ecommerce.utils.TestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demoTest {

    WebDriver driver;
    SignUp signUp;
    LoginPage loginpage;
    CatalogPage  catalogPage;

    @BeforeMethod
    public void setUp() {
        // Start browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Initialize your Page Object with this driver ✅
        signUp = new SignUp(driver);
        loginpage = new LoginPage(driver);
        catalogPage = new CatalogPage(driver);
        //Assert.assertEquals(loginpage.loggedin(),"Welcome admin!");
    }

    @Test(priority = 1)
    public void demosignup() {
        String username = "user" + System.currentTimeMillis();
        String password = "test123";
        TestData.registeredUsername = username;
        TestData.registeredPassword = password;
        signUp.openPage();
        signUp.filluserData(username, password);
        signUp.addAccountDetails();
        signUp.fillProfileInfo();
        signUp.submit();
        System.out.println("✅ Submit button clicked successfully!");
    }

    @Test(priority = 2)
    public void demosignin() {
        loginpage.OpenloginPage();
        loginpage.loginwithCredentials(TestData.registeredUsername, TestData.registeredPassword);
        Assert.assertEquals(loginpage.loggedin().getText(),"Welcome admin!");

    }

    @Test(priority = 3)
    public void navigateToSubCatrgory() {
        demosignin();
        catalogPage.openFishCategory();
        catalogPage.openGoldFish();
        catalogPage.openMaleGoldFish();
        catalogPage.clickAddtoCart();

    }


    @AfterMethod
    public void tearDown() {
        //driver.quit();
    }
}
