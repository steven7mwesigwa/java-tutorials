package com.stevenmwesigwa.allargsconstructor.demo5;

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
        Person person1 = new Person("Steven", "Mwesigwa");
        Person person2 = new Person("Steven", "Mwesigwa", "123-45-6789");
        System.out.println("Print below person : 1 - uses our Custom Constructor");
        System.out.println(person1);
        System.out.println("Print below person : 2 - uses @AllArgsConstructor");
        System.out.println(person2);
    }
}
