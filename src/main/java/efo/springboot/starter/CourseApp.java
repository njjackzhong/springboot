package efo.springboot.starter;

import jdk.nashorn.internal.runtime.logging.Logger;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableRabbit
@EnableScheduling
@Logger()
public class CourseApp {




    public static void main(String[] args) {

        //1.set up default configuration
        //2.start Spring application context
        //3.performs class path scan
        //4.starts tomcat server
//        SpringApplication app = new SpringApplication(CourseApp.class);
//        app.addListeners(new CourseAppListener());
//        app.run(args);
        SpringApplication.run(CourseApp.class, args);
    }
}
