package com.stevenmwesigwa.java.optional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
public class OptionalIsPresent {

    public static void main(String[] args) {
        List<Attendee> attendees = new ArrayList<>();
        attendees.add(new Attendee("trisha", "gee", new BigDecimal(300)));
        attendees.add(new Attendee("steven", "mwesigwa", null));
        attendees.add(new Attendee("arun", "gupta", new BigDecimal(200)));
        attendees.add(new Attendee("daniel", "cukier", null));
        attendees.add(new Attendee("vlad", "mihalcea", new BigDecimal(150)));

        attendees.stream()
                .filter(e -> Optional.ofNullable(e.getAttendanceFee()).isPresent())
                .forEach(e -> System.out.println(e.getFirstname() + " " + e.getLastname()));
    }
}
