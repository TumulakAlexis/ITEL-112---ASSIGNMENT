package com.itel.SimpleInventory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;


@Configuration
public class AppConfig {

    @Bean
    public Map<String, Product> inventory(){
        return new HashMap<>();
    }
}
