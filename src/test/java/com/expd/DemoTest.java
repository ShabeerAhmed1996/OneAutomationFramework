package com.expd;

import com.expd.config.ConfigFactory;
import com.expd.config.FrameworkConfig;
import org.aeonbits.owner.ConfigCache;
import org.testng.annotations.Test;

public class DemoTest {


    @Test
    public void testLogin(){
        System.out.println(ConfigFactory.getConfig().browser());
    }
}
