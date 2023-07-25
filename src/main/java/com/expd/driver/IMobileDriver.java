package com.expd.driver;

import com.expd.driver.entity.MobileDriverData;
import com.expd.driver.entity.WebDriverData;
import org.openqa.selenium.WebDriver;

public interface IMobileDriver {

    WebDriver getDriver (MobileDriverData mobileDriverData);
}
