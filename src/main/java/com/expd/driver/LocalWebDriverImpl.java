package com.expd.driver;

import com.expd.driver.entity.WebDriverData;
import com.expd.driver.factory.web.local.LocalDriverFactory;
import org.openqa.selenium.WebDriver;

public class LocalWebDriverImpl implements IWebDriver{
    @Override
    public WebDriver getDriver(WebDriverData webDriverData) {
        return LocalDriverFactory.getDriver(webDriverData.getBrowserType());
    }
}
