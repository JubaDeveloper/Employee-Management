package org.jubadeveloper.service.models;


import org.jubadeveloper.entitie.Employee;
import org.jubadeveloper.service.error.EmployeeNotFound;

import java.util.List;
import java.util.Optional;

public interface EmployeeServiceModel {
    List<Employee> fetch();
    Employee create (Employee employee);
    Employee get(Long id) throws EmployeeNotFound;
    Employee delete(Employee employee) throws EmployeeNotFound;
    Employee update(Long id, Employee newEmployee);
}
