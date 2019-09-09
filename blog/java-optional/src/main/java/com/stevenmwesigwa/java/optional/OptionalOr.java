package com.stevenmwesigwa.java.optional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
public class OptionalOr {

    public static void main(String[] args) {
        List<Attendee> attendees = new ArrayList<>();
        attendees.add(new Attendee("trisha", "gee", new BigDecimal(300)));
        attendees.add(new Attendee("steven", "mwesigwa", null));
        attendees.add(new Attendee("arun", "gupta", new BigDecimal(200)));
        attendees.add(new Attendee("daniel", "cukier", null));
        attendees.add(new Attendee("vlad", "mihalcea", new BigDecimal(150)));

        Supplier<Optional<BigDecimal>> defaultAttendanceFee = () -> Optional.of(BigDecimal.ZERO);

        attendees.stream()
                .map(e -> Optional.ofNullable(e.getAttendanceFee()).or(defaultAttendanceFee))
                .forEach(System.out::println);
    }
}
