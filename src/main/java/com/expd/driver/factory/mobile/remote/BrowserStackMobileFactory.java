package com.expd.driver.factory.mobile.remote;

import com.expd.driver.manager.mobile.remote.BrowserStackAndroidManager;
import com.expd.driver.manager.web.remote.browserstack.BrowserStackManager;
import com.expd.enums.BrowserType;
import com.expd.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

public final class BrowserStackMobileFactory {

    private BrowserStackMobileFactory(){}

    public static WebDriver getDriver(MobilePlatformType mobilePlatformType){
        return BrowserStackAndroidManager.getDriver();

    }


}
