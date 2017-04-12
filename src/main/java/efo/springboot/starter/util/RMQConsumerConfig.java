package efo.springboot.starter.util;

import org.springframework.amqp.core.AcknowledgeMode;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListenerConfigurer;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.RabbitListenerEndpointRegistrar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.converter.MappingJackson2MessageConverter;
import org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory;

/**
 * Created by JackLee on 2017/4/12.
 * A generic message config
 *
 * @author Mark Fisher
 * @author Arjen Poutsma
 * @see org.springframework.messaging.support.MessageBuilder
 * @since 4.0
 */
@Configuration
@EnableRabbit
public class RMQConsumerConfig implements RabbitListenerConfigurer {

    private final RMQReceiver mqReceiver;

    @Autowired
    public RMQConsumerConfig(RMQReceiver mqReceiver) {
        this.mqReceiver = mqReceiver;
    }

    @Bean
    public DefaultMessageHandlerMethodFactory customerHandlerMethodFactory() {
        DefaultMessageHandlerMethodFactory factory = new DefaultMessageHandlerMethodFactory();
        factory.setMessageConverter(new MappingJackson2MessageConverter());
        return factory;
    }

    @Bean
    public SimpleRabbitListenerContainerFactory rabbitListenerContainerFactory(ConnectionFactory connectionFactory) {
        SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory);
        // factory.setPrefetchCount(5);
        factory.setAcknowledgeMode(AcknowledgeMode.AUTO);
        return factory;
    }

    @Override
    public void configureRabbitListeners(RabbitListenerEndpointRegistrar registrar) {
        registrar.setMessageHandlerMethodFactory(customerHandlerMethodFactory());
    }


}
