package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.util.Random;

public class ShoppingCartPage extends Utility {

    By computerMenu = By.xpath("//ul[@class ='top-menu notmobile']/li/a[@href = '/computers']");

    By desktop = By.xpath("//ul[@class ='top-menu notmobile']//a[@href = '/desktops']");

    By sortByAToZ = By.id("products-orderby");

    By addToCartBuildOwnComputer = By.xpath("(//button[contains(text(),'to cart')])[1]");

    By selectGHzIntelPentiumDualCoreE2200 = By.name("product_attribute_1");

    By select8GB = By.name("product_attribute_2");

    By clickHddRadio = By.id("product_attribute_3_7");

    By clickOnOsRadio = By.id("product_attribute_4_9");

    By checkFirstBoxes =  By.id("product_attribute_5_12");

    By clickOnAddToCart = By.xpath("//button[@id='add-to-cart-button-1']");

    By clickOnCloseBar = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");

    By mouseHoverOnShoppingcart = (By.xpath("//body/div[6]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]"));
    By clickOnCart = By.xpath("//button[contains(text(),'Go to cart')]");
    By clickOnQuantity = By.xpath("//input[@class='qty-input']");
    By clickOnUpdateCart = By.id("updatecart");
    By clickOnServiceCheck = By.xpath("//input[@id='termsofservice']");
    By clickOnCheckOut = By.xpath("//button[@id='checkout']");
   By clickonCheckOutGuest=By.xpath("//button[contains(text(),'Checkout as Guest')]");


    public void clickOnComputerAndDesktop() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(computerMenu)).moveToElement(driver.findElement(desktop)).click().build().perform();
    }
public void clickOnSortByAToZ() {

    selectByValue(sortByAToZ, "5");
}
public void clickOnAddToCart() throws InterruptedException {
    Thread.sleep(5000);
        clickOnElement(addToCartBuildOwnComputer);
}
public void selectIntelPentiumDualCore(){
    selectByVisibleTextFromDropDown(selectGHzIntelPentiumDualCoreE2200,"2.2 GHz Intel Pentium Dual-Core E2200");
}
public void select8GB$60(){
    selectByVisibleTextFromDropDown(select8GB,"8GB [+$60.00]");
}
    public void clickHDDRadio400GB(){
        clickOnElement(clickHddRadio);
    }
    public void setClickOnOsRadioVistaPremium(){
        clickOnElement(clickOnOsRadio);
    }
    public String exptectedTextMessage(String exp){
        return exp;
    }
    public String actualTextToVerify(By by){
        String act = driver.findElement(by).getText();
        System.out.println(act);
        return act;
    }
    public void setCheckTwoBoxesMicrosoftAndCommander() throws InterruptedException {
        Thread.sleep(6000);
        clickOnElement(checkFirstBoxes);
       }

    public void clickOnAddtoCartButton(){
        clickOnElement(clickOnAddToCart);
    }
    public void setClickOnCloseBarButton(){
        clickOnElement(clickOnCloseBar);
    }
    public void mouseHoverShoppingAndGoToCart(){
    mouseHoverToElement(mouseHoverOnShoppingcart);
    clickOnElement(clickOnCart);
    }
    public void updateQuantityTwo(){
        driver.findElement(By.xpath("//input[@class='qty-input']")).clear();
        sendTextToElement(clickOnQuantity,"2");
    }
    public void updateOnCartTo(){
        clickOnElement(clickOnUpdateCart);
    }
    public void setClickOnServiceCheckBox(){
        clickOnElement(clickOnServiceCheck);
    }
    public void clickOnCheckOutBox(){
        clickOnElement(clickOnCheckOut);
    }
    public void clickOnCheckOutGuestBox(){
        clickOnElement(clickonCheckOutGuest);
    }
    public void selectPressButton(String message, By by){
        clickOnElement(by);
    }
    public void selectByDropDown(String message, By by, String name){
        selectByVisibleTextFromDropDown(by, name);
    }
    public void selectRadioButton(String message, By by){
        clickOnElement(by);
    }
    public void fillingMandatoryFields(String message, String sendText, By by){
        sendTextToElement(by, sendText);
    }

    public void randomEmailGeneratorAndSendText(By by, String firstName, String lastName){
        Random randomGenerator = new Random();
        int emailNum = randomGenerator.nextInt(9999);
        String email = firstName + "." + lastName + emailNum + "@email.com";
        sendTextToElement(by, email);
    }


    }

