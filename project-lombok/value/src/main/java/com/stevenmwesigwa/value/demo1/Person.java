package com.stevenmwesigwa.value.demo1;

import java.util.Objects;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
public final class Person {

    private final String firstname;
    private final String lastname;
    private final String ssn;

    /**
     *
     * @param firstname
     * @param lastname
     * @param ssn
     */
    public Person(final String firstname, final String lastname, final String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
    }

    /**
     *
     * @return
     */
    public String getFirstname() {
        return this.firstname;
    }

    /**
     *
     * @return
     */
    public String getLastname() {
        return this.lastname;
    }

    /**
     *
     * @return
     */
    public String getSsn() {
        return this.ssn;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.firstname);
        hash = 43 * hash + Objects.hashCode(this.lastname);
        hash = 43 * hash + Objects.hashCode(this.ssn);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (!Objects.equals(this.firstname, other.firstname)) {
            return false;
        }
        if (!Objects.equals(this.lastname, other.lastname)) {
            return false;
        }
        if (!Objects.equals(this.ssn, other.ssn)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Person{" + "firstname=" + firstname + ", lastname=" + lastname + ", ssn=" + ssn + '}';
    }

}
