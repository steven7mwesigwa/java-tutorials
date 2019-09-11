package com.stevenmwesigwa.sequential.data.processing;

import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
public class MyIterator {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        Iterator<String> studentNames = Arrays.asList("Jimmie Foxx", "Samuel L. Jackson", "Sandra Bullock", "Keanu Reeves").iterator();
        
        while (studentNames.hasNext()) {
            System.out.println(studentNames.next());
        }
    }

}
