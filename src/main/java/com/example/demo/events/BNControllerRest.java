//package com.example.demo.events;
//
//import lombok.val;
//import org.springframework.context.event.EventListener;
//import org.springframework.http.MediaType;
//import org.springframework.scheduling.annotation.Async;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Set;
//import java.util.concurrent.CopyOnWriteArraySet;
//
//@RestController
//public class BNControllerRest {
//
//    private final Set<SseEmitter> subccriebers = new CopyOnWriteArraySet<>();
//
//    @RequestMapping(method = RequestMethod.GET, value = "/news-stream")
//    public SseEmitter events(){
//        val emitter = new SseEmitter();
//        subccriebers.add(emitter);
//
//        emitter.onTimeout(()-> subccriebers.remove(emitter));
//        emitter.onCompletion(()-> subccriebers.remove(emitter));
//        return emitter;
//    }
//
//
//    @Async
//    @EventListener
//    public void handleNews(BreakingNews breakingNews){
//        List<SseEmitter> deadEmitters = new ArrayList<>();
//        subccriebers.forEach(
//                emitter -> {
//                    try {
//                        emitter.send(breakingNews, MediaType.APPLICATION_JSON);
//                    }catch (Exception e){
//                        deadEmitters.add(emitter);
//                    }
//                }
//        );
//        subccriebers.removeAll(deadEmitters);
//    }
//
//}
