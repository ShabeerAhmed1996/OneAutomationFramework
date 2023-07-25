package com.expd.driver;

import com.expd.driver.entity.MobileDriverData;
import com.expd.driver.entity.WebDriverData;
import com.expd.driver.factory.mobile.local.LocalMobileDriverFactory;
import com.expd.driver.factory.web.local.LocalDriverFactory;
import org.openqa.selenium.WebDriver;

public class LocalMobileDriverImpl implements IMobileDriver{

    @Override
    public WebDriver getDriver(MobileDriverData mobileDriverData) {
        return LocalMobileDriverFactory.getDriver(mobileDriverData.getMobilePlatformType());
    }
}
