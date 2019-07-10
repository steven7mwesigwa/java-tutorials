package com.stevenmwesigwa.gettersetter.demo1;

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
        Person person = new Person();
        person.setFirstName("Steven");
        person.setLastName("Mwesigwa");

        System.out.println("My name is " + person.getFirstName() + " " + person.getLastName() + ".");
    }

}
