package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.example")
@PropertySource("classpath:products.properties")
public class SpringConfig {
    @Bean("dairyBean")
    public Dairy dairy() {
        return new Dairy();
    }

    @Bean("herbalBean")
    public Herbal herbal() {
        return new Herbal();
    }

    @Bean("fridgeBean")
    public Fridge fridge(){
        return new Fridge();
    }
}