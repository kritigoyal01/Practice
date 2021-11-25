package com.company.multithread.BlockingQueue;

import java.util.ArrayList;
import java.util.List;

public class BlockingQueueImpl {
        private List queue = new ArrayList();
        private int limit = 10;
        public BlockingQueueImpl(int limit) {
            this.limit = limit;
        }
        public synchronized void enqueue(Object item) throws InterruptedException {
            while (this.queue.size() == this.limit) {
                System.out.println("Max value reached ----In Waiting:" +item);
                wait();
            }
            if (this.queue.size() == 0) {
                System.out.println("Notification send to queue is empty:" +item);
                notifyAll();
            }
            System.out.println("Item added successfully :" +item);
            this.queue.add(item);
        }
        public synchronized Object dequeue() throws InterruptedException {
            while (this.queue.size() == 0) {
                System.out.println("Queue is empty:No element to deque");
                wait();
            }
            if (this.queue.size() == this.limit) {
                System.out.println("Can remove: Limit reached" );
                notifyAll();
            }
            System.out.println("Element removed:");
            return this.queue.remove(0);
        }
}