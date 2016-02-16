package fr.arolla.birthdaygreater;

/**
 * Created by Dan on 11/02/2016.
 */
public class Greetings {

    private final Employee employee;

    public Greetings(final Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public String generateGreetingText() {
        if (getEmployee() == null) {
            throw new IllegalArgumentException("Employee cannot be null");
        }

        return "Happy birthday my dear " + getEmployee().getFirstName() + " " + getEmployee().getLastName();
    }


    public String getRecipientEmailAddress() {
        return employee.getMail();
    }


    public String getEmailSubject() {
        return "We have a message for you !";
    }
}
