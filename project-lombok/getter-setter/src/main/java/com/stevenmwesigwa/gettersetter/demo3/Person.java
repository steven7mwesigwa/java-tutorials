package com.stevenmwesigwa.gettersetter.demo3;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
public class Person {

    @Getter
    @Setter
    private String firstname;
    @Setter(AccessLevel.PROTECTED)
    private String lastname;
}
