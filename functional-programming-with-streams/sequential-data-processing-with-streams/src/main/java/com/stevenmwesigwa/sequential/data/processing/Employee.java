package com.stevenmwesigwa.sequential.data.processing;

import java.math.BigDecimal;

/**
 * A simple POJO class to play with.
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
public class Employee {

    private String firstname;
    private BigDecimal salary;

    /**
     *
     * @param firstname
     * @param salary
     */
    public Employee(String firstname, BigDecimal salary) {
        this.firstname = firstname;
        this.salary = salary;
    }

    /**
     *
     * @return firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     *
     * @return salary
     */
    public BigDecimal getSalary() {
        return salary;
    }
}
