package com.dev.WebPortal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.BrowserUtils;

public class WebPortalVehicleInfoPage {


    public WebPortalVehicleInfoPage(WebDriver driver){
        PageFactory.initElements(driver, this);

    }

    @FindBy (xpath = "//input[@placeholder='Vehicle name']")
    WebElement vehicleNickname;

    @FindBy (xpath = "//select[@name='vehicles[0].details.state']")
    WebElement vehicleStateDropdown;

    @FindBy (xpath = "//input[@name='vehicles[0].licensePlate']")
    WebElement licensePlate;

    @FindBy (xpath = "//input[@name='vehicles[0].stackedCharacters']")
    WebElement containsStackedCharactersCheckbox;

    @FindBy (xpath = "//input[@name='vehicles[0].details.licensePlateIsTemporary']")
    WebElement temporaryPlateCheckbox;

    @FindBy (xpath = "//select[@name='vehicles[0].details.make']")
    WebElement vehicleMakeDropdown;

    @FindBy (xpath = "//select[@name='vehicles[0].details.model']")
    WebElement vehicleModelDropdown;

    @FindBy (xpath = "//select[@name='vehicles[0].details.year']")
    WebElement vehicleYearDropdown;

    @FindBy (xpath = "//select[@name='vehicles[0].details.color']")
    WebElement vehicleColorDropdown;

    @FindBy (xpath = "//span[@class='icon-label']")
    WebElement addNewVehicleButton;

    @FindBy (xpath = "//button[.='Remove vehicle']")
    WebElement removeVehicleButton;

    @FindBy (xpath = "//button[.='Skip']")
    WebElement skipButton;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement completeAccount;

    @FindBy(xpath = "//button[@class='popover-button icon-button open']")
    WebElement notificationIcon;

    @FindBy (xpath = "//span[.='Email me receipts']")
    WebElement emailMeReceiptsToggle;

    @FindBy (xpath = "//span[.='Email marketing']")
    WebElement emailMarketingToggle;

    @FindBy (xpath = "//span[.='Text / SMS marketing']")
    WebElement textSmsMarketingToggle;

public void createVehicle(String vehicleName, String licensePlate, String vehicleState, String vehicleMake,
                          String vehicleModel, String vehicleYear, String vehicleColor){

    vehicleNickname.sendKeys(vehicleName);
    this.licensePlate.sendKeys(licensePlate);
    BrowserUtils.selectBy(vehicleStateDropdown, vehicleState, "value");
    Assert.assertTrue(!containsStackedCharactersCheckbox.isEnabled() && !containsStackedCharactersCheckbox.isSelected());
    Assert.assertTrue(!temporaryPlateCheckbox.isEnabled() && !temporaryPlateCheckbox.isSelected());
    BrowserUtils.selectBy(vehicleMakeDropdown,vehicleMake, "value");
    BrowserUtils.selectBy(vehicleModelDropdown, vehicleModel, "value");
    BrowserUtils.selectBy(vehicleYearDropdown, vehicleYear, "value");
    BrowserUtils.selectBy(vehicleColorDropdown, vehicleColor, "value");
    completeAccount.click();


}

public void accountNotifications (){
    notificationIcon.click();
    Assert.assertTrue(!emailMeReceiptsToggle.isEnabled() && emailMeReceiptsToggle.isDisplayed());
    Assert.assertTrue(emailMarketingToggle.isEnabled() && emailMeReceiptsToggle.isDisplayed());
    Assert.assertTrue(textSmsMarketingToggle.isEnabled() && emailMeReceiptsToggle.isDisplayed());


}




















}
