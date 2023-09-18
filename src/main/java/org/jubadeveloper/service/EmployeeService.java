package org.jubadeveloper.service;

import org.jubadeveloper.entitie.Employee;
import org.jubadeveloper.respository.EmployeeRepository;
import org.jubadeveloper.service.models.EmployeeServiceModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.jubadeveloper.service.error.*;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements EmployeeServiceModel {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> fetch() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee create(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee get(Long id) throws EmployeeNotFound {
        return employeeRepository.findById(id).orElseThrow(() -> new EmployeeNotFound(id));
    }
    @Override
    public Employee update(Long id, Employee newEmployee) {
        return employeeRepository.findById(id).map(employee -> {
            employee.setName(newEmployee.getName());
            return employeeRepository.save(employee);
        }).orElseGet(() -> {
            newEmployee.setId(id);
            return employeeRepository.save(newEmployee);
        });
    }
    @Override
    public Employee delete(Long id) throws EmployeeNotFound {
        return employeeRepository.findById(id).map(employee1 -> {
            employeeRepository.delete(employee1);
            return employee1;
        }).orElseThrow(() -> new EmployeeNotFound(id));
    }
}
