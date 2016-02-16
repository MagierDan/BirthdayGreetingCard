package fr.arolla.birthdaygreater;

import org.junit.Test;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Dan on 11/02/2016.
 */
public class GreetingTest {

    @Test(expected = IllegalArgumentException.class)
    public void should_return_an_error_when_greeting_a_null_employee() {
        // given
        Employee employee = null;
        Greetings greetings = new Greetings(employee);

        // when
        String greetingMessage = greetings.generateGreetingText();
    }

    @Test
    public void should_generate_a_valid_greetings() {
        // given
        Employee dan = new Employee("Dan", "Magier", "dan.magier@gmail.com", new Date());
        Greetings greetings = new Greetings(dan);

        // when
        String greetingMessage = greetings.generateGreetingText();
        String recipientEmailAddress = greetings.getRecipientEmailAddress();
        String subject = greetings.getEmailSubject();

        // then
        assertThat(greetingMessage).isEqualTo("Happy birthday my dear Dan Magier");
        assertThat(recipientEmailAddress).isEqualTo("dan.magier@gmail.com");
        assertThat(subject).isEqualTo("We have a message for you !");
    }

}
