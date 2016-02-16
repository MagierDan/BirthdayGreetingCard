package fr.arolla.birthdaygreater;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Dan on 11/02/2016.
 */
public class BirthdayGreaterTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @Mock
    private MailService mailService;


    @Test
    public void should_call_mail_service() {
        // given
        List<Employee> employees = new ArrayList<Employee>();
        Employee max = new Employee("Maximilien", "TYC", "maximilien.tyc@gmail.com", new Date());
        employees.add(max);
        Mockito.when(employeeRepository.findEmployeByDate(2, 11)).thenReturn(employees);


        // when
        // MailService mailServiceSpy = Mockito.spy(MailService.class);
        BirthdayGreater birthdayGreater = new BirthdayGreater(employeeRepository, mailService);

        Greetings greeting = new Greetings(max);
        birthdayGreater.sendGreetingsToEmployees(new Date());

        // then
        Mockito.verify(mailService, Mockito.times(1)).sendEmail(greeting);
    }

}

