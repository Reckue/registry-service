package com.reckue.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Class RegistryServiceApplication represents a service for registration all microservices.
 *
 * @author Kamila Meshcheryakova
 */
@EnableEurekaServer
@SpringBootApplication
public class RegistryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistryServiceApplication.class, args);
    }
}
