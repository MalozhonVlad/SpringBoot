//package com.example.demo.activeMQ.jsonActiveMQ;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.jms.annotation.JmsListener;
//import org.springframework.messaging.handler.annotation.SendTo;
//import org.springframework.stereotype.Component;
//
//@Component
//@Slf4j
//public class ActiveMQConsumer {
//
////    @JmsListener(destination = "superqueue")
////    public void procesMesseges(String message){
////        log.info("Received: " + message);
////    }
//
//      @JmsListener(destination = "superqueue")
//      @SendTo("superqueue-answer")// отправляет ответ в очерель superqueue-answer но нам надо зделать return !!!
//      public String processClick(Click click){
//          log.info("Receive: " + click);
//          return "I got: " + click.getName();
//      }
//
//
//
//}
//
