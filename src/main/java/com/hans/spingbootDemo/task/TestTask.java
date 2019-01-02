package com.hans.spingbootDemo.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class TestTask {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss.SSS");

//    @Scheduled(fixedRate = 3000)
//    @Scheduled(cron = "4-40 * * * * ?")
    public void reportCurrentTime() {
        System.out.println("now time:" + dateFormat.format(new Date()));
    }
}
