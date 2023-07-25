package com.expd;

import com.expd.driver.Driver;
import org.testng.annotations.BeforeMethod;

public class BaseForWeb {


    @BeforeMethod
    public void setUp(){
        Driver.initDriverWeb();
    }
}
