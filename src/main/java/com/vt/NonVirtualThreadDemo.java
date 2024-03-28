package com.vt;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Example to execute calculateSum method using Platform Thread
 */
public class NonVirtualThreadDemo {

    static final int MAX_THREADS = 10;

    public static void main(String[] args) {
        for (int i = 0; i < MAX_THREADS; i++) {
            new Thread(NonVirtualThreadDemo::calculateSum).start();
        }
    }

    /**
     * Method that prints the sum of two randomly generated integers.
     */
    public static void calculateSum() {
        try {

            int firstNum = ThreadLocalRandom.current().nextInt(0, 20);
            int secondNum = ThreadLocalRandom.current().nextInt(0, 20);
            System.out.println("Starting calculation for firstNum: " + firstNum + " and secondNum: " + secondNum + ", using thread: " + Thread.currentThread());

            int result = firstNum + secondNum;
            Thread.sleep(500);
            System.out.println("result is : " + result + " calculated using thread: " + Thread.currentThread());

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
