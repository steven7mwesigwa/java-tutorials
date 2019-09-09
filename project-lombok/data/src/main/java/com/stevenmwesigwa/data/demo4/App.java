package com.stevenmwesigwa.data.demo4;

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
        Person person = Person.of();
        person.setFirstname("Steven");
        person.setLastname("Mwesigwa");
        System.out.println(person);
    }
}
