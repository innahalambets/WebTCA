package com.dev.WebPortal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.BrowserUtils;

public class WebPortalHomePage {

    public WebPortalHomePage(WebDriver driver){

        PageFactory.initElements(driver,this);


    }

    @FindBy(xpath = "//h1")
    WebElement header;

    @FindBy (xpath = "//a[@class='button white']")
    WebElement signUpButtonTop;

    @FindBy (xpath = "//a[@class='button']")
    WebElement logInButtonTop;

    @FindBy (xpath = "//input[@name='loginInput']")
    WebElement loginInputField;

    @FindBy (xpath = "//input[@type='submit']")
    WebElement logInButton;

    @FindBy (xpath = "//a[.='Sign up now']")
    WebElement signUpNowButton;

    @FindBy (xpath = "//a[.='Sign In']")
    WebElement signInButton;

    @FindBy (xpath = "//input[@type='submit']")
    WebElement createAccountButton;

    @FindBy (xpath = "//p[contains(text(), 'Already have an account?')]")
    WebElement alreadyHaveAnAccountText;

    @FindBy (xpath = "//p[contains(text(), 'New to TommyClub?')]")
    WebElement newToTommyClubText;

    @FindBy (xpath = "//p[@class='message error']")
    WebElement errorMessage;

    public void homePageInformation(WebDriver driver, String expectedHeader, String expectedTitle, String expectedUrl){
        Assert.assertEquals(BrowserUtils.getText(header), expectedHeader);
        Assert.assertTrue(signUpButtonTop.isDisplayed() && signUpButtonTop.isEnabled());
        Assert.assertTrue(logInButtonTop.isDisplayed() && logInButtonTop.isEnabled());
        Assert.assertTrue(signUpNowButton.isDisplayed() && signUpNowButton.isEnabled());
        Assert.assertEquals(driver.getTitle(), expectedTitle);
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);


    }

    public void signUpNow(String expectedSignUpText, String loginInput){

        Assert.assertTrue(newToTommyClubText.getText().contains(expectedSignUpText));
        Assert.assertTrue(signUpNowButton.isDisplayed() && signUpNowButton.isEnabled());
        signUpNowButton.click();
        loginInputField.sendKeys(loginInput);
        createAccountButton.click();

    }

    public void logIn(String loginInput){

        loginInputField.sendKeys(loginInput);
        logInButton.click();


    }

    public void invalidSignIn(String loginInput, String expectedErrorMessage){

        loginInputField.sendKeys(loginInput);
        logInButton.click();
        Assert.assertEquals(BrowserUtils.getText(errorMessage), expectedErrorMessage);


    }



}

