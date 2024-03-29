//package com.example.demo.rabbitMQ;
//
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.amqp.core.Binding;
//import org.springframework.amqp.core.BindingBuilder;
//import org.springframework.amqp.core.Queue;
//import org.springframework.amqp.core.TopicExchange;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//@Component
//@Slf4j
//public class Producer {
//
//    @Autowired
//    private RabbitTemplate rabbitTemplate;
//
//    /**
//     * забираем ети значения из application.properties
//     */
//    @Value("${rabbitmq.exchange}")
//    private String exchange;
//
//    @Value("${rabbitmq.routingkey}")
//    private String routingKey;
//
//    @Value("${rabbitmq.queue}")
//    private String queue;
//
//    @Bean
//    public Queue queue(){
//        return new Queue(queue,false);
//    }
//
//    @Bean
//    public TopicExchange exchange(){
//        return new TopicExchange(exchange);
//    }
//
//    @Bean
//    public Binding binding(Queue queue,TopicExchange topicExchange){
//        return BindingBuilder.bind(queue).to(topicExchange).with(routingKey);
//    }
//
//    static int i = 1;
//
//    @Scheduled(fixedDelay = 10000)
//    public void produce(){
//        i++;
//        log.info("counter: " + i);
//        rabbitTemplate.convertAndSend(exchange,routingKey,"counter: " + i);
//    }
//
//
//
//}
