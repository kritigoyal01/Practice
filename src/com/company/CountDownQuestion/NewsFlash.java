package com.company.CountDownQuestion;

import java.util.List;
import java.util.concurrent.CountDownLatch;

public class NewsFlash implements Runnable{
    List<String> news;
    private CountDownLatch readyCounter;
    private  CountDownLatch callingBlocker;
    private CountDownLatch finishedCounter;

    public NewsFlash(List<String> news, CountDownLatch readyCounter, CountDownLatch callingBlocker, CountDownLatch finishedCounter) {
        this.news = news;
        this.readyCounter = readyCounter;
        this.callingBlocker = callingBlocker;
        this.finishedCounter = finishedCounter;
    }

    @Override
    public void  run(){
        readyCounter.countDown();
        try
        {
            callingBlocker.await();
            //Thread.sleep(100);
            news.add(Thread.currentThread().getName());
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        finally {
            finishedCounter.countDown();
        }
    }

}
