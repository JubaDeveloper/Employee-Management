package org.jubadeveloper.controller;

import org.jubadeveloper.entitie.Employee;
import org.jubadeveloper.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired EmployeeService employeeService;
    @GetMapping("/employee")
    public List<Employee> getEmployees () {
        return employeeService.fetch();
    }
}
