package efo.springboot.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApplication {

    public static void main(String[] args) {
        //1.set up default configuration
        //2.start Spring application context
        //3.performs class path scan
        //4.starts tomcat server
        SpringApplication.run(CourseApiApplication.class, args);
    }
}
