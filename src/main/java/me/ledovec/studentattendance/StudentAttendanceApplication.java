package me.ledovec.studentattendance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@SpringBootApplication
public class StudentAttendanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentAttendanceApplication.class, args);
    }

}
