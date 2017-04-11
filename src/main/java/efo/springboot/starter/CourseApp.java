package efo.springboot.starter;

import efo.springboot.starter.core.CourseAppListener;
import efo.springboot.starter.util.RabbitMqReceiver;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

@SpringBootApplication
@EnableRabbit
public class CourseApp {


    @Autowired
    RabbitMqReceiver mqReceiver;

    public static void main(String[] args) {

        //1.set up default configuration
        //2.start Spring application context
        //3.performs class path scan
        //4.starts tomcat server
        SpringApplication app = new SpringApplication(CourseApp.class);
        app.addListeners(new CourseAppListener());
        app.run(args);
//        SpringApplication.run(CourseApp.class, args);
    }

    /**
     *
     */



}
