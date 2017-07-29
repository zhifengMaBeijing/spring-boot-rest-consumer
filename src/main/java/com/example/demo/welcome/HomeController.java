package com.example.demo.welcome;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhife on 2017/7/23.
 */
@RestController
public class HomeController {
    @Autowired
    private WelcomeService welcomeService;

    @Autowired
    private BasicConfig basicConfig;

    @RequestMapping("/")
    public String welcome() {
        return welcomeService.welcome()+","+basicConfig.getLevel();
    }

}
