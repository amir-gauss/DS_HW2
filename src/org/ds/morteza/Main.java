package org.ds.morteza;

import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String... args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

        Producer p = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();
    }

}
