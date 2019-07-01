package com.stevenmwesigwa.synchronizedkeyword;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
public class App {

    private int count = 0;

    public static void main(String[] args) {
        App app = new App();
        app.doWork();
    }

    private synchronized void increment() {
        count++;
    }

    public void doWork() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
//                    count++;
                    increment();
                }
            }

        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
//                    count++
                    increment();
                }
            }

        });

        t1.start();
        t2.start();

        System.out.println("Count is " + count);
    }

}
