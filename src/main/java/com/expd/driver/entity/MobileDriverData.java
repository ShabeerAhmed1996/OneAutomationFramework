package com.expd.driver.entity;

import com.expd.enums.MobilePlatformType;
import com.expd.enums.MobileRemoteMode;
import com.expd.enums.RunModeBrowserType;
import lombok.Builder;
import lombok.Getter;


@Builder
@Getter
public class MobileDriverData {


    private MobilePlatformType mobilePlatformType;
    private RunModeBrowserType runModeBrowserType;
    private MobileRemoteMode mobileRemoteMode;
}
