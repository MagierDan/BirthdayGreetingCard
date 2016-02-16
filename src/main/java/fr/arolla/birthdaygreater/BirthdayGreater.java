package fr.arolla.birthdaygreater;

import java.util.Date;

/**
 * Created by Dan on 11/02/2016.
 */
public class BirthdayGreater {


    private EmployeeRepository employeeRepository;
    private MailService mailService;

    public BirthdayGreater(EmployeeRepository employeeRepository, MailService mailService) {
        this.employeeRepository = employeeRepository;
        this.mailService = mailService;
    }

    public void sendGreetingsToEmployees(Date date) {

    }
}
