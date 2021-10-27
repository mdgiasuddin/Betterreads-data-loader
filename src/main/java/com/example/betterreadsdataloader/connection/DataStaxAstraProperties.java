package com.example.betterreadsdataloader.connection;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.File;

@ConfigurationProperties(prefix = "datastax.astra")
public class DataStaxAstraProperties {
    private File secureConnectBundle;

    public void setSecureConnectBundle(File secureConnectBundle) {
        this.secureConnectBundle = secureConnectBundle;
    }

    public File getSecureConnectBundle() {
        return secureConnectBundle;
    }
}
