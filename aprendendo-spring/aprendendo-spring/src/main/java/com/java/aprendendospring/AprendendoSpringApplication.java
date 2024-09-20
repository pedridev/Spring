package com.java.aprendendospring;

import com.java.aprendendospring.infrastructure.entity.Usuario;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.java.aprendendospring.infrastructure.repository")
@ComponentScan("com.java.aprendendospring")
public class AprendendoSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(AprendendoSpringApplication.class, args);

    }
}
