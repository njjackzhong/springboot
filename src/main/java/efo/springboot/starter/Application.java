package efo.springboot.starter;

import efo.springboot.starter.util.RabbitMqReceiver;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class Application {
    @Autowired
    RabbitMqReceiver mqReceiver;

    public static void main(String[] args) {
        //1.set up default configuration
        //2.start Spring application context
        //3.performs class path scan
        //4.starts tomcat server
        SpringApplication.run(Application.class, args);
    }


}
