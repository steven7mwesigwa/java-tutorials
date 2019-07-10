package com.stevenmwesigwa.equalsandhashcode.demo1;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
public class App {

    public static void main(String[] args) {
        Person obj1 = new Person();
        obj1.setFirstName("Steven");
        Person obj2 = new Person();
        obj2.setFirstName("Steven");
        Person obj3 = new Person();
        obj3.setFirstName("Peter");

        String firstMessage = obj1.equals(obj2) ? "obj1 is equal to obj2" : "obj1 is NOT equal to obj2";
        System.out.println(firstMessage);
        String secondMessage = obj1.equals(obj3) ? "obj1 is equal to obj3" : "obj1 is NOT equal to obj3";
        System.out.println(secondMessage);
    }    
}
