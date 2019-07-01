package com.stevenmwesigwa.threadsynchronization;

import java.util.Scanner;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
class Processor extends Thread {

    private volatile boolean running = true;

    @Override
    public void run() {
        while (true) {
            System.out.println("Hello");

            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void shutdown() {
        running = false;
    }

}

public class App {

    public static void main(String[] args) {
        Processor proc1 = new Processor();
        proc1.start();

        System.out.println("Press return to stop...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        proc1.shutdown();

    }
}
