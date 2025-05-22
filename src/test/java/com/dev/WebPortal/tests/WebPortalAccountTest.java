package com.dev.WebPortal.tests;

import com.dev.WebPortal.pages.WebPortalAccountPage;
import com.dev.WebPortal.pages.WebPortalHomePage;
import org.testng.annotations.Test;
import utils.ConfigReader;

public class WebPortalAccountTest extends WebPortalTestBase{

    @Test
    public void validateSignUpFunctionality() throws InterruptedException {
        WebPortalHomePage webPortalHomePage = new WebPortalHomePage(driver);
        WebPortalAccountPage webPortalAccountPage=new WebPortalAccountPage(driver);
        webPortalHomePage.signUpNow(driver,"New to TommyClub?", ConfigReader.readProperty("newEmail"));
        webPortalAccountPage.createAccount(driver, "3","Inna","6309996655",
                "Halambets","PrivatePerson","49423");




    }





}
