package com.expd.driver.manager.web.remote.browserstack;

import com.expd.config.factory.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class BrowserStackManager {

    private BrowserStackManager(){}
    public static WebDriver getDriver() {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("browser","chrome");
        desiredCapabilities.setCapability("browser_version","latest");
        desiredCapabilities.setCapability("os","windows");
        desiredCapabilities.setCapability("os_version","10");
        return new RemoteWebDriver(ConfigFactory.getConfig().browserStackURL(),desiredCapabilities);

    }
}
