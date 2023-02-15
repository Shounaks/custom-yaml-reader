package com.shounaks.customyamlreader.custom_errors;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Data
@Component
@ConfigurationProperties(prefix = "custom-errors")
public class CustomErrorList {
    Map<String, Map<String, CustomError>> errors;
}
