package com.creswave.ecare.Student.Students;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.swing.text.html.ListView;
import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student mariam = new Student(
                    "marima",
                    "mariam@gmail.com",
                    LocalDate.of(1998,6,10)

            );
            Student Alex= new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(1990,6,10)

            );
            repository.saveAll(
                    List.of(mariam,Alex)
            );
        };
    }
}
