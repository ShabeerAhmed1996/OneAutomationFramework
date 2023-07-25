package com.expd.driver;

import com.expd.driver.entity.WebDriverData;
import com.expd.driver.factory.web.local.LocalDriverFactory;
import com.expd.driver.factory.web.remote.RemoteDriverFactory;
import org.openqa.selenium.WebDriver;

public class RemoteWebDriverImpl implements IWebDriver{
    @Override
    public WebDriver getDriver(WebDriverData webDriverData) {
        return RemoteDriverFactory.getDriver(webDriverData.getBrowserRemoteModeType(),webDriverData.getBrowserType());
    }
}
