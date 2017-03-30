package efo.springboot.starter.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import efo.springboot.starter.Topic.Topic;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;


/**
 * ${VERSION}
 * Created by jack on 2017/3/30
 */
@Service
public class RabbitMqReceiver {
    @RabbitListener(queues = "queue")
    public void processMessage(Message message){
        System.out.println("receive message:"+ message.getPayload());


//        try{
//        ObjectMapper mapper= new ObjectMapper();
//        System.out.printf(mapper.writeValueAsString(topic));
//        }catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }

    }
}
