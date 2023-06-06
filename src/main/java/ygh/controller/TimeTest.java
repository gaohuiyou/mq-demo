package ygh.controller;

import java.util.concurrent.CountDownLatch;

public class TimeTest {

    //待测试方法
    public void cyclic() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getId() + "---" + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int nThread = 100;
        final CountDownLatch startGate = new CountDownLatch(1);
        final CountDownLatch endGate = new CountDownLatch(nThread);

        TimeTest timeTest = new TimeTest();
        for (int i = 0; i < nThread; i++) {
            Thread t = new Thread(() -> {
                try {
                    startGate.await();
                    try {
                        timeTest.cyclic();
                    } finally {
                        endGate.countDown();
                    }
                } catch (InterruptedException ignored) {
                }
            });
            t.start();
        }

        long start = System.nanoTime();
        startGate.countDown();
        endGate.await();
        long end = System.nanoTime();
        System.out.println("耗时：" + (end - start));

    }
}
