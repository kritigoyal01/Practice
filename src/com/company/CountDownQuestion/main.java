package com.company.CountDownQuestion;

import com.company.FileProcessorQuestion.NewMain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class main {
    public static void main(String[] args) throws InterruptedException {

        List<String> news = Collections.synchronizedList(new ArrayList<>());
        CountDownLatch readyThreadCounter = new CountDownLatch(2);
        CountDownLatch callingThreadBlocker = new CountDownLatch(1);
        CountDownLatch completedThreadCounter = new CountDownLatch(2);
        List<Thread> workers = Stream
                .generate(() -> new Thread(new NewsFlash(
                        news, readyThreadCounter, callingThreadBlocker, completedThreadCounter)))
                .limit(2)
                .collect(toList());

        workers.forEach(Thread::start);
        readyThreadCounter.await();
        System.out.println("Workers ready");
        callingThreadBlocker.countDown();
        completedThreadCounter.await();
        System.out.println("Workers complete");
        news.stream().
                forEach(s->System.out.println(s));
        System.out.println("All news flashes");


    }
}
