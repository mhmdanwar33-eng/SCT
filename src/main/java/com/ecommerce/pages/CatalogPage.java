package com.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CatalogPage {

    WebDriver driver;

    public CatalogPage(WebDriver driver) {
        this.driver = driver;
    }

    By fishCategory = By.xpath("//img[contains(@src,\"../images/fish_icon.gif\")]");
    By GoldFish= By.xpath("//a[contains(@href,\"/actions/Catalog.action?viewProduct=&productId=FI-FW-02\")]");
    By maleGoldFish=By.xpath("//a[contains(@href, \"/actions/Catalog.action?viewItem=&itemId=EST-20\")]");
    By addtoCart = By.xpath("//a[contains(@class, \"Button\")]");
    By CartPageWelcome = By.xpath("//div[contains(@id,\"Cart\")]/h2");

    public void openFishCategory(){
        driver.findElement(fishCategory).click();
    }
    public void openGoldFish(){
        driver.findElement(GoldFish).click();
    }
    public void openMaleGoldFish(){
        driver.findElement(maleGoldFish).click();
    }
    public void clickAddtoCart(){
        driver.findElement(addtoCart).click();
    }
    public String getCartPageWelcome(){
        return driver.findElement(CartPageWelcome).getText();
    }

}

