package com.expd.driver.factory;

import com.expd.driver.LocalMobileDriverImpl;
import com.expd.driver.LocalWebDriverImpl;
import com.expd.driver.RemoteMobileDriverImpl;
import com.expd.driver.RemoteWebDriverImpl;
import com.expd.driver.entity.MobileDriverData;
import com.expd.driver.entity.WebDriverData;
import com.expd.enums.RunModeBrowserType;
import org.openqa.selenium.WebDriver;

public final class DriverFactory {

    private DriverFactory(){}

    public static WebDriver getDriverForWeb(WebDriverData webDriverData){
      if (webDriverData.getRunModeBrowserType()== RunModeBrowserType.LOCAL){
          return new LocalWebDriverImpl().getDriver(webDriverData);
      } else {
          return new RemoteWebDriverImpl().getDriver(webDriverData);
      }
    }

    public static WebDriver getDriverForMobile(MobileDriverData mobileDriverData){
        if (mobileDriverData.getRunModeBrowserType()== RunModeBrowserType.LOCAL){
            return new LocalMobileDriverImpl().getDriver(mobileDriverData);
        } else {
            return new RemoteMobileDriverImpl().getDriver(mobileDriverData);
        }
    }
}
