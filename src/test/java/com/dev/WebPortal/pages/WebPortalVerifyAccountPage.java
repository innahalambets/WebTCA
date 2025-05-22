package com.dev.WebPortal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebPortalVerifyAccountPage {

    public WebPortalVerifyAccountPage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//input[@type='text' and @inputmode='numeric']")
    List<WebElement> inputFields;

    @FindBy (xpath = "//button[@type='submit']")
    WebElement verifyAccountButton;


    public void enterVerificationCode(String code){

        for (int i = 0; i < 5; i++) {
            inputFields.get(i).clear();
            inputFields.get(i).sendKeys(String.valueOf(code.charAt(i)));

        }

    }
public void submitVerifyAccountButton(){
        verifyAccountButton.click();
}








}
