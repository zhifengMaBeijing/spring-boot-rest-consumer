package com.example.demo.welcome;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by zhife on 2017/7/23.
 */
@Component
@ConfigurationProperties("basic")
public class BasicConfig {
    private String number;
    private String level;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
