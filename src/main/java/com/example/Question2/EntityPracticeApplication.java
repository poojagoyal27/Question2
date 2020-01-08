package com.example.Question2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EntityPracticeApplication {
    public static void main(String args[]) {
        SpringApplication.run(EntityPracticeApplication.class, args);
    }

  /*  @Bean
    public CommandLineRunner demo(EntityPracticeRepository entityPracticeRepository) {
        return (args) -> {
            // save a few customers
            entityPracticeRepository.save(new EntityPactice( "Jack", "Bauer"));
            entityPracticeRepository.save(new EntityPactice( "Chloe", "O'Brian"));
            entityPracticeRepository.save(new EntityPactice( "Kim", "Bauer"));
            entityPracticeRepository.save(new EntityPactice( "David", "Palmer"));
            entityPracticeRepository.save(new EntityPactice( "Michelle", "Dessler"));
        };
    }*/
}