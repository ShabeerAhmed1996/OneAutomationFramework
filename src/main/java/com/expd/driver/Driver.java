package com.expd.driver;

import com.expd.config.factory.ConfigFactory;
import com.expd.driver.entity.MobileDriverData;
import com.expd.driver.entity.WebDriverData;
import com.expd.driver.factory.DriverFactory;
import com.expd.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

public class Driver {

    public static void initDriverWeb(){

        WebDriverData driverData = WebDriverData.builder().
                browserType(ConfigFactory.getConfig().browser())
                .browserRemoteModeType(ConfigFactory.getConfig().browserRemoteMode())
                .runModeBrowserType(ConfigFactory.getConfig().browserRunMode())
                .build();
        WebDriver driver = DriverFactory.getDriverForWeb(driverData);
        driver.quit();
    }

    public static void initDriverMobile(){

        MobileDriverData driverData =MobileDriverData.builder()
                .mobilePlatformType(MobilePlatformType.ANDROID)
                .mobileRemoteMode(ConfigFactory.getConfig().mobileRemoteMode())
                .runModeBrowserType(ConfigFactory.getConfig().runModeMobile())
                .build();
        WebDriver driver = DriverFactory.getDriverForMobile(driverData);
        driver.quit();
    }


    public static void quitDriver(){

    }
}
