package com.stevenmwesigwa.filter.stream.elements;

import java.util.stream.Stream;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
public class Distinct {

	public static void main(String[] args) {

		Stream<String> compSciCourses = Stream.of("Artificial Language", "Analysis of Algorithms",
				"Artificial Language", "Analysis of Algorithms", "Hardware Systems");

		compSciCourses.distinct().forEach(System.out::println);
		
	}
}
