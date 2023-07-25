package com.expd.driver.factory.web.remote;

import com.expd.driver.manager.web.remote.seleniumgrid.SeleniumGridChromeManager;
import com.expd.driver.manager.web.remote.seleniumgrid.SeleniumGridFirefoxManager;
import com.expd.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class SeleniumGridFactory {

    private SeleniumGridFactory(){}

    public static WebDriver getDriver(BrowserType browserType){
        return browserType == BrowserType.CHROME
                ? SeleniumGridChromeManager.getDriver()
                : SeleniumGridFirefoxManager.getDriver();

    }


}
