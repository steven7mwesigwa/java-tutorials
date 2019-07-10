package com.stevenmwesigwa.gettersetter.demo2;

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
        person.setFirstname("Steven");
        person.setLastname("Mwesigwa");

        System.out.println("My name is " + person.getFirstname() + " " + person.getLastname() + ".");
    }    
}
