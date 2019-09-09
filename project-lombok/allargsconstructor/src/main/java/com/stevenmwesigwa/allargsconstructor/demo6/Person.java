package com.stevenmwesigwa.allargsconstructor.demo6;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class Person {

    private String firstname;
    private String lastname;

    @Override
    public String toString() {
        return "Person{" + "firstname=" + firstname + ", lastname=" + lastname + '}';
    }
}
