package com.stevenmwesigwa.sequential.data.processing;

import java.math.BigDecimal;
import java.util.stream.Stream;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
public class StreamOpsPipelineExamp {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Stream<Employee> employees = Stream.of(new Employee("Juliet", new BigDecimal("5400")), new Employee("Kardashian", new BigDecimal("3800")), new Employee("Jessica", new BigDecimal("1200")), new Employee("Austin", new BigDecimal("10400")));

        employees.filter(e -> e.getSalary().compareTo(new BigDecimal("3800")) == 0 || e.getSalary().compareTo(new BigDecimal("3800")) == 1)
                .map(Employee::getFirstname)
                .sorted()
                .forEach(System.out::println);
    }
}
