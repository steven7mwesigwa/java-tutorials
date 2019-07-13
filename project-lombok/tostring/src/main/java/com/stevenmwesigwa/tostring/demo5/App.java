package com.stevenmwesigwa.tostring.demo5;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
public class App {

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Steven");
        person.setLastName("Mwesigwa");

        System.out.println(person);
    }
}
