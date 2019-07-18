package com.stevenmwesigwa.nonnull.demo1;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
public class App {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Person person = new Person("Steven", "Mwesigwa", null);
        System.out.println(person);
    }
}
