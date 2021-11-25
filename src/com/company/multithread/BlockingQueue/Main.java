package com.company.multithread.BlockingQueue;

public class Main {
    public static void  main (String[] args) throws InterruptedException {
    BlockingQueueImpl blockingQueue = new BlockingQueueImpl(5);

        new Thread(() -> {
            try {
                blockingQueue.enqueue(4);
                blockingQueue.enqueue(4);
                blockingQueue.enqueue(4);
                blockingQueue.enqueue(4);
                blockingQueue.enqueue(4);
                blockingQueue.enqueue(5);
                blockingQueue.dequeue();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                blockingQueue.dequeue();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();




    }
}
