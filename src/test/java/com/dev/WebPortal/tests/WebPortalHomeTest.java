package com.dev.WebPortal.tests;

import com.dev.WebPortal.pages.WebPortalHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class WebPortalHomeTest {

    @Test

    public void validateHomePageInformation(){

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://portal.dev-tommycarwash.com/login");
        WebPortalHomePage webPortalHomePage= new WebPortalHomePage(driver);
        webPortalHomePage.homePageInformation(driver,"Welcome to the Club",
                "Tommy's Express Member Portal", "https://portal.dev-tommycarwash.com/login");


    }

    @Test
    public  void validateSignUpNowFunctionality(){

    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://portal.dev-tommycarwash.com/login");
    WebPortalHomePage webPortalHomePage= new WebPortalHomePage(driver);
    webPortalHomePage.signUpNow("New to TommyClub?", "innah+registration@tommycarwash.com");
}


@Test
    public void validateSignInFunctionality(){

    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://portal.dev-tommycarwash.com/login");
    WebPortalHomePage webPortalHomePage= new WebPortalHomePage(driver);
    webPortalHomePage.logIn("innah+registration1@tommycarwash.com");



}

@Test
    public void validateInvalidLogInFunctionality(){

    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://portal.dev-tommycarwash.com/login");
    WebPortalHomePage webPortalHomePage= new WebPortalHomePage(driver);
    webPortalHomePage.invalidSignIn("innah+registration1@tommycarwash.com", "Invalid email or phone number");


}

}
