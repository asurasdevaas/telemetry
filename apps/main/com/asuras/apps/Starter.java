package com.asuras.apps;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
@ComponentScan({"com.asuras.apps","com.asuras.bc_one", "com.asuras.shared"})
public class Starter {
    public static void main(String[] args) {
        SpringApplication.run(Starter.class, args);
    }
}
