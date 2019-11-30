//package com.example.demo.activeMQ.jsonActiveMQ;
//
//
//import lombok.val;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
//
//import java.util.Collections;
//
//@Configuration
//public class ActiveConfig {
//
//
//    /**
//     * конвертирует JSON в обьект и обратно !!!
//     * val - из ломбока можно создать обьект так !!! КРУТО !!!
//     * val - ету переменную нельзя переприсвоить !!!
//     */
//    @Bean
//    public MappingJackson2MessageConverter messageConverter() {
//        val messageConverter = new MappingJackson2MessageConverter();
//        messageConverter.setTypeIdPropertyName("content-type");
//        messageConverter.setTypeIdMappings(Collections.singletonMap("click", Click.class));
//        return messageConverter;
//    }
//}
