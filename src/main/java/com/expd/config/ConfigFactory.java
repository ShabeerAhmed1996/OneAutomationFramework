package com.expd.config;

import org.aeonbits.owner.ConfigCache;

public final class ConfigFactory {

    // this class is used to maintain the class instances used throughout this framework

    private ConfigFactory(){}

    public static FrameworkConfig getConfig(){
        return ConfigCache.getOrCreate(FrameworkConfig.class);
    }
}
