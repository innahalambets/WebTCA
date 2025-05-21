package com.dev.WebPortal.tests;

import com.dev.WebPortal.pages.WebPortalHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utils.BrowserUtils;
import utils.ConfigReader;

import java.time.Duration;

public class WebPortalHomeTest  extends WebPortalTestBase {

    @Test

    public void validateHomePageInformation(){


        WebPortalHomePage webPortalHomePage= new WebPortalHomePage(driver);
        webPortalHomePage.homePageInformation(driver,"Welcome to the Club",
                "Tommy's Express Member Portal", "https://portal.dev-tommycarwash.com/login");


    }

    @Test
    public  void validateSignUpNowFunctionality(){

    WebPortalHomePage webPortalHomePage= new WebPortalHomePage(driver);
    webPortalHomePage.signUpNow(driver,"New to TommyClub?", "innah+registration@tommycarwash.com");
}


@Test
    public void validateSignInFunctionality(){


    WebPortalHomePage webPortalHomePage= new WebPortalHomePage(driver);
    webPortalHomePage.logIn(ConfigReader.readProperty("email"));



}

@Test
    public void validateInvalidLogInFunctionality(){


    WebPortalHomePage webPortalHomePage= new WebPortalHomePage(driver);
    webPortalHomePage.invalidSignIn(ConfigReader.readProperty("invalidEmail"), "Invalid email or phone number");


}

}
