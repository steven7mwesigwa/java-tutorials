package com.stevenmwesigwa.java.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
public class OptionalOfNullable {

    public static void main(String[] args) {
        Function<String, String> getSecondColumn
                = s -> s.split(",")[1].trim().length() > 0 ? s.split(",")[1] : null;

        List<String> linesFromCSV = new ArrayList<>();
        linesFromCSV.add("1,java,james gosling");
        linesFromCSV.add("2,c++,bjarne stroustrup");
        linesFromCSV.add("3,,steven mwesigwa");
        linesFromCSV.add("4,javascript,brendan eich");
        linesFromCSV.add("5,python,guido van rossum");

        linesFromCSV.stream()
                .map(e -> Optional.ofNullable(getSecondColumn.apply(e)))
                .filter(e->e.isPresent())
                .forEach(e->System.out.println(e.get().toUpperCase()));

    }
}
