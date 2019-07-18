package com.stevenmwesigwa.nonnull.demo2;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
public class Person {

    private String firstname;
    private String lastname;
    private String ssn;

    /**
     *
     * @param firstname
     * @param lastname
     * @param ssn
     */
    public Person(String firstname, String lastname, String ssn) {
        if (ssn == null) {
            throw new NullPointerException("ssn is marked @NonNull but is null");
        }
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "Person{" + "firstname=" + firstname + ", lastname=" + lastname + ", ssn=" + ssn + '}';
    }

}
