package com.examplebasicweb.demo.controller;

import com.examplebasicweb.demo.configuration.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/person")
public class PersonController {
    private final AppConfig config;
    private final Environment environment;

    public PersonController(AppConfig config, Environment environment) {
        this.config = config;
        this.environment = environment;
    }

    @GetMapping
    public Map<String, Object> info() {
        Map<String, Object> response = new HashMap<>();
        response.put("activeProfiles", environment.getActiveProfiles());
        response.put("defaultProfiles", environment.getDefaultProfiles());

        response.put("Name", config.getName());
        response.put("Age", config.getAge());
        response.put("Remark", config.getRemark());

        return response;
    }
}
