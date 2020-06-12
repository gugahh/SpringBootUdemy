package org.gugahh.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GenericConfiguration {

    @Bean(name = "applicationName")
    public String getAppName() {
        return "Vendas Application!";
    }
}
