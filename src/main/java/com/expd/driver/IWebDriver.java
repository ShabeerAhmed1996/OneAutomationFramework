package com.expd.driver;

import com.expd.driver.entity.WebDriverData;
import org.openqa.selenium.WebDriver;

public interface IWebDriver {

    WebDriver getDriver (WebDriverData webDriverData);
}
