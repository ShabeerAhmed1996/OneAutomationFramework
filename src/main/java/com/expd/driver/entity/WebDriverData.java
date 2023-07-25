package com.expd.driver.entity;

import com.expd.enums.BrowserRemoteModeType;
import com.expd.enums.BrowserType;
import com.expd.enums.RunModeBrowserType;
import lombok.Builder;
import lombok.Getter;


@Builder
@Getter
public class WebDriverData {


    private RunModeBrowserType runModeBrowserType;
    private BrowserType browserType;
    private BrowserRemoteModeType browserRemoteModeType;
}
