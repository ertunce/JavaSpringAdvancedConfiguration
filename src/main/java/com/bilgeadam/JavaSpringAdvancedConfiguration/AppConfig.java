package com.bilgeadam.JavaSpringAdvancedConfiguration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:custom-config.properties")
public class AppConfig {
}
