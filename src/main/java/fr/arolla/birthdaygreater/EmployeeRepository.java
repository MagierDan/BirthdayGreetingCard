package fr.arolla.birthdaygreater;

import java.util.List;

/**
 * Created by Dan on 11/02/2016.
 */
public interface EmployeeRepository {

    public List<Employee> findEmployeByDate(int month, int day);
}
