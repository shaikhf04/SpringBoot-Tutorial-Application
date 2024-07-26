package org.spring.springboottutorialintellij;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@SpringBootApplication
public class SpringBootTutorialIntelliJApplication {

    Logger log= LoggerFactory.getLogger(SpringBootTutorialIntelliJApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTutorialIntelliJApplication.class, args);
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        log.info("printing log in Hello() method");
        return String.format("Hello %s!", name);
    }
}
