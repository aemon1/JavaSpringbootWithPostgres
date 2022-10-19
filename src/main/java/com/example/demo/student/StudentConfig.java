package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner( StudentRepository repository) {
        return args -> {
            Student sara = new Student(
                    "Sara",
                    "sara@gmail.com",
                    LocalDate.of(1998, Month.JANUARY, 12)
            );
            Student aliza = new Student(
                    "Aliza",
                    "aliza@gmail.com",
                    LocalDate.of(2004, Month.FEBRUARY, 17)
            );

            repository.saveAll(List.of(sara, aliza));
        };
    }
}
