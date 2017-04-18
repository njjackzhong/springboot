package efo.springboot.starter.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import efo.springboot.starter.Topic.Topic;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.messaging.Message;
import org.springframework.messaging.converter.StringMessageConverter;
import org.springframework.stereotype.Service;


/**
 * @author JackLee
 * @version  1.0
 * Created by jack on 2017/3/30
 */
@Service
public class RMQReceiver {
    @RabbitListener(queues = {"queue"})
    public void processMessage(Topic topic){
        System.out.println(String.format("receive message:%s", topic));

    }
}
