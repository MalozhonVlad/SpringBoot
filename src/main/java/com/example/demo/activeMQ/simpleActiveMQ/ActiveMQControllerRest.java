//package com.example.demo.activeMQ.simpleActiveMQ;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jms.core.JmsTemplate;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/active")
//public class ActiveMQControllerRest {
//
//    @Autowired
//    private JmsTemplate jmsTemplate;
//
//    @GetMapping(value = "/send/{message}", produces = "text/html")
//    public String sendMessage(@PathVariable("message") String message){
//        jmsTemplate.convertAndSend("superqueue",message); // superqueue - создастся очередь с таким именем !!!
//        return "done";
//    }
//
//}
