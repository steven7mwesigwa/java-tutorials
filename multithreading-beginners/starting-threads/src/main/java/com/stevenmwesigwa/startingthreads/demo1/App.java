package com.stevenmwesigwa.startingthreads.demo1;


/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */

class Runner extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
    

}

public class App {
    public static void main(String[] args) {
        Runner runner1 = new Runner();
        runner1.start();
        
        Runner runner2 = new Runner();
        runner2.start();
    
    } 
}
