package com.expd.driver;

import com.expd.driver.entity.MobileDriverData;
import com.expd.driver.factory.mobile.local.LocalMobileDriverFactory;
import com.expd.driver.factory.mobile.remote.RemoteMobileDriverFactory;
import org.openqa.selenium.WebDriver;

public class RemoteMobileDriverImpl implements IMobileDriver{

    @Override
    public WebDriver getDriver(MobileDriverData mobileDriverData) {
        return RemoteMobileDriverFactory.getDriver(mobileDriverData.getMobileRemoteMode(),mobileDriverData.getMobilePlatformType());
    }
}
