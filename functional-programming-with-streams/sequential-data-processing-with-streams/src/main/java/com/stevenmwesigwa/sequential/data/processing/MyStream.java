package com.stevenmwesigwa.sequential.data.processing;

import java.util.stream.Stream;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
public class MyStream {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        Stream<String> studentNames = Stream.of("Jimmie Foxx", "Samuel L. Jackson", "Sandra Bullock", "Keanu Reeves");
        
        studentNames.forEach(System.out::println);
    }
    
}
