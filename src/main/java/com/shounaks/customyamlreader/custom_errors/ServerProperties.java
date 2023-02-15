package com.shounaks.customyamlreader.custom_errors;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Data
@Component
@EnableConfigurationProperties(ServerProperties.class)
@ConfigurationProperties(prefix = "server")
public class ServerProperties {

    private Map<String, String> application;
    private Map<String, List<String>> config;
    private Map<String, Credential> users;

    // getters and setters

    public static class Credential {

        private String username;
        private String password;

        // getters and setters

    }
}