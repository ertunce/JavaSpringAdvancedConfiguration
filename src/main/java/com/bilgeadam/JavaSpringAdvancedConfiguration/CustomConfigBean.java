package com.bilgeadam.JavaSpringAdvancedConfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CustomConfigBean {

    @Value("${app.custom.message}")
    private String customMessage;

    @Value("${app.prop.message}")
    private String appPropertyMessage;

    public String getCustomMeassage(){
        return "Our config prop message: " + customMessage + "  And another message from app.properties: " + appPropertyMessage;
    }
}
