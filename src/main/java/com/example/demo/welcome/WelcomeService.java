package com.example.demo.welcome;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by zhife on 2017/7/23.
 */
@Service
public class WelcomeService {
    @Value("${welcome.message}")
    private String appName;

    public String welcome(){
        return appName;
    }
}
