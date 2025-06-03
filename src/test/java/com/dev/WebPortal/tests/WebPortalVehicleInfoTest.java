package com.dev.WebPortal.tests;

import com.dev.WebPortal.pages.WebPortalVehicleInfoPage;
import org.testng.annotations.Test;

public class WebPortalVehicleInfoTest extends  WebPortalTestBase{

    @Test

    public void validateVehicleCreation(){
        WebPortalVehicleInfoPage webPortalVehicleInfoPage = new WebPortalVehicleInfoPage(driver);
        webPortalVehicleInfoPage.createVehicle("vehicle1", "ABCD123", "IL", "acura", "CSX",
                "2024", "white");
        webPortalVehicleInfoPage.accountNotifications();


    }
}
