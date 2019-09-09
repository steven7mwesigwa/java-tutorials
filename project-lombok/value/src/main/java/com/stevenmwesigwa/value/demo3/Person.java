package com.stevenmwesigwa.value.demo3;

import lombok.Value;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
@Value(staticConstructor="of")
public class Person {

    String firstname;
    String lastname;
    String ssn;
}
