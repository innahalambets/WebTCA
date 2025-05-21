package com.dev.WebPortal.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.BrowserUtils;
import utils.ConfigReader;
import utils.DriverHelper;

import java.time.Duration;

public class WebPortalTestBase {

    public WebDriver driver;

    @BeforeMethod
    public void setup(){

        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.get(ConfigReader.readProperty("webPortalUrl"));
        driver.get("https://portal.dev-tommycarwash.com/login");
       // driver= DriverHelper.getDriver();
      //  driver.get(ConfigReader.readProperty("webPortalUrl"));


    }

    @AfterMethod

    public void tearDown(ITestResult iTestResult){

        if (!iTestResult.isSuccess()){

        BrowserUtils.getScreenshot(driver);}

        driver.quit();
    }

}
