package com.expd.driver.factory.web.remote;

import com.expd.driver.manager.web.remote.browserstack.BrowserStackManager;
import com.expd.driver.manager.web.remote.seleniumgrid.SeleniumGridChromeManager;
import com.expd.driver.manager.web.remote.seleniumgrid.SeleniumGridFirefoxManager;
import com.expd.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class BrowserStackFactory {

    private BrowserStackFactory(){}

    public static WebDriver getDriver(BrowserType browserType){
        return BrowserStackManager.getDriver();

    }


}
