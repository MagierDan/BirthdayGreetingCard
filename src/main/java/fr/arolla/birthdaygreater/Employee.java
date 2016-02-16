package fr.arolla.birthdaygreater;

import java.util.Date;

/**
 * Created by Dan on 11/02/2016.
 */
public class Employee {

    private final String firstName;
    private final String lastName;
    private final String mail;

    public Employee(final String firstName, final String lastName, final String mail, final Date birthdate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMail() {
        return mail;
    }

}
