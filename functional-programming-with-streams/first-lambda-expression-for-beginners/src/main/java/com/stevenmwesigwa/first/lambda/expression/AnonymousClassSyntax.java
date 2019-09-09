package com.stevenmwesigwa.first.lambda.expression;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
public class AnonymousClassSyntax {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Comparator<Student> compByLength = new Comparator<Student>() {
            @Override
            public int compare(Student x, Student y) {
                return Integer.compare(x.getFirstname().length(), y.getFirstname().length());
            }
        };
        
        Student[] students = {new Student("Dimitri"), new Student("Sam"), new Student("Peter")};

        Arrays.sort(students, compByLength);

        for (Student student : students) {
            System.out.println(student.getFirstname());
        }
    }

}
