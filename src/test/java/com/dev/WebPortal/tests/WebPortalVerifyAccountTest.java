package com.dev.WebPortal.tests;

import com.dev.WebPortal.pages.WebPortalAccountPage;
import com.dev.WebPortal.pages.WebPortalHomePage;
import com.dev.WebPortal.pages.WebPortalVerifyAccountPage;
import org.testng.annotations.Test;
import utils.ConfigReader;

public class WebPortalVerifyAccountTest extends WebPortalTestBase{


   @Test

    public void validateVerificationCodeSignUp() throws InterruptedException {

       WebPortalHomePage webPortalHomePage = new WebPortalHomePage(driver);
       WebPortalAccountPage webPortalAccountPage = new WebPortalAccountPage(driver);
       WebPortalVerifyAccountPage webPortalVerifyAccountPage = new WebPortalVerifyAccountPage(driver);
       webPortalHomePage.signUpNow(driver, "New to TommyClub?", ConfigReader.readProperty("newEmail"));
       webPortalAccountPage.createAccount(driver, "3", "John", "8473339977","Smith",
               "PrivatePerson", "49423");
       webPortalVerifyAccountPage.enterVerificationCode("");
       webPortalVerifyAccountPage.submitVerifyAccountButton();



   }

   @Test
    public void validateVerificationCodeSignIn(){




   }


}
