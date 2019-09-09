package com.stevenmwesigwa.java.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
public class NullPointerExceptionDemo {

    public static void main(String[] args) {
        Function<String, String> getSecondColumn
                = c -> c.split(",")[1].trim().length() > 0 ? c.split(",")[1] : null;

        Function<String, String> toUpperCase = e -> e.toUpperCase();

        List<String> linesFromCSV = new ArrayList<>();
        linesFromCSV.add("1,java,james gosling");
        linesFromCSV.add("2,c++,bjarne stroustrup");
        linesFromCSV.add("3,,steven mwesigwa");
        linesFromCSV.add("4,javascript,brendan eich");
        linesFromCSV.add("5,python,guido van rossum");

        linesFromCSV.stream()
                .map(e -> getSecondColumn.andThen(toUpperCase).apply(e))
                .forEach(System.out::println);

    }
}
