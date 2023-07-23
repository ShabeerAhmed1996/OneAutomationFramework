package com.expd.config;

import com.expd.enums.BrowserType;
import org.aeonbits.owner.Config;


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
}
