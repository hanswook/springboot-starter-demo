package com.hans.spingbootDemo.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

@Component
public class AsyncTask {

//    @Async
    public Future<Boolean> doTask1() throws Exception {
        long start = System.currentTimeMillis();
        Thread.sleep(1000);
        long end = System.currentTimeMillis();
        System.out.println("start:" + start + ",end:" + end + ",任务1耗时:" + (end - start) + "毫秒");
        return new AsyncResult<>(true);
    }

//    @Async
    public Future<Boolean> doTask2() throws Exception {
        long start = System.currentTimeMillis();
        Thread.sleep(700);
        long end = System.currentTimeMillis();
        System.out.println("start:" + start + ",end:" + end + ",任务2耗时:" + (end - start) + "毫秒");
        return new AsyncResult<>(true);
    }

//    @Async
    public Future<Boolean> doTask3() throws Exception {
        long start = System.currentTimeMillis();
        Thread.sleep(500);
        long end = System.currentTimeMillis();
        System.out.println("start:" + start + ",end:" + end + ",任务3耗时:" + (end - start) + "毫秒");
        return new AsyncResult<>(true);
    }


}
