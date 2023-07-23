package com.expd.config;

import com.expd.enums.BrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Map;

public class StringToBrowserTypeConverter implements Converter<BrowserType> {
    @Override
    public BrowserType convert(Method method, String browserName) {
        Map<String, BrowserType> stringBrowserType = Map.of("CHROME", BrowserType.CHROME,
                "FIREFOX", BrowserType.FIREFOX);
        return stringBrowserType.getOrDefault(browserName.toUpperCase(),BrowserType.CHROME);
    }
}
