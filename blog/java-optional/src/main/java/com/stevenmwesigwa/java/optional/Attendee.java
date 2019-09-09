package com.stevenmwesigwa.java.optional;

import java.math.BigDecimal;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
public class Attendee {
    private String firstname; 
    private String lastname; 
    private BigDecimal attendanceFee;

    public Attendee(String firstname, String lastname, BigDecimal attendanceFee) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.attendanceFee = attendanceFee;
    }

    public BigDecimal getAttendanceFee() {
        return attendanceFee;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
    
    


    
    
}
