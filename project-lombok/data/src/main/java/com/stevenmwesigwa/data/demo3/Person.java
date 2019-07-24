package com.stevenmwesigwa.data.demo3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
@AllArgsConstructor
@ToString(includeFieldNames = false)
@Data
public class Person {

    private String firstname;
    private String lastname;
}
