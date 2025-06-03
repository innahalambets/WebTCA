package com.dev.WebPortal.tests;

import com.dev.WebPortal.pages.WebPortalAccountPage;
import com.dev.WebPortal.pages.WebPortalHomePage;
import com.dev.WebPortal.pages.WebPortalVerifyAccountPage;
import org.testng.annotations.Test;
import utils.ConfigReader;

import java.time.Duration;

public class WebPortalVerifyAccountTest extends WebPortalTestBase{


   @Test

    public void validateVerificationCodeSignUp() throws InterruptedException {

       WebPortalHomePage webPortalHomePage = new WebPortalHomePage(driver);
       WebPortalAccountPage webPortalAccountPage = new WebPortalAccountPage(driver);
       WebPortalVerifyAccountPage webPortalVerifyAccountPage = new WebPortalVerifyAccountPage(driver);
       webPortalHomePage.signUpNow(driver, "Welcome to the Club", ConfigReader.readProperty("newEmail"));
       webPortalAccountPage.createAccount(driver, "3", "Inna", "8473339947","Halambets",
               "PrivatePerson", "49423");
       Thread.sleep(1000);
       webPortalVerifyAccountPage.enterVerificationCode("12345");
       Thread.sleep(1000);
       webPortalVerifyAccountPage.submitVerifyAccountButton();





   }

   @Test
    public void validateVerificationCodeSignIn() throws InterruptedException {
      WebPortalHomePage webPortalHomePage = new WebPortalHomePage(driver);
      WebPortalVerifyAccountPage webPortalVerifyAccountPage = new WebPortalVerifyAccountPage(driver);
      webPortalHomePage.logIn(ConfigReader.readProperty("email"));
      Thread.sleep(1000);
      webPortalVerifyAccountPage.enterVerificationCode("12345");
      Thread.sleep(1000);
      webPortalVerifyAccountPage.clickLoginButton();





   }


}
