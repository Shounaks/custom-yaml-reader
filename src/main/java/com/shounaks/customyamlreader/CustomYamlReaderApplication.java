package com.shounaks.customyamlreader;

import com.shounaks.customyamlreader.custom_errors.CustomErrorList;
import com.shounaks.customyamlreader.custom_errors.ServerProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(factory = YamlPropertySourceFactory.class, value = "custom_error_message.yml")
@RequiredArgsConstructor
public class CustomYamlReaderApplication implements CommandLineRunner {
    private final CustomErrorList customErrorList;
    private final ServerProperties serverProperties;

    public static void main(String[] args) {
        SpringApplication.run(CustomYamlReaderApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(customErrorList.toString());
        System.out.println(serverProperties.toString());
    }
}
