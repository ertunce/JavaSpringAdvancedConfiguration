package com.bilgeadam.JavaSpringAdvancedConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private CustomConfigBean customConfigBean;

    @GetMapping("/test-config")
    public ResponseEntity<String> getCustomConfig(){
        return ResponseEntity.ok().body(customConfigBean.getCustomMeassage());
    }
}
