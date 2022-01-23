package de.felixpaetow.anotherone.configurations;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "fatsecret")
public class FatsecretsCredentials {

    private String key;
    private String secret;
}
