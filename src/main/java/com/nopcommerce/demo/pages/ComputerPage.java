package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class ComputerPage extends Utility {

    // By computerMenu = By.linkText("Computers");
    By computerMenu = By.xpath("//ul[@class ='top-menu notmobile']/li/a[@href = '/computers']");

    By desktop = By.xpath("//ul[@class ='top-menu notmobile']//a[@href = '/desktops']");
    By sortByZtoA = By.id("products-orderby");

    By listProducts = By.xpath("//h2[@class='product-title']");

    public void clickOnComputerAndDesktop() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(computerMenu)).moveToElement(driver.findElement(desktop)).click().build().perform();
    }

    public void selectZtoAFromDropDown() {
        Actions actions = new Actions(driver);
        selectByValue(sortByZtoA, "6");
    }

        public ArrayList gettingListBeforeSorting () {
            selectByVisibleTextFromDropDown(By.id("products-orderby"), "Position");

            List<WebElement> products = driver.findElements(listProducts);
            ArrayList<String> beforeSortingZToA = new ArrayList<>();
            for (WebElement list : products) {
                beforeSortingZToA.add(list.getText());
            }
            return beforeSortingZToA;

        }
        public ArrayList gettingListOfProduct () {
            List<WebElement> products = driver.findElements(listProducts);
            ArrayList<String> sortedList = new ArrayList<>();
            for (WebElement list : products) {
                sortedList.add(list.getText());
            }
            return sortedList;
        }

    }

