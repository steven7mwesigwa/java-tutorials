package com.stevenmwesigwa.multiplelocks.demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
public class Worker {

    private Random random = new Random();
    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    public void main() {
        System.out.println("Starting");
        long start = System.currentTimeMillis();
        process();
        long end = System.currentTimeMillis();
        System.out.println("Time taken: " + (end - start));
        System.out.println("List1: " + list1.size() + " : List2: " + list2.size());
    }

    public void stageOne() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        list1.add(random.nextInt());
    }

    public void stageTwo() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        list2.add(random.nextInt());
    }

    public void process() {
        for (int i = 0; i < 1000; i++) {
            stageOne();
            stageTwo();
        }
    }

}
