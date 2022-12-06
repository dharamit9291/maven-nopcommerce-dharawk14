package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ShoppingCartPage;
import com.nopcommerce.demo.testbase.BaseTest;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingCartPageTest extends BaseTest {

    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        shoppingCartPage.clickOnComputerAndDesktop();
        shoppingCartPage.clickOnSortByAToZ();
        shoppingCartPage.clickOnAddToCart();
    /*    String expectedMessage  = "Build your own computer";
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Build your own computer')]"));
        Assert.assertEquals(actualMessage,expectedMessage,"Not matching Message");*/
        assertAssert("Not correct", shoppingCartPage.exptectedTextMessage("Build your own computer"), shoppingCartPage.actualTextToVerify(By.xpath("//h1[contains(text(),'Build your own computer')]")));
        shoppingCartPage.selectIntelPentiumDualCore();
        shoppingCartPage.select8GB$60();
        shoppingCartPage.clickHDDRadio400GB();
        shoppingCartPage.setClickOnOsRadioVistaPremium();
        shoppingCartPage.setCheckTwoBoxesMicrosoftAndCommander();
        Thread.sleep(5000);
        assertAssert("Not correct",shoppingCartPage.exptectedTextMessage("$1,475.00"), shoppingCartPage.actualTextToVerify(By.xpath("//span[@id='price-value-1']")));
        shoppingCartPage.clickOnAddtoCartButton();
        assertAssert("Not matching",shoppingCartPage.exptectedTextMessage("The product has been added to your shopping cart"),shoppingCartPage.actualTextToVerify(By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]")));
        shoppingCartPage.setClickOnCloseBarButton();
        shoppingCartPage.mouseHoverShoppingAndGoToCart();
        assertAssert("Not matching",shoppingCartPage.exptectedTextMessage("Shopping cart"),shoppingCartPage.actualTextToVerify((By.xpath("//h1[contains(text(),'Shopping cart')]"))));
        shoppingCartPage.updateQuantityTwo();
        shoppingCartPage.updateOnCartTo();
        Thread.sleep(2000);
        assertAssert("Not matching",shoppingCartPage.exptectedTextMessage("$2,950.00"), shoppingCartPage.actualTextToVerify(By.xpath("(//strong[text()='$2,950.00'])[2]")));
        shoppingCartPage.setClickOnServiceCheckBox();
        shoppingCartPage.clickOnCheckOutBox();
        assertAssert("Not matching", shoppingCartPage.exptectedTextMessage("Welcome, Please Sign In!"), shoppingCartPage.actualTextToVerify(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]")) );
        shoppingCartPage.clickOnCheckOutGuestBox();
        shoppingCartPage.fillingMandatoryFields("Fist Name", "Prime", By.id("BillingNewAddress_FirstName"));
        shoppingCartPage.fillingMandatoryFields("Last Name", "Testing", By.id("BillingNewAddress_LastName"));
        shoppingCartPage.randomEmailGeneratorAndSendText(By.id("BillingNewAddress_Email"), "Prime", "Testing");
        shoppingCartPage.selectByDropDown("Selecting Country", By.id("BillingNewAddress_CountryId"), "India");
        shoppingCartPage.fillingMandatoryFields("Entering city", "Ahmedabad", By.id("BillingNewAddress_City"));
        shoppingCartPage.fillingMandatoryFields("Entering Address1", "999 Raghunath Ni Pol", By.id("BillingNewAddress_Address1"));
        shoppingCartPage.fillingMandatoryFields("Entering Zip Code", "380011", By.id("BillingNewAddress_ZipPostalCode"));
        shoppingCartPage.fillingMandatoryFields("Entering Phone number", "9989711425", By.id("BillingNewAddress_PhoneNumber"));
        shoppingCartPage.selectPressButton("Click on Continue", By.name("save"));
        shoppingCartPage.selectRadioButton("Click on Radio Button Next Day Air($0.00)", By.id("shippingoption_1"));
        shoppingCartPage.selectPressButton("clicking CONTINUE", By.xpath("//button[@onclick='ShippingMethod.save()']"));
        shoppingCartPage.selectRadioButton("Select Radio Button Credit Card", By.id("paymentmethod_1"));
        shoppingCartPage.selectPressButton("clicking CONTINUE", By.xpath("//button[@onclick='PaymentMethod.save()']"));
        shoppingCartPage.selectByDropDown("Select Master card From Select credit card dropdown", By.id("CreditCardType"), "Master card");
        shoppingCartPage.fillingMandatoryFields("Fill the name", "Prime Testing", By.id("CardholderName"));
        shoppingCartPage.fillingMandatoryFields("Entering Credit Card number", "5357793919621142", By.id("CardNumber"));
        shoppingCartPage.selectByDropDown("Selecting Expiry Date", By.id("ExpireMonth"), "10");
        shoppingCartPage.selectByDropDown("Selecting Expiry Month", By.id("ExpireYear"), "2025");
        shoppingCartPage.fillingMandatoryFields("Entering Credit Card Code", "283", By.id("CardCode"));
        shoppingCartPage.selectPressButton("Click Continue Button", By.id("payment-info-buttons-container"));
        assertAssert("Verify Payment Method is Credit Card", shoppingCartPage.exptectedTextMessage("Payment Method:"),
                shoppingCartPage.actualTextToVerify(By.xpath("//span[contains(text(), 'Payment Method:')]")));
        assertAssert("Verify Payment Method is Credit Card", shoppingCartPage.exptectedTextMessage("Credit Card"),
                shoppingCartPage.actualTextToVerify(By.xpath("//span[contains(text(), 'Credit Card')]")));
        assertAssert("Verify “Shipping Method” is Next Day Air", shoppingCartPage.exptectedTextMessage("Shipping Method:"),
                shoppingCartPage.actualTextToVerify(By.xpath("//span[contains(text(), 'Shipping Method:')]")));
        assertAssert("Verify “Shipping Method” is Next Day Air", shoppingCartPage.exptectedTextMessage("Next Day Air"),
                shoppingCartPage.actualTextToVerify(By.xpath("//span[contains(text(), 'Next Day Air')]")));
        assertAssert("Verify Total is $2,950.00", shoppingCartPage.exptectedTextMessage("$2,950.00"),
                shoppingCartPage.actualTextToVerify(By.xpath("(//strong[text()='$2,950.00'])[2]")));
        shoppingCartPage.selectPressButton("Click on CONFIRM", By.xpath("//button[@onclick='ConfirmOrder.save()']"));
        assertAssert("Verify the Text Thank You", shoppingCartPage.exptectedTextMessage("Thank you"),
                shoppingCartPage.actualTextToVerify(By.xpath("//h1[text()='Thank you']")));
        assertAssert("Verify the message Your order has been successfully processed!", shoppingCartPage.exptectedTextMessage("Your order has been successfully processed!"),
                shoppingCartPage.actualTextToVerify(By.xpath("//strong[contains(text(), 'fully processed!')]")));
        shoppingCartPage.selectPressButton("Click on CONTINUE", By.xpath("//button[@onclick='setLocation(\"/\")']"));
        assertAssert("Verify the text Welcome to our store", shoppingCartPage.exptectedTextMessage("Welcome to our store"),
                shoppingCartPage.actualTextToVerify(By.xpath("//h2[text()='Welcome to our store']")));

    }

}
