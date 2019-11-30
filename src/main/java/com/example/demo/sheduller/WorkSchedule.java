package com.example.demo.sheduller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class WorkSchedule {

    static int i = 1;

//    @Scheduled(initialDelay = 1000,fixedDelayString = "${schedule.work}")
//    @Scheduled(cron = "*/5 * * * * ?")
//    public void runFirst() throws InterruptedException {
//        System.out.println("First Start: " + ++i);
//        Thread.sleep(5000);
//        System.out.println("First finish: " + i);
//    }
//
//    @Scheduled(fixedRate = 5000)
//    public void runSecond() throws InterruptedException {
//        System.out.println("Second Start: " + ++i);
//        Thread.sleep(6000);
//        System.out.println("Second Finish: " + i);
//    }
}
