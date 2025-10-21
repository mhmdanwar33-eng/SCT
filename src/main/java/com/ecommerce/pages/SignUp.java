package com.ecommerce.pages;

import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.nio.channels.SelectableChannel;

public class SignUp {
    WebDriver driver;


    By username = By.xpath("//input[contains(@name, \"username\")]");
    By password = By.xpath("//input[contains(@name, \"password\")]");
    By repeatPassword = By.xpath("//input[contains(@name, \"repeatedPassword\")]");
    By Firstname = By.xpath("//input[contains(@name, \"account.firstName\")]");
    By lastName = By.xpath("//input[contains(@name, \"account.lastName\")]");
    By email = By.xpath("//input[contains(@name, \"account.email\")]");
    By phone = By.xpath("//input[contains(@name, \"account.phone\")]");
    By address1 = By.xpath("//input[contains(@name, \"account.address1\")]");
    By address2 = By.xpath("//input[contains(@name, \"account.address2\")]");
    By city = By.xpath("//input[contains(@name, \"account.city\")]");
    By state = By.xpath("//input[contains(@name, \"account.state\")]");
    By zip = By.xpath("//input[contains(@name, \"account.zip\")]");
    By country = By.xpath("//input[contains(@name, \"account.country\")]");
    By Language = By.xpath("//select[contains(@name, \"account.languagePreference\")]");
    By category = By.xpath("//select[contains(@name, \"account.favouriteCategoryId\")]");
    By mylist = By.xpath("//input[contains(@name, \"account.listOption\")]");
    By myBanner = By.xpath("//input[contains(@name, \"account.bannerOption\")]");
    By submit = By.xpath("//input[contains(@type, \"submit\")][@value=\"Save Account Information\"]");

    public SignUp(WebDriver driver) {
        this.driver = driver;
    }

    public void filluserData(String name,  String pass) {
        driver.findElement(username).sendKeys(name);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(repeatPassword).sendKeys(pass);
    }

//    public oid fillAccountData() {
//        driver.findElement(email).sendKeys("email@email.com");
//        driver.findElement(email).sendKeys("admin");
//
//    }

    public void addAccountDetails() {
        driver.findElement(Firstname).sendKeys("admin");
        driver.findElement(lastName).sendKeys("admin");
        driver.findElement(email).sendKeys("email@email");
        driver.findElement(phone).sendKeys("1234567890");
        driver.findElement(address1).sendKeys("address1");
        driver.findElement(address2).sendKeys("address2");
        driver.findElement(city).sendKeys("city");
        driver.findElement(state).sendKeys("state");
        driver.findElement(zip).sendKeys("00962");
        driver.findElement(country).sendKeys("country");
    }

    public  void fillProfileInfo(){
        new Select(driver.findElement(category)).selectByValue("REPTILES");
        new Select(driver.findElement(Language)).selectByValue("japanese");
        driver.findElement(mylist).click();
        driver.findElement(myBanner).click();

    }
    public void openPage() {
        driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
    }

    public void submit() {
        driver.findElement(submit).click();

    }


}
