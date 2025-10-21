package com.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import sun.jvm.hotspot.utilities.Assert;

public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

        By usernamel = By.xpath("//input[contains(@name, \"username\")]");
        By passwordl = By.xpath("//input[contains(@name, \"password\")]");
        By loginbutton= By.xpath("//input[contains(@name, \"signon\")]");
        By welcome = By.xpath("//div[contains(@id,\"WelcomeContent\") and contains(.,\"Welcome admin!\")]");

        public void OpenloginPage(){

            driver.get("https://petstore.octoperf.com/actions/Account.action?signonForm=");

        }


        public void loginwithCredentials(String username, String password)
        {
            driver.findElement(usernamel).sendKeys(username);
            driver.findElement(passwordl).clear();
            driver.findElement(passwordl).sendKeys(password);
            driver.findElement(loginbutton).click();


        }
        public WebElement loggedin()
        {
            return driver.findElement(welcome);
        }
    }

