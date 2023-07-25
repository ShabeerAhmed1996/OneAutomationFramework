package com.expd.config;

import com.expd.config.converters.StringToBrowserTypeConverter;
import com.expd.config.converters.StringToRemoteModeBrowserTypeConverter;
import com.expd.config.converters.StringToRunModeBrowserTypeConverter;
import com.expd.config.converters.StringToURLConverter;
import com.expd.enums.BrowserRemoteModeType;
import com.expd.enums.BrowserType;
import com.expd.enums.MobileRemoteMode;
import com.expd.enums.RunModeBrowserType;
import org.aeonbits.owner.Config;

import java.net.URL;


@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties"
})
public interface FrameworkConfig extends Config {

    // this interface gets property from prop file using config source
    // using converter we are converting the string into enum
    // for both we are using OWNER dependency converter and source

    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();
    @Key("runModeBrowser")
    @ConverterClass(StringToRunModeBrowserTypeConverter.class)
    RunModeBrowserType browserRunMode();
    @Key("browserRemoteMode")
    @ConverterClass(StringToRemoteModeBrowserTypeConverter.class)
    BrowserRemoteModeType browserRemoteMode();

    @Key("mobileRemoteMode")
    MobileRemoteMode mobileRemoteMode();

    @Key("runModeMobile")
    @ConverterClass(StringToRunModeBrowserTypeConverter.class)
    RunModeBrowserType runModeMobile();


    @ConverterClass(StringToURLConverter.class)
    URL seleniumGridURL();

    @Key("username")
    String userName();
    String key();

    @DefaultValue("https://${username}:${key}@hub-cloud.browserstack.com/wd/hub")
    @ConverterClass(StringToURLConverter.class)
    URL browserStackURL();


    @ConverterClass(StringToURLConverter.class)
    @DefaultValue("http://127.0.0.1:4723/wd/hub")
    URL localAppiumServerURL();


}
