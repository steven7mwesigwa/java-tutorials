package com.stevenmwesigwa.sequential.data.processing;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
public class MyList {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
       final List<String> studentNames = Arrays.asList("Jimmie Foxx", "Samuel L. Jackson", "Sandra Bullock", "Keanu Reeves");
        
        for (String studentName : studentNames) {
            System.out.println(studentName);
        }
    }

}
