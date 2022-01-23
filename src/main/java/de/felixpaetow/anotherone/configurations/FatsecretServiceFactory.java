package de.felixpaetow.anotherone.configurations;

import com.fatsecret.platform.services.FatsecretService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FatsecretServiceFactory {

    @Bean
    public FatsecretService createFatsecretService(FatsecretsCredentials credentials) {
        return new FatsecretService(credentials.getKey(), credentials.getSecret());
    }
}
