package org.gugahh.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApplication {

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }

    @Value("${application.name}")
    private String applicationName;

    @Value("${application.creator.name}")
    private String creatorName;

    @Value("${application.creator.email}")
    private String creatorEmail;

    @GetMapping("/hello")
    public String helloWorld() {
        return applicationName + "<br/>"
                + creatorName + "<br/>"
                + creatorEmail;
    }
}
