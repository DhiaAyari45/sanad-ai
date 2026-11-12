package tn.esprit.sanad.resources;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/** Sanad AI - microservice Ressources & Approvisionnement (PostgreSQL · Redis). */
@SpringBootApplication
@EnableFeignClients
public class ResourceServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResourceServiceApplication.class, args);
    }
}
