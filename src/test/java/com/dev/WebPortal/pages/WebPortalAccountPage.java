package com.dev.WebPortal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utils.BrowserUtils;

import java.util.Set;

public class WebPortalAccountPage {

    public WebPortalAccountPage (WebDriver driver){

        PageFactory.initElements(driver, this);

    }

    @FindBy (xpath = "//select[@name='operatorId']")
    WebElement regionDropdown;

    @FindBy (xpath = "//input[@name='firstName']")
    WebElement firstName;

    @FindBy (css = ".PhoneInputInput")
    WebElement phoneNumber;

    @FindBy (xpath = "//input[@name='lastName']")
    WebElement lastName;

    @FindBy (xpath = "//select[@name='customer.type']")
    WebElement accountTypeDropdown;

    @FindBy (css = ".location-field-input")
    WebElement zipCode;

    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement termsAndConditionsCheckbox;

    @FindBy(xpath = "//button[@class='button']")
    WebElement createAccountButton;

    public void createAccount(WebDriver driver, String regionValue, String firstName, String phoneNumber,
                              String lastName, String accountTypeValue, String zipCode) {


        String mainPageId = driver.getWindowHandle();
        Set<String> allPages =  driver.getWindowHandles();
         for (String id: allPages){
             if (!id.equals(mainPageId)){
                 driver.switchTo().window(id);
             }
         }

         Select region = new Select(regionDropdown);
         region.selectByValue(regionValue);
         this.firstName.sendKeys(firstName);
         this.phoneNumber.sendKeys(phoneNumber);
         this.lastName.sendKeys(lastName);
         Select accountType = new Select(accountTypeDropdown);
         accountType.selectByValue(accountTypeValue);
         this.zipCode.sendKeys(zipCode);
         Assert.assertTrue(termsAndConditionsCheckbox.isDisplayed() && !termsAndConditionsCheckbox.isSelected());
         termsAndConditionsCheckbox.click();
         createAccountButton.click();


    }





}
