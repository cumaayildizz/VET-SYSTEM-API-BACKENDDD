package com.cuma.yildiz.VetSystem.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("https://incredible-zabaione-7d37c0.netlify.app/") // React uygulamanızın çalıştığı port
                .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS")
                .allowCredentials(true);

    }
}

//@CrossOrigin(origins = "http://localhost:5173")
//public class CustomerController {
