package com.stevenmwesigwa.first.lambda.expression;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
public class NoParameters {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println("I am a Runnable {r}!!");
        };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(() -> {
            System.out.println("I am a Runnable {t2}!!");
        });
        Thread t3 = new Thread(() -> System.out.println("I am a Runnable {t3}!!"));

        t1.run();
        t2.run();
        t3.run();
    }
}
