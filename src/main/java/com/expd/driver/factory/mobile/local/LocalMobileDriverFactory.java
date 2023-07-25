package com.expd.driver.factory.mobile.local;

import com.expd.driver.manager.mobile.local.AndroidManager;
import com.expd.driver.manager.mobile.local.IOSManager;
import com.expd.driver.manager.web.local.ChromeManager;
import com.expd.driver.manager.web.local.FirefoxManager;
import com.expd.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

public final class LocalMobileDriverFactory {

    private LocalMobileDriverFactory(){}

    public static WebDriver getDriver(MobilePlatformType mobilePlatformType){
        return isAndroidPlatform(mobilePlatformType)
                ? AndroidManager.getDriver()
                : IOSManager.getDriver();
    }

    private static boolean isAndroidPlatform(MobilePlatformType mobilePlatformType) {
        return mobilePlatformType == MobilePlatformType.ANDROID;
    }
}
