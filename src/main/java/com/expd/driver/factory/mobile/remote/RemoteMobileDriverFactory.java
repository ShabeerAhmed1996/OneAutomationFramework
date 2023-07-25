package com.expd.driver.factory.mobile.remote;

import com.expd.driver.factory.web.remote.BrowserStackFactory;
import com.expd.driver.factory.web.remote.SeleniumGridFactory;
import com.expd.enums.BrowserRemoteModeType;
import com.expd.enums.BrowserType;
import com.expd.enums.MobilePlatformType;
import com.expd.enums.MobileRemoteMode;
import org.openqa.selenium.WebDriver;

public final class RemoteMobileDriverFactory {

    private RemoteMobileDriverFactory(){}

    public static WebDriver getDriver(MobileRemoteMode mobileRemoteMode, MobilePlatformType mobilePlatformType){
        if (mobileRemoteMode== MobileRemoteMode.BROWSER_STACK){
    return BrowserStackMobileFactory.getDriver(mobilePlatformType);
        }else if (mobileRemoteMode==MobileRemoteMode.SAUCE_LAB){
            return null;
        }
        return null;
    }
}
