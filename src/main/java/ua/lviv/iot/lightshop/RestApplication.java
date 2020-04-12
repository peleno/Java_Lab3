package ua.lviv.iot.lightshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({ "ua.lviv.iot.lightshop.dataaccess", "ua.lviv.iot.lightshop.business",
        "ua.lviv.iot.lightshop.controller" })
@EnableJpaRepositories("ua.lviv.iot.lightshop.dataaccess")
@SpringBootApplication
public class RestApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestApplication.class, args);
    }
}
