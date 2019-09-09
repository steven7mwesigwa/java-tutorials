package com.stevenmwesigwa.data.demo4;

import lombok.Data;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
@Data(staticConstructor="of")
public class Person {

    private String firstname;
    private String lastname;
}
