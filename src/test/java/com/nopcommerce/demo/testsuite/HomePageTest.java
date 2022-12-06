package com.nopcommerce.demo.testsuite;


import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomePageTest extends BaseTest{
    HomePage homePage = new HomePage();

@Test
    public void verifyPageNavigation(){

   // String actClick = homePage.selectMenu("Computers");
 //   String expClick = "Computers";
   Assert.assertEquals(homePage.selectMenu("Computers"),"Computers","Not matching");

}
}
