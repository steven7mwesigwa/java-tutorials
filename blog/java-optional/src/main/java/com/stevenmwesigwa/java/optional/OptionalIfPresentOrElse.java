package com.stevenmwesigwa.java.optional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
public class OptionalIfPresentOrElse {

    public static void main(String[] args) {
        List<Attendee> attendees = new ArrayList<>();
        attendees.add(new Attendee("trisha", "gee", new BigDecimal(300)));
        attendees.add(new Attendee("steven", "mwesigwa", null));
        attendees.add(new Attendee("arun", "gupta", new BigDecimal(200)));
        attendees.add(new Attendee("daniel", "cukier", null));
        attendees.add(new Attendee("vlad", "mihalcea", new BigDecimal(150)));

    AtomicInteger totalPaidAttendees = new AtomicInteger(0);
    AtomicInteger totalNotPaidAttendees = new AtomicInteger(0);

        Consumer<Integer> consumer = i -> totalPaidAttendees.incrementAndGet();
        Runnable runnable = () -> totalNotPaidAttendees.incrementAndGet();
        attendees.stream()
                .map(e -> Optional.ofNullable(e.getAttendanceFee()).ifPresentOrElse(consumer,runnable));
//                .forEach(System.out::println);
    }
}
