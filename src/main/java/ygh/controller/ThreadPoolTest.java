package ygh.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest extends Thread{
    public void run(){
        System.out.println("时间："+new SimpleDateFormat("yyyy-MM-dd HH:mm:dd").format(new Date()));
    }

    public static void main(String[] args) throws Exception{
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:dd").format(new Date()));
        ThreadPoolTest test=new ThreadPoolTest();
        ScheduledExecutorService executorService=new ScheduledThreadPoolExecutor(5);
        executorService.scheduleAtFixedRate(test,20,10, TimeUnit.SECONDS);
        //Thread.sleep(10000);
        //executorService.shutdown();
    }
}
