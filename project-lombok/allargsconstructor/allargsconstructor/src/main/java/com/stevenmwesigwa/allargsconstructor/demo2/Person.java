package com.stevenmwesigwa.allargsconstructor.demo2;

import lombok.AllArgsConstructor;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
@AllArgsConstructor
public class Person {

    private String firstname;
    private String lastname;
    private final int numberOfLegs = 2;

}
